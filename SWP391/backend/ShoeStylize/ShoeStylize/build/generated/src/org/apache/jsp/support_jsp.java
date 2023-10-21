package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class support_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Support</title>\n");
      out.write("    <link rel=\"icon\"\n");
      out.write("        href=\"image\\shoelogo.png\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS\\support.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <img src=\"image\\shoelogo.png\"\n");
      out.write("                alt=\"Shoes stylize\"></img>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"information_left\">\n");
      out.write("            <div>\n");
      out.write("               <ul class=\"information_left_1\">\n");
      out.write("                <img src=\"image\\user.png\" style=\"width: 15px; transform: translateY(02px);\">\n");
      out.write("                <a href=\"information.jsp\">Thông tin tài khoản </a>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <ul class=\"information_left_2\">\n");
      out.write("                <img src=\"image\\checklist.png\" style=\"width: 15px; transform: translateY(02px);\" />\n");
      out.write("                <a href=\"accountManagement.jsp\">\n");
      out.write("                    Quản lí tài khoản\n");
      out.write("                </a>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <ul class=\"information_left_3\">\n");
      out.write("                <img src=\"image\\support.png\" style=\"width: 15px; transform: translateY(02px);\" />\n");
      out.write("                <a href=\"support.jsp\">\n");
      out.write("                    Hỗ trợ\n");
      out.write("                </a>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <ul class=\"information_left_4\">\n");
      out.write("                <img src=\"image\\feedback.png\" style=\"width: 15px; transform: translateY(02px);\" />\n");
      out.write("                <a href=\"feedback.jsp\">Góp ý - phản hồi </a>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <ul class=\"information_left_5\">\n");
      out.write("                <img src=\"image\\logout.png\" style=\"width: 15px;\" />\n");
      out.write("                <a href=\"login.jsp\">Đăng xuất </a>\n");
      out.write("            </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"information_right\">\n");
      out.write("            <div class=\"information_right_1\">\n");
      out.write("                <img\n");
      out.write("                    src=\"image\\headphones.png\">\n");
      out.write("                <p>Tư vấn bán hàng</p>\n");
      out.write("                <p>Thời gian hoạt động: 08:00 - 21:00</p>\n");
      out.write("                <p style=\"color: red;\"><a style=\"text-decoration: none; color: red;\" href=\"tel:1900 1772\">Hotline: 1900\n");
      out.write("                        1772</a> </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"information_right_2\">\n");
      out.write("                <img\n");
      out.write("                    src=\"image\\letterbox.png\">\n");
      out.write("                <p>Khiếu nại</p>\n");
      out.write("                <p>Thời gian hoạt động: 08:00 - 21:00</p>\n");
      out.write("                <p style=\"color: red;\"><a style=\"text-decoration: none; color: red;\" href=\"tel:1900 1773 \">Hotline: 1900\n");
      out.write("                        1234</a> </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"information_right_3\">\n");
      out.write("                <img\n");
      out.write("                    src=\"image\\insurance.png\">\n");
      out.write("                <p>Chính sách và khuyến mãi</p>\n");
      out.write("                <p>Thời gian hoạt động: 08:00 - 21:00</p>\n");
      out.write("                <p style=\"color: red;\"><a style=\"text-decoration: none; color: red;\" href=\"tel:1900 1773 \">Hotline: 1900\n");
      out.write("                        1773</a> </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"information_right_4\">\n");
      out.write("                <img\n");
      out.write("                    src=\"image\\gmail.png\">\n");
      out.write("                <p>Email</p>\n");
      out.write("                <p style=\"color: red;\"> <a style=\"text-decoration: none; color: red;\"\n");
      out.write("                        href=\"mailto:@gmail.com\">cskh@gmail.com</a></p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
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
