package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cost_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Cost statictics</title>\n");
      out.write("    <link rel=\"icon\"\n");
      out.write("        href=\"image\\shoelogo.png\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/cost.css\">\n");
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
      out.write("        <a href=\"homepage.html\"><img src=\"image\\shoelogo.png\"\n");
      out.write("            alt=\"shoes\"></a>\n");
      out.write("        <div class=\"header_info\">\n");
      out.write("            <a href=\"../../Profile/Account information.html\"><img\n");
      out.write("                    src=\"image\\user (1).png\"\n");
      out.write("                    alt=\"profile\">Profile</a>\n");
      out.write("            <a href=\"#\"><img\n");
      out.write("                    src=\"image\\heart.png\"\n");
      out.write("                    alt=\"Orders\">Orders</a>\n");
      out.write("            <a href=\"../../../../Cart/MyCart.html\"><img\n");
      out.write("                    src=\"image\\shopping-cart.png\"\n");
      out.write("                    alt=\"shopping-cart\">My cart</a>\n");
      out.write("            <a href=\"#\"><img\n");
      out.write("                    src=\"image\\blog (2).png\"\n");
      out.write("                    alt=\"shopping-cart\">News</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"manage\">\n");
      out.write("        <div style=\"width: 20%; float:left\" class=\"managefunction\">\n");
      out.write("            <a href=\"../Order statictics/Order.html\">Order statictics</a>\n");
      out.write("            <a href=\"../Cost statictics/Cost.html\">Cost statictics</a>\n");
      out.write("            <a href=\"../Blog statictics/Blog.html\">Blog statictics</a>\n");
      out.write("            <a href=\"../Store statictics/Store.html\">Store manage</a>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"width: 79%; float:right\" class=\"bloglist\">\n");
      out.write("                <div style=\"clear: both;\" >\n");
      out.write("                    <table>\n");
      out.write("                        <tr class=\"tablehead\">\n");
      out.write("                            <td>ShoesID</td>\n");
      out.write("                            <td>Shoes name</td>\n");
      out.write("                            <td>Old cost</td>\n");
      out.write("                            <td>Quantity sold</td>\n");
      out.write("                            <td>New cost</td>\n");
      out.write("                            <td>Increase/decrease ratio</td>\n");
      out.write("                            <td>Status</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
