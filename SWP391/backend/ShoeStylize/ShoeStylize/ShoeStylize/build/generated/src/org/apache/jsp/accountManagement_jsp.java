package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class accountManagement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Login</title>\r\n");
      out.write("    <link rel=\"icon\"\r\n");
      out.write("        href=\"image\\shoelogo.png\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS\\accountManagement.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("        <img src=\"image\\shoelogo.png\"\r\n");
      out.write("            alt=\"Shoes stylize\"></img>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"information_left\">\r\n");
      out.write("        <div>\r\n");
      out.write("            <ul class=\"information_left_1\">\r\n");
      out.write("                <img src=\"image\\user.png\" style=\"width: 15px; transform: translateY(02px);\">\r\n");
      out.write("                <a href=\"information.jsp\">Thông tin tài khoản </a>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"information_left_2\">\r\n");
      out.write("                <img src=\"image\\checklist.png\" style=\"width: 15px; transform: translateY(02px);\" />\r\n");
      out.write("                <a href=\"accountManagement.jsp\">\r\n");
      out.write("                    Quản lí tài khoản\r\n");
      out.write("                </a>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"information_left_3\">\r\n");
      out.write("                <img src=\"image\\support.png\" style=\"width: 15px; transform: translateY(02px);\" />\r\n");
      out.write("                <a href=\"support.jsp\">\r\n");
      out.write("                    Hỗ trợ\r\n");
      out.write("                </a>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"information_left_4\">\r\n");
      out.write("                <img src=\"image\\feedback.png\" style=\"width: 15px; transform: translateY(02px);\" />\r\n");
      out.write("                <a href=\"feedback.jsp\">Góp ý - phản hồi </a>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"information_left_5\">\r\n");
      out.write("                <img src=\"image\\logout.png\" style=\"width: 15px;\" />\r\n");
      out.write("                <a href=\"login.jsp\">Đăng xuất </a>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"information_right\">\r\n");
      out.write("            <h2>Quản lí đơn hàng</h2>\r\n");
      out.write("            <ul style=\"list-style-type: none; \">\r\n");
      out.write("                <li>Tất cả</li>\r\n");
      out.write("                <li>Đơn đang chờ duyệt</li>\r\n");
      out.write("                <li>Hoàn thành</li>\r\n");
      out.write("                <li>Hủy</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("</body>\r\n");
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
