package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ffielderror_005fkey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ffielderror_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ffielderror_005fkey_005fnobody.release();
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
      out.write("<title>管理员</title>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t<link href=\"bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("\t<link href=\"bootstrap-responsive.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"backAction\" method=\"post\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<h1 class=\"page-header\" >哈工大健身网<img src=\"image/logo.jpg\"></h1>\r\n");
      out.write("\t<div class=\"page-header\" align=\"center\"><h4>欢迎您，");
      if (_jspx_meth_s_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("室管理员</h4></div>\r\n");
      out.write("\t<div align=\"center\">场馆信息表</div>\r\n");
      out.write("<table class=\"table table-bordered\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td><label>已用情况</label><input type=\"text\" name=\"usedNumber\"> ");
      if (_jspx_meth_s_005ffielderror_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("\t<td><label>总共可用</label><input type=\"text\" name=\"totalNumber\"></td>\r\n");
      out.write("\t<td><label>联系人</label><input type=\"text\" name=\"adminName\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td><label>联系电话</label><input type=\"text\" name=\"telNumber\"></td>\r\n");
      out.write("\t<td><label>开放时间</label><input type=\"text\" name=\"time\"></td>\r\n");
      out.write("\t<td><label>收费情况</label><input type=\"text\" name=\"price\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table class=\"table table-bordered\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td><label>场馆介绍</label><textarea rows=\"6\" class=\"span5\" name=\"introduction\"></textarea></td>\r\n");
      out.write("\t<td><label>比赛通知</label><textarea rows=\"6\" class=\"span5\" name=\"news\"></textarea></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<button type=\"submit\" class=\"btn btn-default\">提交</button>\r\n");
      out.write("<button type=\"reset\" class=\"btn btn-default\">取消</button>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<h4 class=\"page-header\" align=\"center\">当前订单详情</h4>\r\n");
      out.write("<table class=\"table table-bordered\">\r\n");
      out.write("   <thead>\r\n");
      out.write("      <tr>\r\n");
      out.write("         <th><div align=\"center\">预订人用户名</div></th>\r\n");
      out.write("         <th><div align=\"center\">学院</div></th>\r\n");
      out.write("         <th><div align=\"center\">时间</div></th>\r\n");
      out.write("\t\t <th><div align=\"center\">删除订单记录</div></th>\r\n");
      out.write("      </tr>\r\n");
      out.write("   </thead>\r\n");
      out.write("   <tbody>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("         <td><div align=\"center\">小明</div></td>\r\n");
      out.write("         <td><div align=\"center\">计算机</div></td>\r\n");
      out.write("\t\t <td><div align=\"center\">6:30-7:30</div></td>\r\n");
      out.write("\t\t <td><div align=\"center\"><button type=\"button\" class=\"btn btn-link\">删除</button></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("   </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
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

  private boolean _jspx_meth_s_005fproperty_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent(null);
    // /admin.jsp(15,49) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("#session.gymName");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ffielderror_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_005ffielderror_005f0 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _005fjspx_005ftagPool_005fs_005ffielderror_005fkey_005fnobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_005ffielderror_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ffielderror_005f0.setParent(null);
    // /admin.jsp(19,62) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f0.setKey("msg");
    int _jspx_eval_s_005ffielderror_005f0 = _jspx_th_s_005ffielderror_005f0.doStartTag();
    if (_jspx_th_s_005ffielderror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ffielderror_005fkey_005fnobody.reuse(_jspx_th_s_005ffielderror_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ffielderror_005fkey_005fnobody.reuse(_jspx_th_s_005ffielderror_005f0);
    return false;
  }
}
