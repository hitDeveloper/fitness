package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
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
      out.write("\t<li class=\"active\"><a href=\"main.jsp\">首页</a></li>\r\n");
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
      out.write("\t<li class=\"active\"><a href=\"#info\" data-toggle=\"tab\">最新消息</a></li>\r\n");
      out.write("\t<li><a href=\"#article\" data-toggle=\"tab\">文章分享</a></li>\r\n");
      out.write("\t<li><a href=\"#photo\" data-toggle=\"tab\">图片分享</a></li>\r\n");
      out.write("\t<li><a href=\"#activity\" data-toggle=\"tab\">网站近期活动</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("<div class=\"tab-content\">\r\n");
      out.write("<div class=\"tab-pane active\" id=\"info\">\r\n");
      out.write("<div class=\"page-header\">1.场馆通知</div>\r\n");
      out.write("<p>体育场正在施工中，停止对外开放，重新开放时间另行通知，给大家带来的不变，敬请谅解！<p>\r\n");
      out.write("<div class=\"page-header\">2.收费通知</div>\r\n");
      out.write("<p>部分体育场停止收费，但取消对校外人士的开放，望周知！<p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"tab-pane\" id=\"article\">\r\n");
      out.write("<div class=\"page-header\" align=\"center\">跑步的装备</div>\r\n");
      out.write("<p>一双好的跑步鞋是必不可少的，价格昂贵并不等于那鞋就会更好，挑选适合你的跑步鞋要看你的体重，脚的形状，你跑步的方式和你伤病情况。买鞋之前要试穿一下，并试跑一小会，看看是不是有足够的弹性和是否合脚，另外鞋底要较易于弯曲，如果你抓住鞋的两头来折弯它，弯曲最大大部分应该在脚掌部分，脚跟部分要合适，太大的话会使你跑步的时候不稳定，这样容易损伤脚踝。</p>\r\n");
      out.write("\r\n");
      out.write("<p>另外一个重要的注意事项是跑步的路面，如果可能的话，最好在土路或是塑胶跑道是健身，这样对你关节的冲击力会减少，如果你只能找到水泥地或沥青地面跑步，那你的跑鞋要选择鞋底弹性大一点的，帮助你对减少对关节的冲击，经常更换跑鞋也是非常必要的，一双鞋的最佳状态也就能保持半年到一年。</p>\r\n");
      out.write("\r\n");
      out.write("<p>跑步的正确姿势：</p>\r\n");
      out.write("<p>很多人跑步时喜欢低头向下看，好像脚尖前面正在放映美国大片，低头往往会导致整个背部和颈部前屈，脊柱也就不在正常生理状态，承受冲击力的能力也大打折扣，这就为运动损伤奠定了坚实的基础。腹肌应该收紧，后背也不要太向后弯，臀部也不要太向后翘，肩膀应该放松。不要耸肩，往往自己意识不到身体姿势的错误，经常询问同伴或朋友你的跑步姿势是否正确，摆臂应该在靠近身体两侧，也就是我们说的胳膊肘不要向外拐，不要握拳太紧。跑步时抬起前腿的膝盖而伸直后退，步子太小就像带了脚链一样别扭，让脚跟先着地，在到脚掌和脚趾，不要整个脚掌同时着地，否则你的膝关节跟小腿经受不住长期的冲击。</p>\r\n");
      out.write("\r\n");
      out.write("<p>给新手的建议：</p>\r\n");
      out.write("\r\n");
      out.write("<p>1.开始的时候走一段，跑一段。慢慢地减少走的时间，直到你能跑上20分钟，然后再逐步延长跑的时间。</p>\r\n");
      out.write("<p>2.逐步延长跑步的距离，每周延长不要超过10%，关键是长期坚持，而不是超过马家军。</p>\r\n");
      out.write("<p>3.不要每天跑步，每周至少休息两天，另外交叉训练也很重要，换成骑车，游泳或登山。</p>\r\n");
      out.write("<p>4.如果你的脚踝，膝关节或者下腰有疼痛，暂停跑步，这样让你的身体有个休养生息的机会</p>\r\n");
      out.write("\r\n");
      out.write("<p>为什么柔韧性很重要？</p>\r\n");
      out.write("\r\n");
      out.write("<p>柔韧性是指你的关节的活动范围有多大。一个柔韧性好的人身体姿势看起来放松，自然，走起路来，步子\r\n");
      out.write("大，运动起来也游刃有余。随着年龄的增长，你的肌腱（连接肌肉和骨骼的部分）慢慢会变短变紧，这样\r\n");
      out.write("也就限制了你的活动范围。有些老年人步子很小，走每一步都像往前摔一小跤，背她显得很僵硬，而当他\r\n");
      out.write("们都要弯腰捡点东西时，简直比登天还难。其实，不光是老年人，很多年轻人的柔韧性也不好，容易引发\r\n");
      out.write("身体的好多病痛，也容易受伤。</p>\r\n");
      out.write("\r\n");
      out.write("<p>柔韧性好也是正确身体姿势的前提，如果你脖子前面的肌肉紧张，你的头会往前低。如果你的胸和肩部的\r\n");
      out.write("肌肉紧张，你的双肩会被拉向前，形成窝胸。如果你的下腰和大腿后部的肌肉紧张，那么你的脊柱形态会\r\n");
      out.write("改变，而后腰痛或腰椎病往往就不远了。</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"tab-pane\" id=\"photo\">\r\n");
      out.write("<ul class=\"thumbnails\">\r\n");
      out.write("<li class=\"span3\"><a class=\"thumbnail\"><img src=\"image/gym/zhengxinlou/yumaoqiu/s_5150cde22c817cdbb200c38373fe0d1f262360.jpg\" alt=\"\"></a></li>\r\n");
      out.write("<li class=\"span3\"><a class=\"thumbnail\"><img src=\"image/gym/diertiyuchang/wangqiu/20120924141580938093.jpg\" alt=\"\"></a></li>\r\n");
      out.write("<li class=\"span3\"><a class=\"thumbnail\"><img src=\"image/gym/tiyubu/pingpangqiu/cg(12).jpg\" alt=\"\"></a></li>\r\n");
      out.write("<li class=\"span3\"><a class=\"thumbnail\"><img src=\"image/gym/tiyubu/lanqiu/201052614465.jpg\" alt=\"\"></a></li>\r\n");
      out.write("<li class=\"span3\"><a class=\"thumbnail\"><img src=\"image/gym/tiyubu/lanqiu/2010526144528.jpg\" alt=\"\"></a></li>\r\n");
      out.write("<li class=\"span3\"><a class=\"thumbnail\"><img src=\"image/gym/tiyubu/lanqiu/2007326201241374.jpg\" alt=\"\"></a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"tab-pane\" id=\"activity\">\r\n");
      out.write("<div class=\"page-header\">环校跑</div>\r\n");
      out.write("<p>我们将在11月1日举办环校跑活动，请有意愿参加的同学晚上七点钟在篮球场前集合。</p>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
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
