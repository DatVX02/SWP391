package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manageUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>User Management</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS\\manageUser.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"manage\">\n");
      out.write("        <div style=\"width: 20%; float:left\" class=\"managefunction\">\n");
      out.write("            <a href=\"managerUser.jsp\">Account Management</a>\n");
      out.write("            <a href=\"manageBlog.jsp\">Blog Management</a>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"width: 79%; float:right\" class=\"searchlist\">\n");
      out.write("            <div>\n");
      out.write("                <form action=\"*\" method=\"post\">\n");
      out.write("                    <input type=\"text\" name=\"txtSearchbyaccount\" placeholder=\"Tài khoản tìm kiếm\">\n");
      out.write("                    <input type=\"text\" name=\"txtSearchbystatus\" placeholder=\"Trạng thái hoạt động\">\n");
      out.write("                    <input type=\"button\" value=\"Tìm kiếm\" class=\"button\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"clear: both;\">\n");
      out.write("                <table>\n");
      out.write("                    <tr class=\"tablehead\">\n");
      out.write("                        <td>No.</td>\n");
      out.write("                        <td>Email</td>\n");
      out.write("                        <td>Full Name</td>\n");
      out.write("                        <td>Phone</td>\n");
      out.write("                        <td>Birth Date</td>\n");
      out.write("                        <td>Gender</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
