package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class book_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>健身网</title>\r\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t<link href=\"bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("\t<link href=\"bootstrap-responsive.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
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
      out.write("\t<li><a href=\"myplan.jsp\">健身计划</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("\t<li class=\"active\"><a href=\"book.jsp\">场馆预定</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("</ul>\r\n");
      out.write("<ul class=\"nav pull-right\">\r\n");
      out.write("\t<li><a href=\"login.jsp\">登录</a></li>\r\n");
      out.write("\t<li><a href=\"register.jsp\">注册</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<h4 class=\"page-header\" align=\"center\">订单</h4>\r\n");
      out.write("<table class=\"table table-bordered\">\r\n");
      out.write("   <thead>\r\n");
      out.write("      <tr>\r\n");
      out.write("         <th><div align=\"center\">场地场馆名称</div></th>\r\n");
      out.write("         <th><div align=\"center\">收费标准</div></th>\r\n");
      out.write("         <th><div align=\"center\">场地已使用数/场地总数</div></th>\r\n");
      out.write("\t\t <th><div align=\"center\">联系人电话号码</div></th>\r\n");
      out.write("         <th><div align=\"center\">请选择时间</div></th>\r\n");
      out.write("\t\t <th><div align=\"center\">场地预约</div></th>\r\n");
      out.write("      </tr>\r\n");
      out.write("   </thead>\r\n");
      out.write("   <tbody>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("         <td><div align=\"center\">正心楼舞蹈教室</div></td>\r\n");
      out.write("         <td><div align=\"center\">5</div></td>\r\n");
      out.write("\t\t <td><div align=\"center\">10/20</div></td>\r\n");
      out.write("\t\t <td><div align=\"center\">88888888</div></td>\r\n");
      out.write("\t\t <td><div align=\"center\">\r\n");
      out.write("\t\t <select name=\"time\">\r\n");
      out.write("\t\t\t<option value=\"6:00-7:00\">6:00-7:00</option>\r\n");
      out.write("\t\t\t<option value=\"7:00-8:00\">7:00-8:00</option>\r\n");
      out.write("\t\t\t<option value=\"8:00-9:00\">8:00-9:00</option>\r\n");
      out.write("\t\t\t<option value=\"9:00-10:00\">9:00-10:00</option>\r\n");
      out.write("\t\t\t<option value=\"10:00-11:00\">10:00-11:00</option>\r\n");
      out.write("\t\t\t<option value=\"11:00-12:00\">11:00-12:00</option>\r\n");
      out.write("\t\t\t<option value=\"12:00-13:00\">12:00-13:00</option>\r\n");
      out.write("\t\t\t<option value=\"13:00-14:00\">13:00-14:00</option>\r\n");
      out.write("\t\t\t<option value=\"14:00-15:00\">14:00-15:00</option>\r\n");
      out.write("\t\t\t<option value=\"15:00-16:00\">15:00-16:00</option>\r\n");
      out.write("\t\t\t<option value=\"16:00-17:00\">16:00-17:00</option>\r\n");
      out.write("\t\t\t<option value=\"17:00-18:00\">17:00-18:00</option>\r\n");
      out.write("\t\t\t<option value=\"18:00-19:00\">18:00-19:00</option>\r\n");
      out.write("\t\t\t<option value=\"19:00-20:00\">19:00-20:00</option>\r\n");
      out.write("\t\t\t<option value=\"20:00-21:00\">20:00-21:00</option>\r\n");
      out.write("\t\t\t<option value=\"21:00-22:00\">21:00-22:00</option>\r\n");
      out.write("\t\t </select></div>\r\n");
      out.write("\t\t </td>\r\n");
      out.write("\t\t    <td><div align=\"center\"><button type=\"button\" class=\"btn btn-link\">预定</button></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("   </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("\t<script src=\"jquery-1.11.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
