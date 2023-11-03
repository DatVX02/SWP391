package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.math.BigDecimal;
import Order.OrderDTO;
import java.util.List;
import Registration.RegistrationDAO;

public final class orderDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>OrderDetail</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS\\OrderDetail.css\">\n");
      out.write("        <link rel=\"icon\"\n");
      out.write("              href=\"image\\shoelogo.png\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <img src=\"image\\shoelogo.png\"\n");
      out.write("                 alt=\"Shoes stylize\">\n");
      out.write("        </div>\n");
      out.write("        <h1>Order Detail</h1>\n");
      out.write("        ");

            RegistrationDAO dao = new RegistrationDAO();
            dao.showOrderDetail();
            List<OrderDTO> result = dao.getListOrders();
            if (result != null) {
        
      out.write("\n");
      out.write("        ");

            double totalAmount = 0;
            for (OrderDTO dto : result) {
                totalAmount += dto.getPrice();
        
      out.write("\n");
      out.write("        <form action=\"*\" method=\"post\">\n");
      out.write("            <div class=\"product\">\n");
      out.write("                <div class=\"column left\">\n");
      out.write("                    <img src=\"*\" alt=\"Product\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"column middle\">\n");
      out.write("                    <h2>");
      out.print( dto.getName());
      out.write("</h2>\n");
      out.write("                    <p>Price:&nbsp&nbsp&nbsp");
      out.print( dto.getPrice());
      out.write("</p>\n");
      out.write("                    <p>Quantity:&nbsp&nbsp");
      out.print( dto.getQuantity());
      out.write(" </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"column right\">\n");
      out.write("                    <input type=\"button\" value=\"Detail\"/>\n");
      out.write("                    <a href=\"feedback.jsp\"> \n");
      out.write("                        <input type=\"button\" value=\"Feedback\"/>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            <h3>Total amount:");
      out.print( totalAmount);
      out.write("</h3></br>\n");
      out.write("        </form>\n");
      out.write("        ");

        } else {
        
      out.write("\n");
      out.write("        <h2>No Order available.</h2>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("    </body>\n");
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
