package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Error.LoginInsertError;

public final class FP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Login</title>\n");
      out.write("    <link rel=\"icon\"\n");
      out.write("        href=\"image\\shoelogo.png\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/FP.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <img src=\"image\\shoelogo.png\"\n");
      out.write("            alt=\"Shoes stylize\">\n");
      out.write("    </div> \n");
      out.write("\n");
      out.write("    <form action=\"MainController\">\n");
      out.write("        <div class=\"input\" >\n");
      out.write("            <h1>Forgot Password</h1>\n");
      out.write("            <h3>Email</h3>\n");
      out.write("            <input type=\"text\" name=\"txtEmail\" value=\"\" required><br>\n");
      out.write("            <button name=\"btAction\" value=\"Forgot Password\">Forgot Password</button>\n");
      out.write("        </div>\n");
      out.write("        ");
 
                  LoginInsertError error = (LoginInsertError) request.getAttribute("INSERTERROR");
                  if (error != null) {
                
      out.write("\n");
      out.write("                <font color=\"red\">\n");
      out.write("                    ");
      out.print( error.getInvalid());
      out.write("\n");
      out.write("                </font>\n");
      out.write("                ");

                  }
                
      out.write("\n");
      out.write("    </form>\n");
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
