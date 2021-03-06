package cn.swm.common.shiro;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MyPermissionFilter extends AuthorizationFilter {

    private static final Logger log= LoggerFactory.getLogger(MyPermissionFilter.class);

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object o) throws Exception {

        System.out.println("在isAccessAllowed方法中了-request="+request.toString()+"--response="+response.toString()+"--o="+ Arrays.toString((String[])o));

        Subject subject = this.getSubject(request,response);

        String[] perms = (String[]) ((String[]) o);

        boolean isPermitted = true;

        if(subject.getPrincipals() == null){
            if(FilterUtil.isAjax(request)){
                log.info("未登录或登录时间过长,是ajax！");
                Map<String,Object> resultMap = new HashMap<>();
                resultMap.put("success",false);
                resultMap.put("message","您还未登录或登录时间过长,请重新登录！");
                FilterUtil.out(response,resultMap);
            }else {
                log.info("未登录或登录时间过长,不是ajax！");
                this.saveRequestAndRedirectToLogin(request,response);
            }
        }else {
            if(perms!=null && perms.length>0){
                if(perms.length==1){
                    if(!subject.isPermitted(perms[0])){
                        isPermitted=false;
                    }
                }else if(!subject.isPermittedAll(perms)){
                    isPermitted=false;
                }
            }
            if(!isPermitted){
                if(FilterUtil.isAjax(request)){
                    log.info("没有该权限，并且是Ajax请求");
                    Map<String,Object> resultMap = new HashMap<>();
                    resultMap.put("success",false);
                    resultMap.put("message","抱歉，您没有该权限！看就看，你点它干什么...");
                    FilterUtil.out(response,resultMap);
                }else {
                    return isPermitted;
                }
            }
        }
        return isPermitted;
    }
}
