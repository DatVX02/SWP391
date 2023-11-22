package org.apache.jsp.Service_0020Provider.Store_0020statictics;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddShoes_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Store Manage</title>\r\n");
      out.write("        <link rel=\"icon\"\r\n");
      out.write("              href=\"image\\shoelogo.png\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Store statictics/AddShoes.css\">\r\n");
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
      out.write("            <a href=\"../../HomePage/Homepage (login)/HomePage.html\"><img\r\n");
      out.write("                    src=\"image\\shoelogo.png\"\r\n");
      out.write("                    alt=\"shoes\"></a>\r\n");
      out.write("            <div class=\"header_info\">\r\n");
      out.write("                <a href=\"../../Profile/Account information.html\"><img\r\n");
      out.write("                        src=\"image\\user (1).png\"\r\n");
      out.write("                        alt=\"profile\">Profile</a>\r\n");
      out.write("                <!-- <a href=\"#\"><img\r\n");
      out.write("                        src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\Shoes stylize (by html)\\image\\logo\\heart.png\"\r\n");
      out.write("                        alt=\"Orders\">Orders</a>\r\n");
      out.write("                <a href=\"../../../../Cart/MyCart.html\"><img\r\n");
      out.write("                        src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\Shoes stylize (by html)\\image\\logo\\shopping-cart.png\"\r\n");
      out.write("                        alt=\"shopping-cart\">My cart</a> -->\r\n");
      out.write("                <a href=\"#\"><img\r\n");
      out.write("                        src=\"image\\blog (2).png\"\r\n");
      out.write("                        alt=\"shopping-cart\">News</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"manage\">\r\n");
      out.write("            <div style=\"width: 20%; float:left\" class=\"managefunction\">\r\n");
      out.write("                <a href=\"../Order statictics/Order.html\">Order statictics</a>\r\n");
      out.write("                <a href=\"../Cost statictics/Cost.html\">Cost statictics</a>\r\n");
      out.write("                <a href=\"../Blog statictics/Blog.html\">Blog statictics</a>\r\n");
      out.write("                <a href=\"../Store statictics/Store.html\">Store manage</a>\r\n");
      out.write("                <a href=\"../../Login/Login.html\">Logout</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"width: 79%; float:right\" class=\"addBLog\">\r\n");
      out.write("                <h2>Add New Shoes</h2>\r\n");
      out.write("                <form action=\"../../MainController\" method=\"post\">\r\n");
      out.write("                    <p>Shoes Name <input type=\"text\" name=\"txtShoeName\" style=\"margin-left: 70px;\" /></p>\r\n");
      out.write("                    <p>Brand Name<input type=\"text\" name=\"txtBrandName\" /></p>\r\n");
      out.write("                    <p>Category: \r\n");
      out.write("                        <input type=\"radio\" name=\"cate\" value=\"Sport\"> Sport\r\n");
      out.write("                        <input type=\"radio\" name=\"cate\" value=\"Party\"> Party\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>Image: <input type=\"url\" name=\"txtURL\"\r\n");
      out.write("                                     style=\"width: 50%; margin-left: 127px; padding-right: 120px ;\">\r\n");
      out.write("\r\n");
      out.write("                    <p>Price: <input type=\"number\" name=\"txtPrice\" min=\"0\" style=\"margin-left:122px;\" /></p>\r\n");
      out.write("                    <p>Quantity: <input type=\"number\" name=\"txtQuant\" min=\"0\" style=\"margin-left: 98px;\"/></p>\r\n");
      out.write("                    <p>Description: <textarea type=\"text\" name=\"txtDes\" style=\"width: 70%; margin-left: 78px;\"></textarea></p>\r\n");
      out.write("                    <input type=\"submit\" name=\"btAction\" value=\"Add Shoe\" class=\"button\" style=\"float: right; margin-right: 40px;\">\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
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
