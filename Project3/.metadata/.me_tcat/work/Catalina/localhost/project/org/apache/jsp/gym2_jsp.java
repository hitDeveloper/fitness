package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class gym2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<li ><a href=\"main.jsp\">首页</a></li>\r\n");
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
      out.write("\t<li class=\"active\"><a href=\"gym2.jsp\">第二体育场</a></li>\r\n");
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
      out.write("\t<li class=\"active\"><a href=\"#pingpong\" data-toggle=\"tab\">篮球</a></li>\r\n");
      out.write("\t<li><a href=\"#yumaoqiu\" data-toggle=\"tab\">排球</a></li>\r\n");
      out.write("\t<li><a href=\"#wudao\" data-toggle=\"tab\">网球</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("<div class=\"tab-content\">\r\n");
      out.write("<div class=\"tab-pane active\" id=\"pingpong\">\r\n");
      out.write("<div class=\"span6\">\r\n");
      out.write("<div class=\"carousel slide\" id=\"carousel1\">\r\n");
      out.write("<div class=\"carousel-inner\">\r\n");
      out.write("<div class=\"item active\">\r\n");
      out.write("<img src=\"image/gym/diertiyuchang/lanqiu/49f22321gdf476f7cad1a&690.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/diertiyuchang/lanqiu/20090519145956690.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/diertiyuchang/lanqiu/cg(9).jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/diertiyuchang/lanqiu/u=349218685,1379723717&fm=23&gp=0.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<a href=\"#carousel1\" data-slide=\"prev\" class=\"left carousel-control\">&lsaquo;</a>\r\n");
      out.write("<a href=\"#carousel1\" data-slide=\"next\" class=\"right carousel-control\">&rsaquo;</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("<h4 class=\"page-header\">场馆介绍</h4>\r\n");
      out.write("<p>哈工大第二体育场，是哈工大一校区内最大的一块室外运动场地，全部场地采用硅PU材料地面，防滑减震效果出色，场地干净整洁，并配有出色的保洁设施。即使是雨雪天气刚刚结束也能迅速恢复比赛场地。该体育场承办过许多院系级别的篮球、网球、排球比赛，是工大学子们室外活动的理想选择。</p>\r\n");
      out.write("<p>其中，本场地拥有篮球全场十块，共有20块篮球架均采用机械升降配置，场地尺寸遵从国际篮联要求，以近几年为例承办过李宁杯、学院杯、航天杯等多次篮球比赛。如果你有篮球的天赋，快来这里，满足你所有的篮球愿望！</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">场馆位置</h4>\r\n");
      out.write("<div class=\"span4\">\r\n");
      out.write("<p></p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span8\">\r\n");
      out.write("<img src=\"image/8.jpg\" class=\"pull-right\" width=\"400\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">开放时间</h4>\r\n");
      out.write("<p>08:00-17:00</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">联系人</h4>\r\n");
      out.write("<p>张新</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">电话</h4>\r\n");
      out.write("<p>86403293</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">收费情况</h4>\r\n");
      out.write("<p>学生凭学生卡免费</p>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"tab-pane\" id=\"yumaoqiu\">\r\n");
      out.write("<div class=\"span6\">\r\n");
      out.write("<div class=\"carousel slide\" id=\"carousel2\">\r\n");
      out.write("<div class=\"carousel-inner\">\r\n");
      out.write("<div class=\"item active\">\r\n");
      out.write("<img src=\"image/gym/diertiyuchang/paiqiu/2009042982126777.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/diertiyuchang/paiqiu/2009042982357589.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/diertiyuchang/paiqiu/20116109232827742.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<a href=\"#carousel2\" data-slide=\"prev\" class=\"left carousel-control\">&lsaquo;</a>\r\n");
      out.write("<a href=\"#carousel2\" data-slide=\"next\" class=\"right carousel-control\">&rsaquo;</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("<h4 class=\"page-header\">场馆介绍</h4>\r\n");
      out.write("<p>哈工大第二体育场，是哈工大一校区内最大的一块室外运动场地，全部场地采用硅PU材料地面，防滑减震效果出色，场地干净整洁，并配有出色的保洁设施。即使是雨雪天气刚刚结束也能迅速恢复比赛场地。该体育场承办过许多院系级别的篮球、网球、排球比赛，是工大学子们室外活动的理想选择。</p>\r\n");
      out.write("<p>其中，本场地拥有排球场地6块，单场地尺寸18*9米，网高约2.3米（不区分男子排球及女子排球）。这里也是工大内唯一的免费排球场地。虽然由于国内学生对于排球兴趣略低，但也使得排球场地始终充足，而且是留学生们最爱聚集的地方，如果想认识更多更酷的朋友，就来排球场吧！</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">场馆位置</h4>\r\n");
      out.write("<div class=\"span4\">\r\n");
      out.write("<p></p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<img src=\"image/8.jpg\" class=\"pull-right\" width=\"400\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">开放时间</h4>\r\n");
      out.write("<p>08:00-17:00</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">联系人</h4>\r\n");
      out.write("<p>张新</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">电话</h4>\r\n");
      out.write("<p>86403293</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">收费情况</h4>\r\n");
      out.write("<p>学生凭学生卡免费</p>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"tab-pane\" id=\"wudao\">\r\n");
      out.write("<div class=\"span6\">\r\n");
      out.write("<div class=\"carousel slide\" id=\"carousel3\">\r\n");
      out.write("<div class=\"carousel-inner\">\r\n");
      out.write("<div class=\"item active\">\r\n");
      out.write("<img src=\"image/gym/diertiyuchang/wangqiu/1-130P6131912.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/diertiyuchang/wangqiu/2012619145945763.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/diertiyuchang/wangqiu/20120924141553755375.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/diertiyuchang/wangqiu/20120924141580938093.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<a href=\"#carousel3\" data-slide=\"prev\" class=\"left carousel-control\">&lsaquo;</a>\r\n");
      out.write("<a href=\"#carousel3\" data-slide=\"next\" class=\"right carousel-control\">&rsaquo;</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("<h4 class=\"page-header\">场馆介绍</h4>\r\n");
      out.write("<p>哈工大第二体育场，是哈工大一校区内最大的一块室外运动场地，全部场地采用硅PU材料地面，防滑减震效果出色，场地干净整洁，并配有出色的保洁设施。即使是雨雪天气刚刚结束也能迅速恢复比赛场地。该体育场承办过许多院系级别的篮球、网球、排球比赛，是工大学子们室外活动的理想选择。</p>\r\n");
      out.write("<p>其中，本场地拥有网球场地11块，尺寸满足国家标准，并针对降雨排水问题对场地进行优化，保证在最短时间内恢复场地的正常使用。场地四周均有高度约4米的铁丝拦网，保证即使你用100个球来练习，也可以保证不飞出场地之外。网球是最近几年来火爆度越来越高的潮流运动，所以快来网球场释放你的运动激情吧！</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">场馆位置</h4>\r\n");
      out.write("<div class=\"span4\">\r\n");
      out.write("<p></p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<img src=\"image/8.jpg\" class=\"pull-right\" width=\"400\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">开放时间</h4>\r\n");
      out.write("<p>08:00-17:00</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">联系人</h4>\r\n");
      out.write("<p>张新</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">电话</h4>\r\n");
      out.write("<p>86403293</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">收费情况</h4>\r\n");
      out.write("<p>学生凭学生卡免费</p>\r\n");
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
