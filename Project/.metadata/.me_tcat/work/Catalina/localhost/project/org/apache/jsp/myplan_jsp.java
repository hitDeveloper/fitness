package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class myplan_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>首页</title>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"  charset=\"utf-8\">\r\n");
      out.write("\t<link href=\"bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("\t<link href=\"bootstrap-responsive.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<h1 class=\"page-header\" >哈工大健身网<img src=\"image/logo.jpg\"></h1>\r\n");
      out.write("<div class=\"navbar\">\r\n");
      out.write("<div class=\"navbar-inner\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<ul class=\"nav\">\r\n");
      out.write("\t<li><a href=\"main.jsp\">首页</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("\t<li><a href=\"zhengxin.jsp\">正心楼</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("\t<li><a href=\"gym.jsp\">体育场</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("\t<li><a href=\"tiyubu.jsp\">体育部</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("\t<li><a href=\"center.jsp\">活动中心</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("\t<li><a href=\"swimming.jsp\">游泳馆</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("\t<li><a href=\"gym2.jsp\">第二体育场</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("\t<li><a href=\"xiaozuqiuchang.jsp\">小足球场</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("\t<li class=\"active\"><a href=\"myplan.jsp\">健身计划</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("\t<li><a href=\"book.jsp\">场馆预定</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("</ul>\r\n");
      out.write("<ul class=\"nav pull-right\">\r\n");
      out.write("\t<li><a href=\"login.jsp\">登录</a></li>\r\n");
      out.write("\t<li><a href=\"register.jsp\">注册</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<form action=planAction method=\"post\">\r\n");
      out.write("<h4 class=\"page-header\">个人详细信息</h4>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<div class=\"input-append\">\r\n");
      out.write("<span class=\"add-on\"><div class=\"span1\" align=\"center\">年龄</div></span>\r\n");
      out.write("<input type=\"text\" placeholder=\"输入您的年龄\" class=\"span3\" name=\"age\" />\r\n");
      out.write("</div></div>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<div class=\"input-append\">\r\n");
      out.write("<span class=\"add-on\"><div class=\"span1\" align=\"center\">身高</div></span>\r\n");
      out.write("<input type=\"text\" placeholder=\"输入您的身高（cm）\" class=\"span3\" name=\"height\" />\r\n");
      out.write("</div></div>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<div class=\"input-prepend input-append\">\r\n");
      out.write("<span class=\"add-on\"><div class=\"span1\" align=\"center\">体重</div></span>\r\n");
      out.write("<input type=\"text\" placeholder=\"输入您的体重\" class=\"span3\" name=\"weight\" />\r\n");
      out.write("</div></div>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<div class=\"input-prepend input-append\">\r\n");
      out.write("<span class=\"add-on\"><div class=\"span1\" align=\"center\">锻炼时间</div></span>\r\n");
      out.write("<select class=\"span3\" name=\"payTime\">\r\n");
      out.write("<option value=\"每周2小时以内\">每周2小时以内</option>\r\n");
      out.write("<option value=\"每周2-5小时之间\">每周2-5小时之间</option>\r\n");
      out.write("<option value=\"每周5小时以上\">每周5小时以上</option>\r\n");
      out.write("</select>\r\n");
      out.write("</div></div>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("\t 性别&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("     <input type=\"radio\" name=\"gender\" value=\"男\" checked> 男&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("     <input type=\"radio\" name=\"gender\" value=\"女\"> 女&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("</div>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("\t 兴趣&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("     <input type=\"radio\" name=\"hobby\" value=\"篮球\" checked> 篮球\r\n");
      out.write("     <input type=\"radio\" name=\"hobby\" value=\"网球\">         网球\r\n");
      out.write("     <input type=\"radio\" name=\"hobby\" value=\"乒乓球\">         乒乓球\r\n");
      out.write("     <input type=\"radio\" name=\"hobby\" value=\"排球\">         排球<br>\r\n");
      out.write("     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("     <input type=\"radio\" name=\"hobby\" value=\"足球\">         足球\r\n");
      out.write("     <input type=\"radio\" name=\"hobby\" value=\"跑步\">         跑步\r\n");
      out.write("     <input type=\"radio\" name=\"hobby\" value=\"羽毛球\">         羽毛球\r\n");
      out.write("     <input type=\"radio\" name=\"hobby\" value=\"足球\">         其他\r\n");
      out.write("</div>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("\t<input class=\"btn\" type=\"submit\" value=\"健身计划在这里\"/>     \r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t<script src=\"jquery-1.11.1.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
