package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class zhengxin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"container\">\r\n");
      out.write("<h1 class=\"page-header\" >哈工大健身网<img src=\"image/logo.jpg\"></h1>\r\n");
      out.write("<div class=\"navbar\">\r\n");
      out.write("<div class=\"navbar-inner\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<ul class=\"nav\">\r\n");
      out.write("\t<li ><a href=\"main.jsp\">首页</a></li>\r\n");
      out.write("\t<li class=\"divider-vertical\"></li>\r\n");
      out.write("\t<li class=\"active\"><a href=\"zhengxin.jsp\">正心楼</a></li>\r\n");
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
      out.write("\t<li class=\"active\"><a href=\"#pingpong\" data-toggle=\"tab\">乒乓球</a></li>\r\n");
      out.write("\t<li><a href=\"#yumaoqiu\" data-toggle=\"tab\">羽毛球</a></li>\r\n");
      out.write("\t<li><a href=\"#wudao\" data-toggle=\"tab\">舞蹈教室</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("<div class=\"tab-content\">\r\n");
      out.write("<div class=\"tab-pane active\" id=\"pingpong\">\r\n");
      out.write("<div class=\"span6\">\r\n");
      out.write("<div class=\"carousel slide\" id=\"carousel1\">\r\n");
      out.write("<div class=\"carousel-inner\">\r\n");
      out.write("<div class=\"item active\">\r\n");
      out.write("<img src=\"image/gym/zhengxinlou/pingpangqiu/200791011446618.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/zhengxinlou/pingpangqiu/160S0355A4.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/zhengxinlou/pingpangqiu/7096_1324380234pF3x.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/zhengxinlou/pingpangqiu/2013222161721926.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<a href=\"#carousel1\" data-slide=\"prev\" class=\"left carousel-control\">&lsaquo;</a>\r\n");
      out.write("<a href=\"#carousel1\" data-slide=\"next\" class=\"right carousel-control\">&rsaquo;</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("<h4 class=\"page-header\">场馆介绍</h4>\r\n");
      out.write("<p>哈工大正心楼体育馆于2005年7月动工，2007年正式交付使用。体育馆位于正心楼地下室，设有羽毛球场，乒乓球场，体育舞蹈室、健美操室。每学期，体育部在此开设各种培训班，丰富学生课外生活，指导学生体育技能，培养学生正确的健身方法。</p>\r\n");
      out.write("<p>其中乒乓球室拥有19个乒乓球桌，是我校乒乓球桌拥有量最大的健身场馆。乒乓球设施全部使用高档品牌球桌，球拍可以自备，也可以在服务台以平价购买，同时提供球拍贴胶等维护修理服务，乒乓球场地为校内学生免费提供使用。</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">场馆位置</h4>\r\n");
      out.write("<div class=\"span4\">\r\n");
      out.write("<p>正心楼地下一层</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span8\">\r\n");
      out.write("<img src=\"image/1.jpg\" class=\"pull-right\" width=\"400\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">开放时间</h4>\r\n");
      out.write("<p>06:00-21:30</p>\r\n");
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
      out.write("<p>免费，但如需学习课程需要交培训费，价格不等</p>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"tab-pane\" id=\"yumaoqiu\">\r\n");
      out.write("<div class=\"span6\">\r\n");
      out.write("<div class=\"carousel slide\" id=\"carousel2\">\r\n");
      out.write("<div class=\"carousel-inner\">\r\n");
      out.write("<div class=\"item active\">\r\n");
      out.write("<img src=\"image/gym/zhengxinlou/yumaoqiu/20090427093350883.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/zhengxinlou/yumaoqiu/20090518151332698.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/zhengxinlou/yumaoqiu/20090518151325566.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/zhengxinlou/yumaoqiu/20090518151319672.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<a href=\"#carousel2\" data-slide=\"prev\" class=\"left carousel-control\">&lsaquo;</a>\r\n");
      out.write("<a href=\"#carousel2\" data-slide=\"next\" class=\"right carousel-control\">&rsaquo;</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("<h4 class=\"page-header\">场馆介绍</h4>\r\n");
      out.write("<p>哈工大正心楼体育馆于2005年7月动工，2007年正式交付使用。体育馆位于正心楼地下室，设有羽毛球场，乒乓球场，体育舞蹈室、健美操室。每学期，体育部在此开设各种培训班，丰富学生课外生活，指导学生体育技能，培养学生正确的健身方法。</p>\r\n");
      out.write("<p>地下室内占地最大的是学生们最喜欢的羽毛球场地，羽毛球室分为3个区，共有12个场地。羽毛球室宽敞高大，高度至少有7米，白天有自然采光，由于开放时间达到晚上9点半，所以灯光设施也极好。这也是工大内和篮球场一样火爆的场地了，如果是周末，一定要早点来才会有场地。</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">场馆位置</h4>\r\n");
      out.write("<div class=\"span4\">\r\n");
      out.write("<p>正心楼地下一层</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<img src=\"image/1.jpg\" class=\"pull-right\" width=\"400\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">开放时间</h4>\r\n");
      out.write("<p>06:00-21:30</p>\r\n");
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
      out.write("<p>免费，但如需学习课程需要交培训费，价格不等</p>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"tab-pane\" id=\"wudao\">\r\n");
      out.write("<div class=\"span6\">\r\n");
      out.write("<div class=\"carousel slide\" id=\"carousel3\">\r\n");
      out.write("<div class=\"carousel-inner\">\r\n");
      out.write("<div class=\"item active\">\r\n");
      out.write("<img src=\"image/gym/zhengxinlou/wudaojiaoshi/cg(13).jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/zhengxinlou/wudaojiaoshi/u=3457288260,733846613&fm=23&gp=0.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/zhengxinlou/wudaojiaoshi/20090610135412554.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("<img src=\"image/gym/zhengxinlou/wudaojiaoshi/20090427093504598.jpg\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<a href=\"#carousel3\" data-slide=\"prev\" class=\"left carousel-control\">&lsaquo;</a>\r\n");
      out.write("<a href=\"#carousel3\" data-slide=\"next\" class=\"right carousel-control\">&rsaquo;</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("<h4 class=\"page-header\">场馆介绍</h4>\r\n");
      out.write("<p>哈工大正心楼体育馆于2005年7月动工，2007年正式交付使用。体育馆位于正心楼地下室，设有羽毛球场，乒乓球场，体育舞蹈室、健美操室。每学期，体育部在此开设各种培训班，丰富学生课外生活，指导学生体育技能，培养学生正确的健身方法。</p>\r\n");
      out.write("<p>体育馆内拥有一个舞蹈室，场地较大，地面采用复合地板，全尺寸贴墙平面镜，让每一个动作完美展现。该教室同体育部一样开设多种收费课程，、具体收费标准和开课时间请在体育部或正心楼地下体育馆服务台处查询。</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">场馆位置</h4>\r\n");
      out.write("<div class=\"span4\">\r\n");
      out.write("<p>正心楼地下一层</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<img src=\"image/1.jpg\" class=\"pull-right\" width=\"400\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h4 class=\"page-header\">开放时间</h4>\r\n");
      out.write("<p>06:00-21:30</p>\r\n");
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
      out.write("<p>免费，但如需学习课程需要交培训费，价格不等</p>\r\n");
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
