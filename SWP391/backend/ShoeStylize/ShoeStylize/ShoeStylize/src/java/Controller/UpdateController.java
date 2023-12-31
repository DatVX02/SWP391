/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Registration.RegistrationDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "UpdateController", urlPatterns = {"/UpdateController"})
public class UpdateController extends HttpServlet {

    private final String UPDATEPAGE = "information0.jsp";
    private final String INVALIDPAGE = "invalid.jsp";
    private final String DONEPAGE = "complete.jsp";
    private final String PROVIDERPAGE = "Profile-provi-admin/Provider/information0_1.jsp";
    private final String ADMINPAGE = "Profile-provi-admin/Admin/information0_2.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            String url = INVALIDPAGE;
            String txtUserID = request.getParameter("txtUserID");
            int userID = Integer.parseInt(txtUserID);
            String email = request.getParameter("txtEmail");
            String fullName = request.getParameter("txtFullName");
            String phone = request.getParameter("txtPhone");
            String birthDate = request.getParameter("birthDate");
            String gender = request.getParameter("gen");

            try {
                RegistrationDAO dao = new RegistrationDAO();
                boolean result = dao.updateRecord(userID, email, fullName, phone, birthDate, gender);
                if (result) {
                    String roleID = dao.checkRoleID_UserID(userID);
                    switch (roleID) {
                        case "CUSTOMER":
                            url = UPDATEPAGE;
                            break;
                        case "PROVIDER":
                            url = PROVIDERPAGE;
                            break;
                        case "ADMIN":
                            url = ADMINPAGE;
                            break;
                        default:
                            break;
                    }

                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                response.sendRedirect(url);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
