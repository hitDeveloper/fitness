package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class center_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<li class=\"active\"><a href=\"center.jsp\">活动中心</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("\t<li><a href=\"swimming.jsp\">游泳馆</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("\t<li><a href=\"gym2.jsp\">第二体育场</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("\t<li><a href=\"xiaozuqiuchang.jsp\">小足球场</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("\t<li><a href=\"myplan.jsp\">制定我的健身计划</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("\t<li><a href=\"myplan.jsp\">场馆预定</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"tabbable tabs-left\">\r\n");
      out.write("<ul class=\"nav nav-tabs\">\r\n");
      out.write("\t<li class=\"active\"><a href=\"#center\" data-toggle=\"tab\">活动中心</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("<div class=\"tab-content\">\r\n");
      out.write("<div class=\"tab-pane active\" id=\"center\">\r\n");
      out.write("<div class=\"span6\">\r\n");
      out.write("<div class=\"carousel slide\" id=\"carousel1\">\r\n");
      out.write("<div class=\"carousel-inner\">\r\n");
      out.write("<div class=\"item active\">\r\n");
      out.write("<img src=\"image/gym/huodongzhongxin/841361preview4.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/huodongzhongxin/2012410102630182.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/huodongzhongxin/20120417094019302.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/huodongzhongxin/20130731084912390.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<a href=\"#carousel1\" data-slide=\"prev\" class=\"left carousel-control\"><</a>\r\n");
      out.write("<a href=\"#carousel1\" data-slide=\"next\" class=\"right carousel-control\">></a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("<h4 class=\"page-header\">场馆介绍</h4>\r\n");
      out.write("<p>哈工大活动中心是哈工大内装修最现代化的楼宇之一，拥有许多排练厅琴房，排练厅占地都很大，装修非常现代，舞蹈厅和排练厅主要集中在三楼，可以举办健美操、瑜伽、交谊舞等集体活动。还有101 201 301剧场，话剧相声等的排练公演大都在此。一楼为退休职工提供乒乓球场地，不过并不对学生开放。</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">场馆位置</h4>\r\n");
      out.write("<div class=\"span4\">\r\n");
      out.write("<p></p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span8\">\r\n");
      out.write("<img src=\"image/6.jpg\" class=\"pull-right\" width=\"400\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">开放时间</h4>\r\n");
      out.write("<p></p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">联系人</h4>\r\n");
      out.write("<p></p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">电话</h4>\r\n");
      out.write("<p></p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">收费情况</h4>\r\n");
      out.write("<p></p>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
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
