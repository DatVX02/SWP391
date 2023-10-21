package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class information_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"CSS\\information.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <img src=\"image\\shoelogo.png\"\n");
      out.write("            alt=\"Shoes stylize\"></img>\n");
      out.write("    </div>\n");
      out.write("    <!-- menu -->\n");
      out.write("    <div class=\"information_left\">\n");
      out.write("        <div>\n");
      out.write("            <ul class=\"information_left_1\">\n");
      out.write("                <img src=\"image\\user.png\" style=\"width: 15px; transform: translateY(02px);\">\n");
      out.write("                <a href=\"#\">Thông tin tài khoản </a>\n");
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
      out.write("                <a href=\"./Support.html\">\n");
      out.write("                    Hỗ trợ\n");
      out.write("                </a>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <ul class=\"information_left_4\">\n");
      out.write("                <img src=\"image\\feedback.png\" style=\"width: 15px; transform: translateY(02px);\" />\n");
      out.write("                <a href=\"../Profile/Feedback.html\">Góp ý - phản hồi </a>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <ul class=\"information_left_5\">\n");
      out.write("                <img src=\"image\\logout.png\" style=\"width: 15px;\" />\n");
      out.write("                <a href=\"#\">Đăng xuất </a>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"information_right\">\n");
      out.write("            <h2>Thông tin tài khoản</h2>\n");
      out.write("            <div>\n");
      out.write("                <h3>Họ tên</h3>\n");
      out.write("                <input type=\"text\" style=\"width: 200px;\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <h3>Email</h3>\n");
      out.write("                <input type=\"email\" required style=\"width: 200px;\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <h3>Số điện thoại</h3>\n");
      out.write("                <input type=\"text\" required style=\"width: 200px;\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <h3> Ngày sinh</h3>\n");
      out.write("                <input type=\"date\" style=\"width: 200px;\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <h3>\n");
      out.write("                    Giới tính\n");
      out.write("                </h3>\n");
      out.write("\n");
      out.write("                <input type=\"radio\">Nam\n");
      out.write("                <input type=\"radio\">Nữ\n");
      out.write("                <input type=\"radio\">Khác\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <button style=\"border-radius: 20px; background-color: #EBAA5D; margin-top: 10px;\">Cập nhật</button>\n");
      out.write("        </div>\n");
      out.write("\n");
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
