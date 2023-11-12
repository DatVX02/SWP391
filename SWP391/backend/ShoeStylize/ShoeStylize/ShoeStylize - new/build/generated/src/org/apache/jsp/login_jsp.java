package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Error.LoginInsertError;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("        <link rel=\"icon\" href=\"image\\shoelogo.png\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/login.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <img src=\"image\\shoelogo.png\"\r\n");
      out.write("                 alt=\"Shoes stylize\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form\">\r\n");
      out.write("            <h1>Login Page</h1>\r\n");
      out.write("            <form action=\"MainController\">\r\n");
      out.write("                ");
 
                  LoginInsertError error = (LoginInsertError) request.getAttribute("INSERTERROR");
                  if (error != null) {
                
      out.write("\r\n");
      out.write("                <font color=\"red\">\r\n");
      out.write("                    ");
      out.print( error.getInvalid());
      out.write("\r\n");
      out.write("                </font>\r\n");
      out.write("                ");

                  }
                
      out.write("\r\n");
      out.write("                <p style=\"font-weight: bold\">Email:</p> <input type=\"text\" name=\"txtEmail\" value=\"\" style=\"margin-bottom: 20px\"/>\r\n");
      out.write("                <br/>\r\n");
      out.write("\r\n");
      out.write("                <p style=\"font-weight: bold\">Password:</p> <input type=\"password\" name=\"txtPassword\" value=\"\" style=\"margin-bottom: 20px\"/>\r\n");
      out.write("                <br/>\r\n");
      out.write("\r\n");
      out.write("                <div style=\"font-style: italic;\" class=\"form_2\">\r\n");
      out.write("                    <a href=\"FP.jsp\">\r\n");
      out.write("                        <h4> Forget password</h4>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"register.jsp\">\r\n");
      out.write("                        <h4 class=\"form_2_1\"> Create new account</h4>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("                <input type=\"submit\" class=\"button\"  name=\"btAction\" value=\"Login\"/>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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
