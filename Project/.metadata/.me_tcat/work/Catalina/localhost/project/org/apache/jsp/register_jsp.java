package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<form action=\"register\" method=\"post\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<h1 class=\"page-header\" >哈工大健身网<img src=\"image/logo.jpg\"></h1>\r\n");
      out.write("<h4 class=\"page-header\" align=\"center\">用户注册</h4>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<div class=\"input-append\">\r\n");
      out.write("<span class=\"add-on\"><div class=\"span1\" align=\"center\">用户名</div></span>\r\n");
      out.write("<input type=\"text\" placeholder=\"输入您的用户名\" class=\"span3\" name=\"userName\" />\r\n");
      out.write("</div></div>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<div class=\"input-append\">\r\n");
      out.write("<span class=\"add-on\"><div class=\"span1\" align=\"center\">密码</div></span>\r\n");
      out.write("<input type=\"password\" placeholder=\"输入您的密码\" class=\"span3\" name=\"password\" />\r\n");
      out.write("</div></div>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<div class=\"input-prepend input-append\">\r\n");
      out.write("<span class=\"add-on\"><div class=\"span1\" align=\"center\">年龄</div></span>\r\n");
      out.write("<input type=\"text\" placeholder=\"输入您的年龄\" class=\"span3\" name=\"age\" /><span class=\"add-on\">岁</span>\r\n");
      out.write("</div></div>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<div class=\"input-prepend input-append\">\r\n");
      out.write("<span class=\"add-on\"><div class=\"span1\" align=\"center\">身高</div></span>\r\n");
      out.write("<input type=\"text\" placeholder=\"输入您的身高\" class=\"span3\" name=\"length\" /><span class=\"add-on\">cm</span>\r\n");
      out.write("</div></div>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<div class=\"input-prepend input-append\">\r\n");
      out.write("<span class=\"add-on\"><div class=\"span1\" align=\"center\">体重</div></span>\r\n");
      out.write("<input type=\"text\" placeholder=\"输入您的身高\" class=\"span3\" name=\"weight\" /><span class=\"add-on\">kg</span>\r\n");
      out.write("</div></div>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<p>性别</p>\r\n");
      out.write("男<input type=\"radio\" name=\"sex\" value=\"男\">\r\n");
      out.write("女<input type=\"radio\" name=\"sex\" value=\"女\"><br />\r\n");
      out.write("</div>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<p>年级</p>\r\n");
      out.write("大一<input type=\"radio\" name=\"grade\" value=\"大一\">\r\n");
      out.write("大二<input type=\"radio\" name=\"grade\" value=\"大二\">\r\n");
      out.write("大三<input type=\"radio\" name=\"grade\" value=\"大三\"><br />\r\n");
      out.write("大四<input type=\"radio\" name=\"grade\" value=\"大四\">\r\n");
      out.write("研一<input type=\"radio\" name=\"grade\" value=\"研一\">\r\n");
      out.write("研二<input type=\"radio\" name=\"grade\" value=\"研二\">\r\n");
      out.write("</div>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<p>健身目标</p>\r\n");
      out.write("减肥<input type=\"radio\" name=\"excerciseAim\" value=\"减肥\">\r\n");
      out.write("锻炼<input type=\"radio\" name=\"excerciseAim\" value=\"锻炼\">\r\n");
      out.write("练肌肉<input type=\"radio\" name=\"excerciseAim\" value=\"练肌肉\">\r\n");
      out.write("健康<input type=\"radio\" name=\"excerciseAim\" value=\"健康\">\r\n");
      out.write("</div>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("\t<input class=\"btn\" type=\"submit\" value=\"提交\"/>     \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("\t\t<script src=\"jquery-1.11.1.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
