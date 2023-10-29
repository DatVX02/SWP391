package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addBlog_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Add Blog</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS\\addBlog.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <img src=\"image\\shoelogo.png\"\n");
      out.write("            alt=\"Shoes stylize\"></img>\n");
      out.write("        <button style=\"background: #FF0000; color: #fff;\">Manage Blog</button>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"manage\">\n");
      out.write("        <div style=\"width: 20%; float:left\" class=\"managefunction\">\n");
      out.write("            <a href=\"manageUser.jsp\">Account Management</a>\n");
      out.write("            <a href=\"manageBlog.jsp\">Blog Management</a>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"width: 79%; float:right\" class=\"addBLog\">\n");
      out.write("            <h2>Add Blog</h2>\n");
      out.write("            <form action=\"MainController\" method=\"post\">\n");
      out.write("                <p>Title: <input type=\"text\" name=\"txtTieude\" /></p>\n");
      out.write("                <p>Content: <input type=\"text\" name=\"txtTen\" /></p>\n");
      out.write("                <p>Poster: <input type=\"text\" name=\"txtAccount\" /></p>\n");
      out.write("                <p>Date submitted: <input type=\"date\" name=\"txtDate\" /></p>\n");
      out.write("                <p>Image: &nbsp<input type=\"file\" id=\"img\" name=\"img\" accept=\"image/*\"></p></br>\n");
      out.write("                <input type=\"submit\" name=\"btAction\" value=\"AddBlog\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
