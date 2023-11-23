package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Shoes.ShoeDTO;
import java.util.List;
import Shoes.ShoeDAO;

public final class store_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Store manage</title>\r\n");
      out.write("        <link rel=\"icon\"\r\n");
      out.write("              href=\"image/logo/shoelogo.png\">\r\n");
      out.write("        <link href=\"Service Provider/Store statictics/Store.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <!--Bootstrap CSS-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n");
      out.write("              integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper@7/swiper-bundle.min.css\" />\r\n");
      out.write("\r\n");
      out.write("        <!--font awesome cdn link-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- header -->\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <img src=\"image/logo/logo.png\"\r\n");
      out.write("                 alt=\"shoes\">\r\n");
      out.write("            <div class=\"header_info\">\r\n");
      out.write("                <a href=\"information0.jsp\"><img\r\n");
      out.write("                        src=\"image/logo/user (1).png\"\r\n");
      out.write("                        alt=\"profile\">Profile</a>\r\n");
      out.write("                <!--                <a href=\"#\"><img\r\n");
      out.write("                                        src=\"image/logo/heart.png\"\r\n");
      out.write("                                        alt=\"Orders\">Orders</a>\r\n");
      out.write("                                <a href=\"../../../../Cart/MyCart.html\"><img\r\n");
      out.write("                                        src=\"image/logo/shopping-cart.png\"\r\n");
      out.write("                                        alt=\"shopping-cart\">My cart</a>-->\r\n");
      out.write("                <a href=\"#\"><img\r\n");
      out.write("                        src=\"image/logo/blog (2).png\"\r\n");
      out.write("                        alt=\"shopping-cart\">News</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"manage\">\r\n");
      out.write("            <div style=\"width: 20%; float:left\" class=\"managefunction\">\r\n");
      out.write("                <a href=\"#\">Home</a>\r\n");
      out.write("                <a href=\"order_provider.jsp\">Order statictics</a>\r\n");
      out.write("                <a href=\"cost.jsp\">Cost statictics</a>\r\n");
      out.write("                <a href=\"blog_provider.jsp\">Blog statictics</a>\r\n");
      out.write("                <a href=\"store.jsp\">Store manage</a>\r\n");
      out.write("                <a href=\"login.jsp\">Logout</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"width: 79%; float:right\" class=\"bloglist\">\r\n");
      out.write("                <div style=\"clear: both;\" >\r\n");
      out.write("                    <div style=\"float: right;\" >\r\n");
      out.write("                        <form action=\"*\" method=\"post\">\r\n");
      out.write("                            <a href=\"Service Provider/Store statictics/AddShoes.jsp\"><input type=\"button\" value=\"Insert New Shoes\" class=\"button\"></a>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <form action=\"MainController\">\r\n");
      out.write("                        <table>\r\n");
      out.write("                            <thead>\r\n");
      out.write("                                <tr class=\"tablehead\">\r\n");
      out.write("                                    <td>ShoeID </td>\r\n");
      out.write("                                    <td>Shoe Name</td>\r\n");
      out.write("                                    <td>Brand Name</td>\r\n");
      out.write("                                    <td>Image</td>\r\n");
      out.write("                                    <td>Category</td>\r\n");
      out.write("                                    <td>Price</td>\r\n");
      out.write("                                    <td>Quantity</td>\r\n");
      out.write("                                    <td>Description</td>\r\n");
      out.write("                                    <td>Status</td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                                ");

                                    ShoeDAO dao = new ShoeDAO();
                                    List<ShoeDTO> result = dao.AlllistShoe();
                                    for (ShoeDTO dto : result) {
                                
      out.write("\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        ");
      out.print( dto.getShoeID());
      out.write("\r\n");
      out.write("                                    </td>\r\n");
      out.write("\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        ");
      out.print( dto.getShoesName());
      out.write("\r\n");
      out.write("                                    </td>\r\n");
      out.write("\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        ");
      out.print( dto.getBrand());
      out.write("\r\n");
      out.write("                                    </td>\r\n");
      out.write("\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        <img src=\"");
      out.print( dto.getImage());
      out.write("\" >\r\n");
      out.write("                                    </td>\r\n");
      out.write("\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        ");
      out.print( dto.getCategory());
      out.write("\r\n");
      out.write("                                    </td>\r\n");
      out.write("\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        ");
      out.print( dto.getPrice());
      out.write("\r\n");
      out.write("                                    </td>\r\n");
      out.write("\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        ");
      out.print( dto.getQuantity());
      out.write("\r\n");
      out.write("                                    </td>\r\n");
      out.write("\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        ");
      out.print( dto.getDescription());
      out.write("\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                ");

                                    }
                                
      out.write("\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
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
