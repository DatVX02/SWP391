package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Login</title>\n");
      out.write("    <link rel=\"icon\"\n");
      out.write("        href=\"image\\shoelogo.png\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS\\HomePage.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- header -->\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <img src=\"image\\shoe-logo-design-concept-shoes-logo-template-man-fashion-logo-design-template_9850-9282.png\"\n");
      out.write("            alt=\"Shoes stylize\">\n");
      out.write("        <div style=\"color: white;\">\n");
      out.write("            <img src=\"image\\user (1).png\"\n");
      out.write("                alt=\"profile\">Profile\n");
      out.write("            <img src=\"image\\heart.png\"\n");
      out.write("                alt=\"Orders\">Orders\n");
      out.write("            <img src=\"image\\shopping-cart.png\"\n");
      out.write("                alt=\"shopping-cart\">My cart\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- information left -->\n");
      out.write("    <div class=\"information_left\" style=\"width: 40%;\">\n");
      out.write("        <div>\n");
      out.write("            <h3>\n");
      out.write("                Category</h3>\n");
      out.write("            <ul style=\"list-style-type: none;\">\n");
      out.write("                <li>Sport</li>\n");
      out.write("                <li>Party</li>\n");
      out.write("            </ul>\n");
      out.write("            <h3>\n");
      out.write("                Brands\n");
      out.write("            </h3>\n");
      out.write("            <ul>\n");
      out.write("                <input type=\"checkbox\">Nike <br>\n");
      out.write("                <input type=\"checkbox\">Jordan <br>\n");
      out.write("                <input type=\"checkbox\">Adidas <br>\n");
      out.write("                <input type=\"checkbox\"> Puma <br>\n");
      out.write("                <input type=\"checkbox\">Converse <br>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <h3>Price Range\n");
      out.write("                <img src=\"\" alt=\"\">\n");
      out.write("            </h3>\n");
      out.write("\n");
      out.write("            Min <br>\n");
      out.write("            <input type=\"number\" style=\"border-radius: 5px; border: 0.5px solid #fff; padding: 10px;\" placeholder=\"0\">\n");
      out.write("            <br>\n");
      out.write("            Max <br>\n");
      out.write("            <input type=\"number\" style=\"border-radius: 5px; border: 0.5px solid #fff; padding: 10px;\"\n");
      out.write("                placeholder=\"9999999\">\n");
      out.write("            <br>\n");
      out.write("            <button>Apply</button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <h3>Ratings</h3>\n");
      out.write("            <!-- 5 start -->\n");
      out.write("            <input type=\"checkbox\">\n");
      out.write("            <span class=\"fa fa-star checked\"></span>\n");
      out.write("            <span class=\"fa fa-star checked\"></span>\n");
      out.write("            <span class=\"fa fa-star checked\"></span>\n");
      out.write("            <span class=\"fa fa-star checked\"></span>\n");
      out.write("            <span class=\"fa fa-star checked\"></span>\n");
      out.write("            <br>\n");
      out.write("            <!-- 4 star -->\n");
      out.write("            <input type=\"checkbox\">\n");
      out.write("            <span class=\"fa fa-star checked \"></span>\n");
      out.write("            <span class=\"fa fa-star checked \"></span>\n");
      out.write("            <span class=\"fa fa-star checked\"></span>\n");
      out.write("            <span class=\"fa fa-star checked\"></span>\n");
      out.write("            <span class=\"fa fa-star\"></span>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <!-- 3 star -->\n");
      out.write("            <input type=\"checkbox\">\n");
      out.write("            <span class=\"fa fa-star  checked \"></span>\n");
      out.write("            <span class=\"fa fa-star checked \"></span>\n");
      out.write("            <span class=\"fa fa-star checked \"></span>\n");
      out.write("            <span class=\"fa fa-star\"></span>\n");
      out.write("            <span class=\"fa fa-star\"></span>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <!-- 2 star -->\n");
      out.write("            <input type=\"checkbox\">\n");
      out.write("            <span class=\"fa fa-star checked\"></span>\n");
      out.write("            <span class=\"fa fa-star checked\"></span>\n");
      out.write("            <span class=\"fa fa-star\"></span>\n");
      out.write("            <span class=\"fa fa-star\"></span>\n");
      out.write("            <span class=\"fa fa-star\"></span>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <!-- 1 star -->\n");
      out.write("            <input type=\"checkbox\">\n");
      out.write("            <span class=\"fa fa-star checked \"></span>\n");
      out.write("            <span class=\"fa fa-star\"></span>\n");
      out.write("            <span class=\"fa fa-star\"></span>\n");
      out.write("            <span class=\"fa fa-star\"></span>\n");
      out.write("            <span class=\"fa fa-star\"></span>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
