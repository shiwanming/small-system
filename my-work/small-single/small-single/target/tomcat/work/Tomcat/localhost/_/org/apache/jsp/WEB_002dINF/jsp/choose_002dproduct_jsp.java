/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-03-28 10:36:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class choose_002dproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>选择商品</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("    .table>tbody>tr>td{\r\n");
      out.write("        text-align:center;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"padding:2vw\">\r\n");
      out.write("    <table class=\"table table-border table-bordered table-bg table-hover table-sort\" width=\"100%\">\r\n");
      out.write("        <thead>\r\n");
      out.write("        <tr class=\"text-c\">\r\n");
      out.write("            <th width=\"70\">ID</th>\r\n");
      out.write("            <th width=\"70\">缩略图</th>\r\n");
      out.write("            <th width=\"130\">商品名称</th>\r\n");
      out.write("            <th width=\"90\">描述</th>\r\n");
      out.write("            <th width=\"60\">单价</th>\r\n");
      out.write("            <th width=\"95\">创建日期</th>\r\n");
      out.write("            <th width=\"95\">更新日期</th>\r\n");
      out.write("            <th width=\"50\">状态</th>\r\n");
      out.write("            <th width=\"80\">操作</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("    </table>\r\n");
      out.write("</div>\r\n");
      out.write("<!--_footer 作为公共模版分离出去-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/layer/2.4/layer.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"static/h-ui/js/H-ui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"static/h-ui.admin/js/H-ui.admin.js\"></script> <!--/_footer 作为公共模版分离出去-->\r\n");
      out.write("\r\n");
      out.write("<!--请在下方写此页面业务相关的脚本-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/datatables/1.10.0/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/common.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    function imageShow(data){\r\n");
      out.write("        if(data==\"\"||data==null){\r\n");
      out.write("            return \"http://ow2h3ee9w.bkt.clouddn.com/nopic.jpg\";\r\n");
      out.write("        }\r\n");
      out.write("        var images= new Array(); //定义一数组\r\n");
      out.write("        images=data.split(\",\"); //字符分割\r\n");
      out.write("        if(images.length>0){\r\n");
      out.write("            return images[0];\r\n");
      out.write("        }else{\r\n");
      out.write("            return data;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*datatables配置*/\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        $('.table').DataTable({\r\n");
      out.write("            serverSide: true,//开启服务器模式\r\n");
      out.write("            \"processing\": true,//加载显示提示\r\n");
      out.write("            \"ajax\": {\r\n");
      out.write("                url:\"/item/list\",\r\n");
      out.write("                type: 'GET',\r\n");
      out.write("                data:{\r\n");
      out.write("                    \"cid\":-1\r\n");
      out.write("                },\r\n");
      out.write("            },\r\n");
      out.write("            \"columns\": [\r\n");
      out.write("                { \"data\": \"id\"},\r\n");
      out.write("                { \"data\": \"image\",\r\n");
      out.write("                    render: function(data, type, row, meta) {\r\n");
      out.write("                        return '<img src=\"'+imageShow(data)+'\" style=\"width: 80px;height: 60px\" alt=\"\" />';\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                { \"data\": \"title\",\r\n");
      out.write("                    render: function(data, type, row, meta) {\r\n");
      out.write("                        if (type === 'display') {\r\n");
      out.write("                            if (data.length > 20) {\r\n");
      out.write("                                return '<span title=' + data + '>' + data.substr(0, 50) + '...</span>';\r\n");
      out.write("                            } else {\r\n");
      out.write("                                return '<span title=' + data + '>' + data + '</span>';\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                        return data;\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                { \"data\": \"sellPoint\",\r\n");
      out.write("                    render: function(data, type, row, meta) {\r\n");
      out.write("                        if (type === 'display') {\r\n");
      out.write("                            if (data.length > 20) {\r\n");
      out.write("                                return '<span title=' + data + '>' + data.substr(0, 20) + '...</span>';\r\n");
      out.write("                            } else {\r\n");
      out.write("                                return '<span title=' + data + '>' + data + '</span>';\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                        return data;\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                { \"data\": \"price\"},\r\n");
      out.write("                { \"data\": \"created\",\r\n");
      out.write("                    render : function(data,type, row, meta) {\r\n");
      out.write("                        return date(data);\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                { \"data\": \"updated\",\r\n");
      out.write("                    render : function(data,type, row, meta) {\r\n");
      out.write("                        return date(data);\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                { \"data\": \"status\",\r\n");
      out.write("                    render : function(data,type, row, meta) {\r\n");
      out.write("                        if(data==0){\r\n");
      out.write("                            return \"<span class=\\\"label label-defant radius td-status\\\">已下架</span>\";\r\n");
      out.write("                        }else if(data==1){\r\n");
      out.write("                            return \"<span class=\\\"label label-success radius td-status\\\">已发布</span>\";\r\n");
      out.write("                        }else{\r\n");
      out.write("                            return \"<span class=\\\"label label-warning radius td-status\\\">其它态</span>\";\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                    \"data\": null,\r\n");
      out.write("                    render: function (data, type, row, meta) {\r\n");
      out.write("                        return \"<input onclick='chooseProduct()' class='btn btn-danger-outline size-S radius' type='button' value='选择该商品'>\";\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            ],\r\n");
      out.write("           \"aaSorting\": [[ 5, \"asc\" ]],//默认第几个排序\r\n");
      out.write("            \"bStateSave\": false,//状态保存\r\n");
      out.write("            \"aoColumnDefs\": [\r\n");
      out.write("                {\"orderable\":false,\"aTargets\":[1,8]}// 制定列不参与排序\r\n");
      out.write("            ],\r\n");
      out.write("            \"lengthMenu\": [ 5, 10, 25, 50, 100 ],\r\n");
      out.write("            language: {\r\n");
      out.write("                url: '/lib/datatables/Chinese.json'\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function chooseProduct(id){\r\n");
      out.write("        var table = $('.table').DataTable();\r\n");
      out.write("        $('.table tbody').on( 'click', 'tr', function () {\r\n");
      out.write("            var id = table.row( this ).data().id;\r\n");
      out.write("            var title = table.row( this ).data().title;\r\n");
      out.write("            parent.setIdAndTitle(id,title);\r\n");
      out.write("            var index = parent.layer.getFrameIndex(window.name);\r\n");
      out.write("            parent.layer.close(index);\r\n");
      out.write("        });\r\n");
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
