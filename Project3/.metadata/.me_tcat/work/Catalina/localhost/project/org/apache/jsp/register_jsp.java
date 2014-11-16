package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody.release();
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
      out.write("<form action=\"registerAction\" method=\"post\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<h1 class=\"page-header\" >哈工大健身网<img src=\"image/logo.jpg\"></h1>\r\n");
      out.write("<h4 class=\"page-header\" align=\"center\">用户注册</h4>\r\n");
      out.write("<div align=\"center\">");
      if (_jspx_meth_s_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("</div>\r\n");
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
      out.write("<span class=\"add-on\"><div class=\"span1\" align=\"center\">确认密码</div></span>\r\n");
      out.write("<input type=\"password\" placeholder=\"请再输入一次\" class=\"span3\" name=\"repassword\" />\r\n");
      out.write("</div></div>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<div class=\"input-prepend input-append\">\r\n");
      out.write("<span class=\"add-on\"><div class=\"span1\" align=\"center\">学号</div></span>\r\n");
      out.write("<input type=\"password\" placeholder=\"请输入学号\" class=\"span3\" name=\"number\" />\r\n");
      out.write("</div></div>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<div class=\"input-prepend input-append\">\r\n");
      out.write("<span class=\"add-on\"><div class=\"span1\" align=\"center\">学院</div></span>\r\n");
      out.write("<select class=\"span3\" name=\"college\">\r\n");
      out.write("<option value=\"航天学院\">航天学院</option>\r\n");
      out.write("<option value=\"机电工程学院\">机电工程学院</option>\r\n");
      out.write("<option value=\"材料科学与工程学院\">材料科学与工程学院</option>\r\n");
      out.write("<option value=\"电子与信息工程学院\">电子与信息工程学院</option>\r\n");
      out.write("<option value=\"能源科学与工程学院\">能源科学与工程学院</option>\r\n");
      out.write("<option value=\"电气工程及自动化学院\">电气工程及自动化学院</option>\r\n");
      out.write("<option value=\"理学院\">理学院</option>\r\n");
      out.write("<option value=\"经济与管理学院\">经济与管理学院</option>\r\n");
      out.write("<option value=\"人文与社会科学学院\">人文与社会科学学院</option>\r\n");
      out.write("<option value=\"土木工程学院\">土木工程学院</option>\r\n");
      out.write("<option value=\"市政环境工程学院\">市政环境工程学院</option>\r\n");
      out.write("<option value=\"建筑学院\">建筑学院</option>\r\n");
      out.write("<option value=\"交通科学与工程学院\">交通科学与工程学院</option>\r\n");
      out.write("<option value=\"计算机科学与技术学院\">计算机科学与技术学院</option>\r\n");
      out.write("<option value=\"软件学院\">软件学院</option>\r\n");
      out.write("<option value=\"法学院\">法学院</option>\r\n");
      out.write("<option value=\"化工学院\">化工学院</option>\r\n");
      out.write("<option value=\"食品科学与工程学院\">食品科学与工程学院</option>\r\n");
      out.write("<option value=\"外国语学院\">外国语学院</option>\r\n");
      out.write("<option value=\"媒体技术与艺术系\">媒体技术与艺术系</option>\r\n");
      out.write("<option value=\"生命科学与技术学院\">生命科学与技术学院</option>\r\n");
      out.write("<option value=\"马克思主义学院\">马克思主义学院</option>\r\n");
      out.write("<option value=\"基础学部\">基础学部</option>\r\n");
      out.write("<option value=\"基础与交叉科学研究院\">基础与交叉科学研究院</option>\r\n");
      out.write("<option value=\"实验学院\">实验学院</option>\r\n");
      out.write("<option value=\"其他学院\">其他学院</option>\r\n");
      out.write("</select>\r\n");
      out.write("</div></div>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("\t<input class=\"btn\" type=\"submit\" value=\"注册\"/>     \r\n");
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

  private boolean _jspx_meth_s_005fproperty_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent(null);
    // /register.jsp(16,20) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("information");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }
}
