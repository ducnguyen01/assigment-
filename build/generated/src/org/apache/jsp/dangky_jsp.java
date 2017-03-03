package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dangky_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <c:set var=\"root\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("         <link href=\"register.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <title>ĐĂNG KÝ</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("\t<div class=\"inHeaderLogin\"></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"loginForm\">\n");
      out.write("\t<div class=\"headLoginForm\">\n");
      out.write("            <center>Register</center>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"fieldLogin\">\n");
      out.write("            <form action=\"AccountServlet\" method=\"GET\">\n");
      out.write("            <span style=\"color:red;\">(*)</span>\n");
      out.write("\t<label>Tên Đăng Nhập</label><br>\n");
      out.write("        <input type=\"text\" class=\"login\" name=\"user\"><br><span style=\"color:red;\">(*)</span>\n");
      out.write("\t<label>Mật Khẩu :</label><br>\n");
      out.write("\t<input type=\"password\" class=\"login\" name=\"pass\"><br><span style=\"color:red;\">(*)</span>\n");
      out.write("        <label>Vai Trò :</label><br>\n");
      out.write("        <input type=\"text\" class=\"login\" name=\"vaitro\"><br><span style=\"color:red;\">(*)</span>\n");
      out.write("        <label>Họ Và Tên :</label><br>\n");
      out.write("        <input type=\"text\" class=\"login\" name=\"hoten\"><br><span style=\"color:red;\">(*)</span>\n");
      out.write("         <label>Địa Chỉ :</label><br>\n");
      out.write("        <input type=\"text\" class=\"login\" name=\"diachi\"><br><span style=\"color:red;\">(*)</span>\n");
      out.write("         <label>Email :</label><br>\n");
      out.write("        <input type=\"text\" class=\"login\" name=\"email\"><br><span style=\"color:red;\">(*)</span>\n");
      out.write("         <label>SĐT :</label><br>\n");
      out.write("        <input type=\"text\" class=\"login\" name=\"sdt\"><br><span style=\"color:red;\">(*)</span>\n");
      out.write("\n");
      out.write("             \n");
      out.write("                  <input type=\"submit\"  value=\"dk\"  name =\"dk\">\n");
      out.write("                 \n");
      out.write("                         \n");
      out.write("                  </form>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
