/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-03-29 08:11:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_002dcategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\" />\r\n");
      out.write("    <meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"lib/html5shiv.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"lib/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui/css/H-ui.min.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui.admin/css/H-ui.admin.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"lib/Hui-iconfont/1.0.8/iconfont.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui.admin/skin/default/skin.css\" id=\"skin\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui.admin/css/style.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"lib/zTree/v3/css/zTreeStyle/zTreeStyle.css\" type=\"text/css\">\r\n");
      out.write("    <!--[if IE 6]>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"lib/DD_belatedPNG_0.0.8a-min.js\" ></script>\r\n");
      out.write("    <script>DD_belatedPNG.fix('*');</script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <title>商品分类</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"breadcrumb\"><i class=\"Hui-iconfont\">&#xe67f;</i> 首页 <span class=\"c-gray en\">&gt;</span> 商品管理 <span class=\"c-gray en\">&gt;</span> 商品分类 <a class=\"btn btn-success radius r\" style=\"line-height:1.6em;margin-top:3px\" href=\"javascript:location.replace(location.href);\" title=\"刷新\" ><i class=\"Hui-iconfont\">&#xe68f;</i></a></nav>\r\n");
      out.write("<div style=\"margin-left: 1vw;margin-right: 1vw\" class=\"cl pd-5 bg-1 bk-gray mt-20\">\r\n");
      out.write("    <span class=\"l\">\r\n");
      out.write("        <a href=\"javascript:;\" onclick=\"category_del()\" class=\"btn btn-danger radius\"><i class=\"Hui-iconfont\">&#xe6e2;</i> 删除所选分类</a>\r\n");
      out.write("        <a class=\"btn btn-primary radius\" onclick=\"categoryAdd('添加子级分类','product-category-add')\" href=\"javascript:;\"><i class=\"Hui-iconfont\">&#xe600;</i> 添加子级分类</a>\r\n");
      out.write("        <a class=\"btn btn-primary radius\" onclick=\"categoryRootAdd('添加根节点分类','product-category-add')\" href=\"javascript:;\"><i class=\"Hui-iconfont\">&#xe600;</i> 添加根节点分类</a>\r\n");
      out.write("    </span>\r\n");
      out.write("</div>\r\n");
      out.write("<table class=\"table\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td style=\"padding-left: 4vw\" width=\"200\" class=\"va-t\"><ul id=\"treeDemo\" class=\"ztree\"></ul></td>\r\n");
      out.write("        <td class=\"va-t\">\r\n");
      out.write("            <div class=\"page-container\">\r\n");
      out.write("                <form action=\"\" method=\"post\" class=\"form form-horizontal\" id=\"category-edit\">\r\n");
      out.write("                    <input type=\"text\" hidden class=\"input-text\" id=\"id\" name=\"id\">\r\n");
      out.write("                    <input type=\"text\" hidden class=\"input-text\" value=\"0\" id=\"parentId\" name=\"parentId\">\r\n");
      out.write("                    <input type=\"text\" hidden class=\"input-text\" value=\"1\" id=\"status\" name=\"status\">\r\n");
      out.write("                    <input type=\"text\" hidden class=\"input-text\" value=\"true\" id=\"isParent\" name=\"isParent\">\r\n");
      out.write("                    <div class=\"row cl\">\r\n");
      out.write("                        <label class=\"form-label col-xs-4 col-sm-2\">\r\n");
      out.write("                            <span class=\"c-red\">*</span>\r\n");
      out.write("                            分类名称：</label>\r\n");
      out.write("                        <div class=\"formControls col-xs-6 col-sm-6\">\r\n");
      out.write("                            <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"name\" name=\"name\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row cl\">\r\n");
      out.write("                        <label class=\"form-label col-xs-4 col-sm-2\"><span class=\"c-red\">*</span>是否为父节点：</label>\r\n");
      out.write("                        <div class=\"formControls col-xs-6 col-sm-6\">\r\n");
      out.write("                            <div id=\"parentSwitch\" class=\"switch\" data-on-label=\"是\" data-on=\"info\" data-off-label=\"否\">\r\n");
      out.write("                                <input type=\"checkbox\" checked />\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row cl\" id=\"choose-parent\">\r\n");
      out.write("                        <label class=\"form-label col-xs-4 col-sm-2\">选择父节点：</label>\r\n");
      out.write("                        <div class=\"formControls col-xs-8 col-sm-9\">\r\n");
      out.write("                            <input type=\"text\" onclick=\"chooseParent()\" readonly class=\"input-text\" value=\"\" placeholder=\"请点击选择其父节点分类\" id=\"parentName\" name=\"parentName\" style=\"width:48%\">\r\n");
      out.write("                            <input type=\"button\" onclick=\"chooseParent()\" class=\"btn btn-secondary radius\" value=\"选择父节点分类\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row cl\">\r\n");
      out.write("                        <label class=\"form-label col-xs-4 col-sm-2\">\r\n");
      out.write("                            <span class=\"c-red\">*</span>\r\n");
      out.write("                            排序优先值：</label>\r\n");
      out.write("                        <div class=\"formControls col-xs-6 col-sm-6\">\r\n");
      out.write("                            <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"请输入0~9999，值越小排序越前\" id=\"sortOrder\" name=\"sortOrder\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row cl\">\r\n");
      out.write("                        <label class=\"form-label col-xs-4 col-sm-2\"><span class=\"c-red\">*</span>是否启用：</label>\r\n");
      out.write("                        <div class=\"formControls col-xs-6 col-sm-6\">\r\n");
      out.write("                            <div id=\"mySwitch\" class=\"switch\" data-on-label=\"启用\" data-on=\"info\" data-off-label=\"禁用\">\r\n");
      out.write("                                <input type=\"checkbox\" checked />\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row cl\">\r\n");
      out.write("                        <label class=\"form-label col-xs-4 col-sm-2\">备注：</label>\r\n");
      out.write("                        <div class=\"formControls col-xs-6 col-sm-6\">\r\n");
      out.write("                            <textarea name=\"remark\" id=\"remark\" cols=\"\" rows=\"\" class=\"textarea\"  placeholder=\"说点什么...最多输入100个字符\"></textarea>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row cl\">\r\n");
      out.write("                        <div class=\"col-9 col-offset-2\">\r\n");
      out.write("                            <input class=\"btn btn-primary radius\" type=\"submit\" value=\"&nbsp;&nbsp;提交修改&nbsp;&nbsp;\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<!--_footer 作为公共模版分离出去-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/layer/2.4/layer.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"static/h-ui/js/H-ui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"static/h-ui.admin/js/H-ui.admin.js\"></script> <!--/_footer 作为公共模版分离出去-->\r\n");
      out.write("\r\n");
      out.write("<!--请在下方写此页面业务相关的脚本-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/zTree/v3/js/jquery.ztree.all-3.5.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery.validation/1.14.0/jquery.validate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery.validation/1.14.0/validate-methods.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery.validation/1.14.0/messages_zh.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    /*文本输入限制*/\r\n");
      out.write("    $(\".textarea\").Huitextarealength({\r\n");
      out.write("        minlength:0,\r\n");
      out.write("        maxlength:100\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function chooseParent(){\r\n");
      out.write("        layer_show(\"选择父节点分类\",\"choose-parent-category\",300,510);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    var isParent=false,id=\"\",name=\"\";\r\n");
      out.write("\r\n");
      out.write("    var index = layer.load(3);\r\n");
      out.write("\r\n");
      out.write("    var setting = {\r\n");
      out.write("        view: {\r\n");
      out.write("            dblClickExpand: true,\r\n");
      out.write("            showLine: true,\r\n");
      out.write("            selectedMulti: false\r\n");
      out.write("            //fontCss : {color:\"#ff0011\",background:\"blue\"}\r\n");
      out.write("        },\r\n");
      out.write("\r\n");
      out.write("        data: {\r\n");
      out.write("            simpleData: {\r\n");
      out.write("                enable:true,\r\n");
      out.write("                idKey: \"id\",\r\n");
      out.write("                pIdKey: \"pId\",\r\n");
      out.write("                rootPId: \"\"\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("        async: {\r\n");
      out.write("            enable: true,\r\n");
      out.write("            url: \"/item/cat/list\",\r\n");
      out.write("            type: \"GET\",\r\n");
      out.write("            contentType: \"application/json\",\r\n");
      out.write("            autoParam: [\"id\"]\r\n");
      out.write("        },\r\n");
      out.write("        callback: {\r\n");
      out.write("            onAsyncSuccess: function(){\r\n");
      out.write("                layer.close(index);\r\n");
      out.write("            },\r\n");
      out.write("            beforeClick: function(treeId, treeNode) {\r\n");
      out.write("                $(\"#name\").val(treeNode.name);\r\n");
      out.write("                $(\"#id\").val(treeNode.id);\r\n");
      out.write("                $(\"#sortOrder\").val(treeNode.sortOrder);\r\n");
      out.write("                $(\"#remark\").val(treeNode.remark);\r\n");
      out.write("                $(\"#parentId\").val(treeNode.pId);\r\n");
      out.write("                if($(\"#parentId\").val()==\"\"){\r\n");
      out.write("                    $(\"#parentId\").val(0);\r\n");
      out.write("                }\r\n");
      out.write("                if(treeNode.pId!=0){\r\n");
      out.write("                    $(\"#parentName\").val(treeNode.getParentNode().name);\r\n");
      out.write("                }\r\n");
      out.write("                changeSwitch2(treeNode.status);\r\n");
      out.write("                id=treeNode.id;\r\n");
      out.write("                name=treeNode.name;\r\n");
      out.write("\r\n");
      out.write("                if (treeNode.isParent) {\r\n");
      out.write("                    isParent=true;\r\n");
      out.write("                    changeSwitch1(1);\r\n");
      out.write("                    return false;\r\n");
      out.write("                } else {\r\n");
      out.write("                    isParent=false;\r\n");
      out.write("                    changeSwitch1(0);\r\n");
      out.write("                    return true;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    function changeSwitch1(value){\r\n");
      out.write("        if(value==1){\r\n");
      out.write("            $('#parentSwitch').bootstrapSwitch('setState', true);\r\n");
      out.write("        }else{\r\n");
      out.write("            $('#parentSwitch').bootstrapSwitch('setState', false);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    $('#parentSwitch').on('switch-change', function (e, data) {\r\n");
      out.write("        if(data.value==true){\r\n");
      out.write("            $(\"#isParent\").val(true);\r\n");
      out.write("        }else{\r\n");
      out.write("            $(\"#isParent\").val(false);\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function changeSwitch2(value){\r\n");
      out.write("        if(value==1){\r\n");
      out.write("            $('#mySwitch').bootstrapSwitch('setState', true);\r\n");
      out.write("        }else{\r\n");
      out.write("            $('#mySwitch').bootstrapSwitch('setState', false);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    $('#mySwitch').on('switch-change', function (e, data) {\r\n");
      out.write("        if(data.value==true){\r\n");
      out.write("            $(\"#status\").val(1);\r\n");
      out.write("        }else{\r\n");
      out.write("            $(\"#status\").val(0);\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    initTree();\r\n");
      out.write("\r\n");
      out.write("    function initTree(){\r\n");
      out.write("        var t = $(\"#treeDemo\");\r\n");
      out.write("        t = $.fn.zTree.init(t, setting);\r\n");
      out.write("        demoIframe = $(\"#testIframe\");\r\n");
      out.write("        var zTree = $.fn.zTree.getZTreeObj(\"tree\");\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //保存提交\r\n");
      out.write("    $(\"#category-edit\").validate({\r\n");
      out.write("        rules:{\r\n");
      out.write("            name:{\r\n");
      out.write("                required:true,\r\n");
      out.write("                minlength:1,\r\n");
      out.write("                maxlength:25,\r\n");
      out.write("            },\r\n");
      out.write("            sortOrder:{\r\n");
      out.write("                required:true,\r\n");
      out.write("                digits:true,\r\n");
      out.write("                maxlength:4,\r\n");
      out.write("            },\r\n");
      out.write("        },\r\n");
      out.write("        onkeyup:false,\r\n");
      out.write("        focusCleanup:false,\r\n");
      out.write("        success:\"valid\",\r\n");
      out.write("        submitHandler:function(form){\r\n");
      out.write("            var index = layer.load(3);\r\n");
      out.write("            $(form).ajaxSubmit({\r\n");
      out.write("                url: \"/item/cat/update\",\r\n");
      out.write("                type: \"POST\",\r\n");
      out.write("                success: function(data) {\r\n");
      out.write("                    layer.close(index);\r\n");
      out.write("                    if(data.success==true){\r\n");
      out.write("                        initTree();\r\n");
      out.write("                        msgSuccess(\"编辑成功!\");\r\n");
      out.write("                    }else{\r\n");
      out.write("                        layer.alert('添加失败! '+data.message, {title: '错误信息',icon: 2});\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                error:function(XMLHttpRequest) {\r\n");
      out.write("                    layer.close(index);\r\n");
      out.write("                    layer.alert('数据处理失败! 错误码:'+XMLHttpRequest.status,{title: '错误信息',icon: 2});\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    var isRoot=false;\r\n");
      out.write("\r\n");
      out.write("    /*子分类-添加*/\r\n");
      out.write("    function categoryAdd(title,url){\r\n");
      out.write("        if(!isParent){\r\n");
      out.write("            layer.alert('请点击选择一父分类! ', {title: '错误信息',icon: 0});\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        isRoot=false;\r\n");
      out.write("        layer_show(title,url,700,400);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*根节点分类-添加*/\r\n");
      out.write("    function categoryRootAdd(title,url){\r\n");
      out.write("        isRoot=true;\r\n");
      out.write("        layer_show(title,url,700,400);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*分类-删除*/\r\n");
      out.write("    function category_del() {\r\n");
      out.write("        var id=$(\"#id\").val();\r\n");
      out.write("        if(id==-1){\r\n");
      out.write("            layer.alert('请点击选择要删除的分类! ', {title: '错误信息',icon: 0});\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        layer.confirm('确认要删除所选的\\''+name+'\\'分类吗？',{icon:0},function(index){\r\n");
      out.write("            var index = layer.load(3);\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type: 'DELETE',\r\n");
      out.write("                url: '/item/cat/del/' +id,\r\n");
      out.write("                dataType: 'json',\r\n");
      out.write("                success: function(data) {\r\n");
      out.write("                    layer.close(index);\r\n");
      out.write("                    if(data.success==true){\r\n");
      out.write("                        initTree();\r\n");
      out.write("                        msgSuccess(\"删除成功!\");\r\n");
      out.write("                    }else{\r\n");
      out.write("                        layer.alert('删除失败! '+data.message, {title: '错误信息',icon: 2});\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                error: function (XMLHttpRequest) {\r\n");
      out.write("                    layer.close(index);\r\n");
      out.write("                    layer.alert('数据处理失败! 错误码:' + XMLHttpRequest.status, {\r\n");
      out.write("                        title: '错误信息',\r\n");
      out.write("                        icon: 2\r\n");
      out.write("                    });\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function msgSuccess(content){\r\n");
      out.write("        layer.msg(content, {icon: 1,time:3000});\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
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
