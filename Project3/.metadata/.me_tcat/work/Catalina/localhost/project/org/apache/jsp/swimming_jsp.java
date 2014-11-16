package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class swimming_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<li class=\"active\"><a href=\"swimming.jsp\">游泳馆</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("\t<li><a href=\"gym2.jsp\">第二体育场</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("\t<li><a href=\"xiaozuqiuchang.jsp\">小足球场</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("\t<li><a href=\"myplan.jsp\">健身计划</a></li>\r\n");
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
      out.write("\r\n");
      out.write("<div class=\"tabbable tabs-left\">\r\n");
      out.write("<ul class=\"nav nav-tabs\">\r\n");
      out.write("\t<li class=\"active\"><a href=\"#center\" data-toggle=\"tab\">游泳馆</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("<div class=\"tab-content\">\r\n");
      out.write("<div class=\"tab-pane active\" id=\"center\">\r\n");
      out.write("<div class=\"span6\">\r\n");
      out.write("<div class=\"carousel slide\" id=\"carousel1\">\r\n");
      out.write("<div class=\"carousel-inner\">\r\n");
      out.write("<div class=\"item active\">\r\n");
      out.write("<img src=\"image/gym/youyongguan/20097297567.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/youyongguan/200972975628297.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/youyongguan/d0f49e8f-0f18-4361-8ef3-e573a51736d8.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<a href=\"#carousel1\" data-slide=\"prev\" class=\"left carousel-control\">&lsaquo;</a>\r\n");
      out.write("<a href=\"#carousel1\" data-slide=\"next\" class=\"right carousel-control\">&rsaquo;</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("<h4 class=\"page-header\">场馆介绍</h4>\r\n");
      out.write("<p>哈工大游泳馆建设项目于2007年6月正式开工建设，2009年正式投入使用。游泳馆总建筑面积11500平方米，地上四层，\r\n");
      out.write("局部地下一层。第一层为门厅、更衣和淋浴等用房，第二层和第四层分设两个50×25米标准游泳池，其中，第二层游泳池为浅水池（1.0—1.5米），\r\n");
      out.write("第四层游泳池为深水池（1.3—2.0米）。游泳馆水质处理采用石英砂过滤+全流臭氧消毒工艺，为世界上最为先进的循环水处理工艺，在2008年北京奥运会水立方和国家奥体中心两个主场馆都采用此工艺，\r\n");
      out.write("可达到国际游泳协会（FINA）的水质标准。价格优惠，凭证入馆，刷卡消费。只对校内学生、职工及家属开放。</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">场馆位置</h4>\r\n");
      out.write("<div class=\"span4\">\r\n");
      out.write("<p></p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span8\">\r\n");
      out.write("<img src=\"image/7.jpg\" class=\"pull-right\" width=\"400\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">开放时间</h4>\r\n");
      out.write("<p>早场06:00-08:00，日场09:00-21:00</p>\r\n");
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
      out.write("<p>早场￥5/2小时（学生） ￥8/2小时（教工），日场￥6/2小时（学生）￥10/2小时（教工）</p>\r\n");
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
