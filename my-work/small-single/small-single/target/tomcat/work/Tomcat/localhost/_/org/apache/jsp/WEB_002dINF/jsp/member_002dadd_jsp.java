/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-03-30 14:27:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class member_002dadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!--_meta 作为公共模版分离出去-->\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\" />\r\n");
      out.write("    <meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n");
      out.write("    <link rel=\"Bookmark\" href=\"/icon/favicon.ico\" >\r\n");
      out.write("    <link rel=\"Shortcut Icon\" href=\"/icon/favicon.ico\" />\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"lib/html5shiv.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"lib/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui/css/H-ui.min.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui.admin/css/H-ui.admin.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"lib/Hui-iconfont/1.0.8/iconfont.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui.admin/skin/default/skin.css\" id=\"skin\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui.admin/css/style.css\" />\r\n");
      out.write("    <!--[if IE 6]>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"lib/DD_belatedPNG_0.0.8a-min.js\" ></script>\r\n");
      out.write("    <script>DD_belatedPNG.fix('*');</script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <!--/meta 作为公共模版分离出去-->\r\n");
      out.write("\r\n");
      out.write("    <title>添加用户 - H-ui.admin v3.1</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<article class=\"page-container\">\r\n");
      out.write("    <form action=\"/member/add\" method=\"POST\" class=\"form form-horizontal\" id=\"form-member-add\">\r\n");
      out.write("        <div class=\"row cl\">\r\n");
      out.write("            <label class=\"form-label col-xs-4 col-sm-3\"><span class=\"c-red\">*</span>用户名：</label>\r\n");
      out.write("            <div class=\"formControls col-xs-8 col-sm-9\">\r\n");
      out.write("                <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"username\" name=\"username\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row cl\">\r\n");
      out.write("            <label class=\"form-label col-xs-4 col-sm-3\"><span class=\"c-red\">*</span>设置密码：</label>\r\n");
      out.write("            <div class=\"formControls col-xs-8 col-sm-9\">\r\n");
      out.write("                <input type=\"password\" class=\"input-text\" autocomplete=\"off\" value=\"\" placeholder=\"\" id=\"password\" name=\"password\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row cl\">\r\n");
      out.write("            <label class=\"form-label col-xs-4 col-sm-3\"><span class=\"c-red\">*</span>确认密码：</label>\r\n");
      out.write("            <div class=\"formControls col-xs-8 col-sm-9\">\r\n");
      out.write("                <input type=\"password\" class=\"input-text\" autocomplete=\"off\"  placeholder=\"\" id=\"password2\" name=\"password2\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row cl\">\r\n");
      out.write("            <label class=\"form-label col-xs-4 col-sm-3\"><span class=\"c-red\">*</span>性别：</label>\r\n");
      out.write("            <div class=\"formControls col-xs-8 col-sm-9 skin-minimal\">\r\n");
      out.write("                <div class=\"radio-box\">\r\n");
      out.write("                    <input name=\"sex\" value=\"男\" type=\"radio\" id=\"sex-1\" checked>\r\n");
      out.write("                    <label for=\"sex-1\">男</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"radio-box\">\r\n");
      out.write("                    <input type=\"radio\" id=\"sex-2\" name=\"sex\" value=\"女\">\r\n");
      out.write("                    <label for=\"sex-2\">女</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"radio-box\">\r\n");
      out.write("                    <input type=\"radio\" id=\"sex-3\" name=\"sex\" value=\"保密\">\r\n");
      out.write("                    <label for=\"sex-3\">保密</label>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row cl\">\r\n");
      out.write("            <label class=\"form-label col-xs-4 col-sm-3\"><span class=\"c-red\">*</span>手机：</label>\r\n");
      out.write("            <div class=\"formControls col-xs-8 col-sm-9\">\r\n");
      out.write("                <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"phone\" name=\"phone\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row cl\">\r\n");
      out.write("            <label class=\"form-label col-xs-4 col-sm-3\"><span class=\"c-red\">*</span>邮箱：</label>\r\n");
      out.write("            <div class=\"formControls col-xs-8 col-sm-9\">\r\n");
      out.write("                <input type=\"text\" class=\"input-text\" placeholder=\"@\" name=\"email\" id=\"email\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row cl\">\r\n");
      out.write("            <label class=\"form-label col-xs-4 col-sm-3\">头像：</label>\r\n");
      out.write("            <div class=\"formControls col-xs-8 col-sm-9\"> <span class=\"btn-upload form-group\">\r\n");
      out.write("\t\t\t\t<input class=\"input-text upload-url\" type=\"text\" name=\"uploadfile\" id=\"uploadfile\" readonly nullmsg=\"请添加附件！\" style=\"width:200px\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:void();\" class=\"btn btn-primary radius upload-btn\"><i class=\"Hui-iconfont\">&#xe642;</i> 浏览文件</a>\r\n");
      out.write("\t\t\t\t<input type=\"file\" multiple name=\"memberfile\" class=\"input-file\">\r\n");
      out.write("\t\t\t\t</span> </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row cl\">\r\n");
      out.write("            <label class=\"form-label col-xs-4 col-sm-3\">所在城市：</label>\r\n");
      out.write("            <div class=\"formControls col-xs-8 col-sm-9\">\r\n");
      out.write("                <div id=\"distpicker1\">\r\n");
      out.write("                    <select name=\"province\" class=\"select\" style=\"width:180px;height:31px;\"></select>\r\n");
      out.write("                    <select name=\"city\" class=\"select\" style=\"width:180px;height:31px;\"></select>\r\n");
      out.write("                    <select name=\"district\" class=\"select\" style=\"width:180px;height:31px;\"></select>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row cl\">\r\n");
      out.write("            <label class=\"form-label col-xs-4 col-sm-3\">备注：</label>\r\n");
      out.write("            <div class=\"formControls col-xs-8 col-sm-9\">\r\n");
      out.write("                <textarea name=\"description\" cols=\"\" rows=\"\" class=\"textarea\"  placeholder=\"说点什么...最多输入100个字符\"></textarea>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row cl\">\r\n");
      out.write("            <div class=\"col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3\">\r\n");
      out.write("                <input id=\"saveButton\" class=\"btn btn-primary radius\" type=\"submit\" value=\"&nbsp;&nbsp;提交&nbsp;&nbsp;\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</article>\r\n");
      out.write("\r\n");
      out.write("<!--_footer 作为公共模版分离出去-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/layer/2.4/layer.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"static/h-ui/js/H-ui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"static/h-ui.admin/js/H-ui.admin.js\"></script> <!--/_footer 作为公共模版分离出去-->\r\n");
      out.write("\r\n");
      out.write("<!--请在下方写此页面业务相关的脚本-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/My97DatePicker/4.8/WdatePicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery.validation/1.14.0/jquery.validate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery.validation/1.14.0/validate-methods.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery.validation/1.14.0/messages_zh.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/province/distpicker.data.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/province/distpicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    /*城市选择控件*/\r\n");
      out.write("    $(\"#distpicker1\").distpicker();\r\n");
      out.write("\r\n");
      out.write("    /*文本输入限制*/\r\n");
      out.write("    $(\".textarea\").Huitextarealength({\r\n");
      out.write("        minlength:0,\r\n");
      out.write("        maxlength:100\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $(function(){\r\n");
      out.write("        $('.skin-minimal input').iCheck({\r\n");
      out.write("            checkboxClass: 'icheckbox-blue',\r\n");
      out.write("            radioClass: 'iradio-blue',\r\n");
      out.write("            increaseArea: '20%'\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $(\"#form-member-add\").validate({\r\n");
      out.write("            rules:{\r\n");
      out.write("                username:{\r\n");
      out.write("                    required:true,\r\n");
      out.write("                    minlength:2,\r\n");
      out.write("                    maxlength:16,\r\n");
      out.write("                    remote: \"/member/username\"\r\n");
      out.write("                },\r\n");
      out.write("                password:{\r\n");
      out.write("                    required:true,\r\n");
      out.write("                    minlength:6,\r\n");
      out.write("                },\r\n");
      out.write("                password2:{\r\n");
      out.write("                    required:true,\r\n");
      out.write("                    minlength:6,\r\n");
      out.write("                    equalTo: \"#password\"\r\n");
      out.write("                },\r\n");
      out.write("                phone:{\r\n");
      out.write("                    required:true,\r\n");
      out.write("                    isMobile:true,\r\n");
      out.write("                    remote:\"/member/phone\"\r\n");
      out.write("                },\r\n");
      out.write("                email:{\r\n");
      out.write("                    required:true,\r\n");
      out.write("                    email:true,\r\n");
      out.write("                    remote:\"/member/email\"\r\n");
      out.write("                },\r\n");
      out.write("                sex:{\r\n");
      out.write("                    required:true,\r\n");
      out.write("                },\r\n");
      out.write("                file:{\r\n");
      out.write("                    required:false,\r\n");
      out.write("                },\r\n");
      out.write("                province:{\r\n");
      out.write("                    required:true,\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            messages: {\r\n");
      out.write("                username: {\r\n");
      out.write("                    remote: \"该用户名已被注册\"\r\n");
      out.write("                },\r\n");
      out.write("                phone: {\r\n");
      out.write("                    remote: \"该手机号已被注册\"\r\n");
      out.write("                },\r\n");
      out.write("                email: {\r\n");
      out.write("                    remote: \"该邮箱已被注册\"\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            onkeyup:false,\r\n");
      out.write("            focusCleanup:false,\r\n");
      out.write("            success:\"valid\",\r\n");
      out.write("            submitHandler:function(form){\r\n");
      out.write("                var index = layer.load(3);\r\n");
      out.write("                $(form).ajaxSubmit({\r\n");
      out.write("                    url: \"/member/add\",\r\n");
      out.write("                    type: \"POST\",\r\n");
      out.write("                    success: function(data) {\r\n");
      out.write("                        layer.close(index);\r\n");
      out.write("                        if(data.success==true){\r\n");
      out.write("                            if(parent.location.pathname!='/'){\r\n");
      out.write("                                parent.member_count();\r\n");
      out.write("                                parent.refresh();\r\n");
      out.write("                                parent.msgSuccess(\"添加成功!\");\r\n");
      out.write("                                var index = parent.layer.getFrameIndex(window.name);\r\n");
      out.write("                                parent.layer.close(index);\r\n");
      out.write("                            }else{\r\n");
      out.write("                                layer.confirm('添加成功!', {\r\n");
      out.write("                                    btn: ['确认'],icon: 1\r\n");
      out.write("                                }, function(){\r\n");
      out.write("                                    var index = parent.layer.getFrameIndex(window.name);\r\n");
      out.write("                                    parent.layer.close(index);\r\n");
      out.write("                                });\r\n");
      out.write("                            }\r\n");
      out.write("                        }else{\r\n");
      out.write("                            layer.close(index);\r\n");
      out.write("                            layer.alert('添加失败! '+data.message, {title: '错误信息',icon: 2});\r\n");
      out.write("                        }\r\n");
      out.write("                    },\r\n");
      out.write("                    error:function(XMLHttpRequest) {\r\n");
      out.write("                        layer.close(index);\r\n");
      out.write("                        layer.alert('数据处理失败! 错误码:'+XMLHttpRequest.status+' 错误信息:'+JSON.parse(XMLHttpRequest.responseText).message,{title: '错误信息',icon: 2});\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<!--/请在上方写此页面业务相关的脚本-->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}