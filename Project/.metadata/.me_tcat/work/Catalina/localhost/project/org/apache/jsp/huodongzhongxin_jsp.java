package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class huodongzhongxin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>Home Page</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"mm_training.css\" type=\"text/css\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tfont-size: 36px;\r\n");
      out.write("\tcolor: #CCCCCC;\r\n");
      out.write("}\r\n");
      out.write(".STYLE2 {line-height:16px; font: 11px Arial, Helvetica, sans-serif;}\r\n");
      out.write(".STYLE3 {\r\n");
      out.write("\tfont-size: 24px;\r\n");
      out.write("\tcolor: #339966;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#64748B\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t<tr bgcolor=\"#26354A\">\r\n");
      out.write("\t<td width=\"15\" nowrap=\"nowrap\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"15\" height=\"1\" border=\"0\" /></td>\r\n");
      out.write("\t<td height=\"70\" colspan=\"3\" nowrap=\"nowrap\" class=\"logo STYLE1\">活动中心<span class=\"STYLE2\"></span></td>\r\n");
      out.write("\t<td width=\"40\">&nbsp;</td>\r\n");
      out.write("\t<td width=\"100%\">&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr bgcolor=\"#FF6600\">\r\n");
      out.write("\t<td colspan=\"6\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"1\" height=\"4\" border=\"0\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr bgcolor=\"#D3DCE6\">\r\n");
      out.write("\t<td colspan=\"6\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"1\" height=\"1\" border=\"0\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr bgcolor=\"#FFCC00\">\r\n");
      out.write("\t<td width=\"15\" nowrap=\"nowrap\">&nbsp;</td>\r\n");
      out.write("\t<td width=\"705\" colspan=\"3\" height=\"24\">\r\n");
      out.write("\t<table width=\"905\" border=\"0\" cellpadding=\"0\" cellspacing=\"10\" id=\"navigation\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"navText\" align=\"center\" nowrap=\"nowrap\"><a href=\"plan.jsp\" class=\"STYLE8\">个人健身计划   </a></td>\r\n");
      out.write("          <td class=\"navText\" align=\"center\" nowrap=\"nowrap\"><a href=\"zhengxin.jsp\" class=\"STYLE8\">正心楼  </a></td>\r\n");
      out.write("          <td class=\"navText\" align=\"center\" nowrap=\"nowrap\"><a href=\"tiyuchang.jsp\" class=\"STYLE8\">体育场</a></td>\r\n");
      out.write("          <td class=\"navText\" align=\"center\" nowrap=\"nowrap\"><a href=\"tiyubu.jsp\" class=\"STYLE8\">体育部</a></td>\r\n");
      out.write("          <td class=\"navText\" align=\"center\" nowrap=\"nowrap\"><a href=\"huodongzhongxin.jsp\" class=\"STYLE8\">活动中心</a></td>\r\n");
      out.write("\t\t  <td class=\"navText\" align=\"center\" nowrap=\"nowrap\"><a href=\"youyongguan.jsp\" class=\"STYLE8\">游泳馆</a></td>\r\n");
      out.write("\t\t  <td class=\"navText\" align=\"center\" nowrap=\"nowrap\"><a href=\"2tiyuchang.jsp\" class=\"STYLE8\">第二体育场</a></td>\r\n");
      out.write("\t\t  <td class=\"navText\" align=\"center\" nowrap=\"nowrap\"><a href=\"main.jsp\" class=\"STYLE8\">返回主页面</a></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\t</td>\r\n");
      out.write("\t<td width=\"40\">&nbsp;</td>\r\n");
      out.write("\t<td width=\"100%\">&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr bgcolor=\"#D3DCE6\">\r\n");
      out.write("\t<td colspan=\"6\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"1\" height=\"1\" border=\"0\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr bgcolor=\"#FF6600\">\r\n");
      out.write("\t<td colspan=\"6\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"1\" height=\"4\" border=\"0\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr bgcolor=\"#D3DCE6\">\r\n");
      out.write("\t<td width=\"230\" colspan=\"2\" valign=\"top\" bgcolor=\"#26354A\"><div align=\"center\"><img src=\"image/6.jpg\" width=\"580\" height=\"400\" /><br />\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t  <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"230\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td width=\"230\" class=\"sidebarText\" id=\"padding\"><div align=\"left\"><img src=\"image/201322216220565.jpg\" width=\"580\" height=\"400\" /><br />\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  &nbsp;<br />\t\t\r\n");
      out.write("\t\t  </div></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\t</td>\r\n");
      out.write("\t<td width=\"50\" valign=\"top\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"50\" height=\"1\" border=\"0\" /></td>\r\n");
      out.write("\t<td width=\"440\" valign=\"top\"><br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"440\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td class=\"pageName\"><p>活动中心：</p>\r\n");
      out.write("\t\t  <p>有乒乓球馆等。</p></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td class=\"bodyText\">\r\n");
      out.write("\t\t<p>&nbsp;</p>\r\n");
      out.write("\t\t<p align=\"justify\" class=\"STYLE3\">一个看似不起眼的地方，却承托着不少的任务，不管是百度还是其他演讲以及教授的讲演，都在这个默默不出名的地方举行，里面那温馨而又浪漫的环境，不仅仅是能体会到家的感觉，更是让人感受到爱的味道，它就是活动中心，期待你我相遇与乒乓场内，体验那种小球带来的独特的美，中国的国球意味不一般之乐。</p></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t&nbsp;<br />\t</td>\r\n");
      out.write("\t<td width=\"40\">&nbsp;</td>\r\n");
      out.write("\t<td width=\"100%\">&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr bgcolor=\"#D3DCE6\">\r\n");
      out.write("\t<td colspan=\"6\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"1\" height=\"1\" border=\"0\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td width=\"15\">&nbsp;</td>\r\n");
      out.write("\t<td width=\"215\">&nbsp;</td>\r\n");
      out.write("\t<td width=\"50\">&nbsp;</td>\r\n");
      out.write("\t<td width=\"440\">&nbsp;</td>\r\n");
      out.write("\t<td width=\"40\">&nbsp;</td>\r\n");
      out.write("\t<td width=\"100%\">&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
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
