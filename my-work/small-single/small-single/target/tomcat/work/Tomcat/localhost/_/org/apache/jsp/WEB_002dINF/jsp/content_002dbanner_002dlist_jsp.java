/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-03-28 10:30:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_002dbanner_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <!--[if IE 6]>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"lib/DD_belatedPNG_0.0.8a-min.js\" ></script>\r\n");
      out.write("    <script>DD_belatedPNG.fix('*');</script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <title>首页板块</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"lib/zTree/v3/css/zTreeStyle/zTreeStyle.css\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("    .table>tbody>tr>td{\r\n");
      out.write("        text-align:center;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body class=\"pos-r\">\r\n");
      out.write("<div class=\"pos-a\" style=\"width:200px;left:0;top:0; bottom:0; height:100%; border-right:1px solid #e5e5e5; background-color:#f5f5f5; overflow:auto;\">\r\n");
      out.write("    <ul style=\"margin-top: 15px;margin-left: 20px\"><i class=\"Hui-iconfont Hui-iconfont-fenlei\"></i> 轮播图板块</ul>\r\n");
      out.write("    <ul id=\"treeDemo\" style=\"margin-left: 10px\" class=\"ztree\"></ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"margin-left:200px;\">\r\n");
      out.write("    <nav class=\"breadcrumb\"><i class=\"Hui-iconfont\">&#xe67f;</i> 首页 <span class=\"c-gray en\">&gt;</span> 商城管理 <span class=\"c-gray en\">&gt;</span> 首页轮播图管理 <span class=\"c-gray en\">&gt;</span><span id=\"name\"></span> <a class=\"btn btn-success radius r\" style=\"line-height:1.6em;margin-top:3px\" href=\"javascript:location.replace(location.href);\" title=\"刷新\" ><i class=\"Hui-iconfont\">&#xe68f;</i></a></nav>\r\n");
      out.write("    <form id=\"form-search\" class=\"page-container\">\r\n");
      out.write("        <div class=\"cl pd-5 bg-1 bk-gray mt-20\"> <span class=\"l\"><a href=\"javascript:;\" onclick=\"datadel()\" class=\"btn btn-danger radius\"><i class=\"Hui-iconfont\">&#xe6e2;</i> 批量删除</a> <a class=\"btn btn-primary radius\" onclick=\"product_add('添加轮播图','content-banner-add')\" href=\"javascript:;\"><i class=\"Hui-iconfont\">&#xe600;</i> 添加轮播图</a></span> <span class=\"r\">最大容纳内容(商品)数：<strong id=\"limitNum\"></strong></span> </div>\r\n");
      out.write("        <div class=\"mt-20\">\r\n");
      out.write("            <div class=\"mt-20\" style=\"margin-bottom: 70px\">\r\n");
      out.write("                <table class=\"table table-border table-bordered table-bg table-hover table-sort\" width=\"100%\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                    <tr class=\"text-c\">\r\n");
      out.write("                        <th width=\"30\"><input name=\"\" type=\"checkbox\" value=\"\"></th>\r\n");
      out.write("                        <th width=\"40\">ID</th>\r\n");
      out.write("                        <th width=\"50\">类型</th>\r\n");
      out.write("                        <th width=\"100\">图片1</th>\r\n");
      out.write("                        <th width=\"100\">图片2</th>\r\n");
      out.write("                        <th width=\"100\">图片3</th>\r\n");
      out.write("                        <th width=\"100\">跳转链接</th>\r\n");
      out.write("                        <th width=\"100\">展示商品ID</th>\r\n");
      out.write("                        <th width=\"150\">商品名称</th>\r\n");
      out.write("                        <th width=\"60\">排序值</th>\r\n");
      out.write("                        <th width=\"95\">创建日期</th>\r\n");
      out.write("                        <th width=\"95\">更新日期</th>\r\n");
      out.write("                        <th width=\"90\">操作</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--_footer 作为公共模版分离出去-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/layer/2.4/layer.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"static/h-ui/js/H-ui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"static/h-ui.admin/js/H-ui.admin.js\"></script> <!--/_footer 作为公共模版分离出去-->\r\n");
      out.write("\r\n");
      out.write("<!--请在下方写此页面业务相关的脚本-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/zTree/v3/js/jquery.ztree.all-3.5.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/My97DatePicker/4.8/WdatePicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/datatables/1.10.0/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/laypage/1.2/laypage.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/datatables/dataTables.colReorder.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery.validation/1.14.0/jquery.validate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery.validation/1.14.0/validate-methods.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery.validation/1.14.0/messages_zh.js\"></script>\r\n");
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
      out.write("    var index = layer.load(3);\r\n");
      out.write("\r\n");
      out.write("    var panelId=1,name=\"\",limitCount=0,currentCount=0,position=0,panelType=0;\r\n");
      out.write("    /*初始化类别数据*/\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        type: 'GET',\r\n");
      out.write("        url: '/panel/indexBanner/list',\r\n");
      out.write("        dataType: 'json',\r\n");
      out.write("        success: function(data){\r\n");
      out.write("            if(data.length<=0||data==\"\"){\r\n");
      out.write("                return\r\n");
      out.write("            }\r\n");
      out.write("            panelId = data[0].id;\r\n");
      out.write("            $(\"#name\").html(data[0].name);\r\n");
      out.write("            name=data[0].name;\r\n");
      out.write("            $(\"#limitNum\").html(data[0].limitNum);\r\n");
      out.write("            limitCount=data[0].limitNum;\r\n");
      out.write("            panelType=data[0].type;\r\n");
      out.write("            initTable(\"/content/list/\"+panelId);\r\n");
      out.write("            updateCurrentCount(\"/content/list/\"+panelId);\r\n");
      out.write("        },\r\n");
      out.write("        error:function(XMLHttpRequest) {\r\n");
      out.write("            layer.alert('数据处理失败! 错误码:'+XMLHttpRequest.status,{title: '错误信息',icon: 2});\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function updateCurrentCount(url) {\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type: 'GET',\r\n");
      out.write("            url: url,\r\n");
      out.write("            dataType: 'json',\r\n");
      out.write("            success: function(data){\r\n");
      out.write("                currentCount=data.data.length;\r\n");
      out.write("            },\r\n");
      out.write("            error:function(XMLHttpRequest) {\r\n");
      out.write("                layer.alert('数据处理失败! 错误码:'+XMLHttpRequest.status,{title: '错误信息',icon: 2});\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*datatables配置*/\r\n");
      out.write("    function initTable(url) {\r\n");
      out.write("        $('.table').DataTable({\r\n");
      out.write("            \"processing\": true,//加载显示提示\r\n");
      out.write("            \"ajax\": {\r\n");
      out.write("                url: url,\r\n");
      out.write("                type: 'GET'\r\n");
      out.write("            },\r\n");
      out.write("            \"columns\": [\r\n");
      out.write("                { \"data\": null,\r\n");
      out.write("                    render : function(data,type, row, meta) {\r\n");
      out.write("                        return \"<input name=\\\"checkbox\\\" value=\\\"\"+row.id+\"\\\" type=\\\"checkbox\\\" value=\\\"\\\">\";\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                { \"data\": \"id\"},\r\n");
      out.write("                { \"data\": \"type\",\r\n");
      out.write("                    render : function(data,type, row, meta) {\r\n");
      out.write("                        if(data==0){\r\n");
      out.write("                            return \"<span class=\\\"label label-success radius td-status\\\">关联商品</span>\";\r\n");
      out.write("                        }else if(data==1){\r\n");
      out.write("                            return \"<span class=\\\"label label-warning radius td-status\\\">其他链接</span>\";\r\n");
      out.write("                        }else if(data==2){\r\n");
      out.write("                            return \"<span class=\\\"label label-primary radius td-status\\\">关联商品(封面)</span>\";\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                { \"data\": \"picUrl\",\r\n");
      out.write("                    render: function(data, type, row, meta) {\r\n");
      out.write("                        return '<img src=\"'+imageShow(data)+'\" style=\"width: 80px;height: 60px\" alt=\"\" />';\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                { \"data\": \"picUrl2\",\r\n");
      out.write("                    render: function(data, type, row, meta) {\r\n");
      out.write("                        return '<img src=\"'+imageShow(data)+'\" style=\"width: 80px;height: 60px\" alt=\"\" />';\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                { \"data\": \"picUrl3\",\r\n");
      out.write("                    render: function(data, type, row, meta) {\r\n");
      out.write("                        return '<img src=\"'+imageShow(data)+'\" style=\"width: 80px;height: 60px\" alt=\"\" />';\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                { \"data\": \"fullUrl\"},\r\n");
      out.write("                { \"data\": \"productId\"},\r\n");
      out.write("                { \"data\": \"productName\"},\r\n");
      out.write("                { \"data\": \"sortOrder\"},\r\n");
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
      out.write("                {\r\n");
      out.write("                    \"data\": null,\r\n");
      out.write("                    render: function (data, type, row, meta) {\r\n");
      out.write("                        return \"<a style=\\\"text-decoration:none\\\" class=\\\"ml-5\\\" onClick=\\\"product_edit('内容编辑','content-banner-edit')\\\" href=\\\"javascript:;\\\" title=\\\"编辑\\\"><i class=\\\"Hui-iconfont\\\">&#xe6df;</i></a> <a style=\\\"text-decoration:none\\\" class=\\\"ml-5\\\" onClick=\\\"product_del(this,\"+row.id+\")\\\" href=\\\"javascript:;\\\" title=\\\"删除\\\"><i class=\\\"Hui-iconfont\\\">&#xe6e2;</i></a>\";\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            ],\r\n");
      out.write("            \"aaSorting\": [[ 9, \"asc\" ]],//默认第几个排序\r\n");
      out.write("            \"bStateSave\": false,//状态保存\r\n");
      out.write("            \"aoColumnDefs\": [\r\n");
      out.write("                {\"orderable\":false,\"aTargets\":[0,3,11]}// 制定列不参与排序\r\n");
      out.write("            ],\r\n");
      out.write("            language: {\r\n");
      out.write("                url: '/lib/datatables/Chinese.json'\r\n");
      out.write("            },\r\n");
      out.write("            colReorder: true\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    var setting = {\r\n");
      out.write("        view: {\r\n");
      out.write("            dblClickExpand: true,\r\n");
      out.write("            showLine: true,\r\n");
      out.write("            selectedMulti: false\r\n");
      out.write("        },\r\n");
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
      out.write("            url: \"/panel/indexBanner/list\",\r\n");
      out.write("            type: \"GET\",\r\n");
      out.write("            contentType: \"application/json\",\r\n");
      out.write("            autoParam: [\"id\"],\r\n");
      out.write("        },\r\n");
      out.write("        callback: {\r\n");
      out.write("            onAsyncSuccess: function(){\r\n");
      out.write("                layer.close(index);\r\n");
      out.write("            },\r\n");
      out.write("            beforeClick: function(treeId, treeNode) {\r\n");
      out.write("                if (treeNode.isParent) {\r\n");
      out.write("                    return false;\r\n");
      out.write("                } else {\r\n");
      out.write("                    panelId=treeNode.id;\r\n");
      out.write("                    $(\"#name\").html(treeNode.name);\r\n");
      out.write("                    name=treeNode.name;\r\n");
      out.write("                    $(\"#limitNum\").html(treeNode.limitNum);\r\n");
      out.write("                    limitCount=treeNode.limitNum;\r\n");
      out.write("                    panelType=treeNode.type;\r\n");
      out.write("\r\n");
      out.write("                    updateCurrentCount(\"/content/list/\"+panelId);\r\n");
      out.write("                    var table = $('.table').DataTable();\r\n");
      out.write("                    var url=\"/content/list/\"+panelId;\r\n");
      out.write("                    table.ajax.url(url).load();\r\n");
      out.write("                    return true;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("        var t = $(\"#treeDemo\");\r\n");
      out.write("        t = $.fn.zTree.init(t, setting);\r\n");
      out.write("        var zTree = $.fn.zTree.getZTreeObj(\"tree\");\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    /*产品-添加*/\r\n");
      out.write("    function product_add(title,url){\r\n");
      out.write("        if(currentCount>=limitCount) {\r\n");
      out.write("            layer.alert('当前板块内容数量已达上限', {title: '错误信息', icon: 0});\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        var index = layer.open({\r\n");
      out.write("            type: 2,\r\n");
      out.write("            title: title,\r\n");
      out.write("            content: url\r\n");
      out.write("        });\r\n");
      out.write("        layer.full(index);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*产品-查看*/\r\n");
      out.write("    function product_show(title,url,id){\r\n");
      out.write("        var index = layer.open({\r\n");
      out.write("            type: 2,\r\n");
      out.write("            title: title,\r\n");
      out.write("            content: url\r\n");
      out.write("        });\r\n");
      out.write("        layer.full(index);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    var id=0,productId=0,productName=\"\",fullUrl=\"\",type=0;\r\n");
      out.write("\r\n");
      out.write("    /*产品-编辑*/\r\n");
      out.write("    function product_edit(title,url){\r\n");
      out.write("        var table = $('.table').DataTable();\r\n");
      out.write("        $('.table tbody').on( 'click', 'tr', function () {\r\n");
      out.write("            id = table.row(this).data().id;\r\n");
      out.write("            productId = table.row(this).data().productId;\r\n");
      out.write("            productName = table.row(this).data().productName;\r\n");
      out.write("            fullUrl = table.row(this).data().fullUrl;\r\n");
      out.write("            type = table.row(this).data().type;\r\n");
      out.write("            sortOrder = table.row(this).data().sortOrder;\r\n");
      out.write("        });\r\n");
      out.write("        var index = layer.open({\r\n");
      out.write("            type: 2,\r\n");
      out.write("            title: title,\r\n");
      out.write("            content: url\r\n");
      out.write("        });\r\n");
      out.write("        layer.full(index);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*内容-删除*/\r\n");
      out.write("    function product_del(obj,id){\r\n");
      out.write("        layer.confirm('确认要删除ID为\\''+id+'\\'的数据吗？',{icon:0},function(index){\r\n");
      out.write("            var index = layer.load(3);\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type: 'DELETE',\r\n");
      out.write("                url: '/content/del/'+id,\r\n");
      out.write("                dataType: 'json',\r\n");
      out.write("                success: function(data){\r\n");
      out.write("                    layer.close(index);\r\n");
      out.write("                    if(data.success!=true){\r\n");
      out.write("                        layer.alert(data.message,{title: '错误信息',icon: 2});\r\n");
      out.write("                        return;\r\n");
      out.write("                    }\r\n");
      out.write("                    refresh();\r\n");
      out.write("                    layer.msg('已删除!',{icon:1,time:1000});\r\n");
      out.write("                },\r\n");
      out.write("                error:function(XMLHttpRequest) {\r\n");
      out.write("                    layer.close(index);\r\n");
      out.write("                    layer.alert('数据处理失败! 错误码:'+XMLHttpRequest.status,{title: '错误信息',icon: 2});\r\n");
      out.write("                },\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*批量删除*/\r\n");
      out.write("    function datadel() {\r\n");
      out.write("        var cks=document.getElementsByName(\"checkbox\");\r\n");
      out.write("        var count=0,ids=\"\";\r\n");
      out.write("        for(var i=0;i<cks.length;i++){\r\n");
      out.write("            if(cks[i].checked){\r\n");
      out.write("                count++;\r\n");
      out.write("                ids+=cks[i].value+\",\";\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        if(count==0){\r\n");
      out.write("            layer.msg('您还未勾选任何数据!',{icon:5,time:3000});\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        /*去除末尾逗号*/\r\n");
      out.write("        if(ids.length>0){\r\n");
      out.write("            ids=ids.substring(0,ids.length-1);\r\n");
      out.write("        }\r\n");
      out.write("        layer.confirm('确认要删除所选的'+count+'条数据吗？',{icon:0},function(index){\r\n");
      out.write("            var index = layer.load(3);\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type: 'DELETE',\r\n");
      out.write("                url: '/content/del/'+ids,\r\n");
      out.write("                dataType: 'json',\r\n");
      out.write("                success:function(data){\r\n");
      out.write("                    layer.close(index);\r\n");
      out.write("                    if(data.success!=true){\r\n");
      out.write("                        layer.alert(data.message,{title: '错误信息',icon: 2});\r\n");
      out.write("                        return;\r\n");
      out.write("                    }\r\n");
      out.write("                    layer.msg('已删除!',{icon:1,time:1000});\r\n");
      out.write("                    refresh();\r\n");
      out.write("                },\r\n");
      out.write("                error:function(XMLHttpRequest){\r\n");
      out.write("                    layer.close(index);\r\n");
      out.write("                    layer.alert('数据处理失败! 错误码:'+XMLHttpRequest.status,{title: '错误信息',icon: 2});\r\n");
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
