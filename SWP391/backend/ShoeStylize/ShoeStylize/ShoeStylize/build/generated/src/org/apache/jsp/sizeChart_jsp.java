package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sizeChart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Size Chart</title>\n");
      out.write("    <link rel=\"icon\"\n");
      out.write("        href=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\Shoes stylize (by html)\\image\\logo\\shoe-logo-design-concept-shoes-logo-template-man-fashion-logo-design-template_9850-9282.png\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS\\sizeChart.css\">\n");
      out.write("    <!--Bootstrap CSS-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\n");
      out.write("        integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper@7/swiper-bundle.min.css\" />\n");
      out.write("\n");
      out.write("    <!--font awesome cdn link-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- header -->\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <img src=\"image\\shoelogo.png\"\n");
      out.write("            alt=\"shoes\">\n");
      out.write("        <div class=\"header_info\">\n");
      out.write("            <a href=\"infomation0.jsp\"><img\n");
      out.write("                    src=\"image\\user (1).png\"\n");
      out.write("                    alt=\"profile\">Profile</a>\n");
      out.write("            <a href=\"orderDetail.jsp\"><img\n");
      out.write("                    src=\"image\\heart.png\"\n");
      out.write("                    alt=\"Orders\">Orders</a>\n");
      out.write("            <a href=\"myCart.html\"><img\n");
      out.write("                    src=\"image\\shopping-cart.png\"\n");
      out.write("                    alt=\"shopping-cart\">My cart</a>\n");
      out.write("            <a href=\"#\"><img\n");
      out.write("                    src=\"image\\blog (2).png\"\n");
      out.write("                    alt=\"shopping-cart\">News</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"size\">\n");
      out.write("        <h1>Footwear Size Chart</h1>\n");
      out.write("        <img src=\"image\\size.png\"><br>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <div style=\"float:right\">\n");
      out.write("            <img src=\"image\\facebook.png\"\n");
      out.write("                alt=\"Facebook\" />\n");
      out.write("            <img src=\"image\\twitter.png\"\n");
      out.write("                alt=\"twitter\" />\n");
      out.write("            <img src=\"image\\linkedin.png\"\n");
      out.write("                alt=\"linkedin\" />\n");
      out.write("            <img src=\"image\\instagram (1).png\"\n");
      out.write("                alt=\"Instagram\" />\n");
      out.write("            <img src=\"image\\youtube (5).png\"\n");
      out.write("                alt=\"youtube\" />\n");
      out.write("        </div>\n");
      out.write("        <div style=\" float:right\">\n");
      out.write("            <table class=\"center\">\n");
      out.write("                <tr class=\"tableHeader\">\n");
      out.write("                    <td>About Us</td>\n");
      out.write("                    <td>For Users</td>\n");
      out.write("                    <td>Information</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>About Us</td>\n");
      out.write("                    <td>Login</td>\n");
      out.write("                    <td>Help Center</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Find Store</td>\n");
      out.write("                    <td>Register</td>\n");
      out.write("                    <td>Money Refund</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Categories</td>\n");
      out.write("                    <td>Settings</td>\n");
      out.write("                    <td>Shipping</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Blogs</td>\n");
      out.write("                    <td>My Orders</td>\n");
      out.write("                    <td>Contact us</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div style=\"clear: both\" class=\"commerce\">\n");
      out.write("            @2023 Ecommerce\n");
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
