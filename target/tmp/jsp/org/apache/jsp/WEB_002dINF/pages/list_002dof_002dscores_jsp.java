/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.2.v20140723
 * Generated at: 2015-12-27 13:09:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_002dof_002dscores_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/Users/SunskyXH/.m2/repository/org/springframework/spring-webmvc/3.2.2.RELEASE/spring-webmvc-3.2.2.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1363154214000L));
    _jspx_dependants.put("jar:file:/Users/SunskyXH/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1384339662000L));
    _jspx_dependants.put("file:/Users/SunskyXH/.m2/repository/org/springframework/spring-webmvc/3.2.2.RELEASE/spring-webmvc-3.2.2.RELEASE.jar", Long.valueOf(1450357466000L));
    _jspx_dependants.put("file:/Users/SunskyXH/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar", Long.valueOf(1447868810000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zh-CN\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" href=\"../../favicon.ico\">\n");
      out.write("\n");
      out.write("    <title>学生信息</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/dashboard.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"/\">学生成绩管理系统</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a href=\"#\" class=\" dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-plus\" aria-hidden=\"true\"> </span>添加<span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a href=\"/student/add\">添加学生</a></li>\n");
      out.write("                        <li><a href=\"/teacher/add\">添加教师</a></li>\n");
      out.write("                        <li><a href=\"/staff/add\">添加职工</a></li>\n");
      out.write("                        <li><a href=\"/course/add\">添加课程</a></li>\n");
      out.write("                        <li><a href=\"/score/add\">添加成绩</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <form class=\"navbar-form navbar-right\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"搜索...\">\n");
      out.write("                <button type=\"submit\" class=\" btn  btn-primary\">搜索</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-3 col-md-2 sidebar\">\n");
      out.write("            <ul class=\"nav nav-sidebar\">\n");
      out.write("                <li><a href=\"/overview\">概览 </a></li>\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/student/list.html\">\n");
      out.write("                    学生信息<span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                <li><a href=\"/teacher/list\">教师信息</a></li>\n");
      out.write("                <li><a href=\"/staff/list\">职工信息</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"nav nav-sidebar\">\n");
      out.write("                <li><a href=\"/course/list\">课程信息</a> </li>\n");
      out.write("                <li class=\"active\" ><a href=\"/score/list\"><span class=\"glyphicon glyphicon-menu-right\" aria-hidden=\"true\"> </span>成绩信息</a></li>\n");
      out.write("                <li><a href=\"\">成绩排名</a></li>\n");
      out.write("                <li><a href=\"\">考试信息</a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"nav nav-sidebar\">\n");
      out.write("                <li><a href=\"/editinfo\">信息管理</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\">\n");
      out.write("            <h1 class=\"page-header\">学生信息</h1>\n");
      out.write("\n");
      out.write("            <div class=\"row placeholders\">\n");
      out.write("                <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("                    <img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/imgs/5.jpg\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("                    <h4>学生</h4>\n");
      out.write("                    <span class=\"text-muted\">进入学生页面</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("                    <img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/imgs/2.jpg\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("                    <h4>教师</h4>\n");
      out.write("                    <span class=\"text-muted\">进入教师页面</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("                    <img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/imgs/3.jpg\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("                    <h4>职工</h4>\n");
      out.write("                    <span class=\"text-muted\">进入职工页面</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("                    <img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/imgs/4.gif\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("                    <h4>未知</h4>\n");
      out.write("                    <span class=\"text-muted\">不知道拿来干啥</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <h2 class=\"sub-header\">成绩信息</h2>\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <table class=\"table table-striped\">\n");
      out.write("                    <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>学生</th>\n");
      out.write("                        <th>科目</th>\n");
      out.write("                        <th>教师</th>\n");
      out.write("                        <th>分数</th>\n");
      out.write("                    </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Bootstrap core JavaScript\n");
      out.write("================================================== -->\n");
      out.write("<!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/pages/list-of-scores.jsp(120,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setVar("score");
    // /WEB-INF/pages/list-of-scores.jsp(120,20) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/list-of-scores.jsp(120,20) '${scores}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${scores}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <tr>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${score.student}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${score.course}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${score.teacher}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${score.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        </tr>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
