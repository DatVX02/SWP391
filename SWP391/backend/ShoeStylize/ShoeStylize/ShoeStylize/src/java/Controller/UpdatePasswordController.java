/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Error.RegisterInsertError;
import Registration.RegistrationDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LAPTOP
 */
public class UpdatePasswordController extends HttpServlet {

    private final String UPDATEPAGE = "changePassword.jsp";
    private final String INVALIDPAGE = "invalid.jsp";

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
        RegisterInsertError errors = new RegisterInsertError();
        boolean bError = false;
        try (PrintWriter out = response.getWriter()) {
            String url = INVALIDPAGE;
            String txtUserID = request.getParameter("txtUserID");
            int userID = Integer.parseInt(txtUserID);
            String oldPassword = request.getParameter("txtOldPassword");
            String confirm1 = request.getParameter("txtOldPasswordConfirm");
            if (!confirm1.trim().equals(oldPassword)) {
                errors.setConfirmNotMatch("Password not match");
                bError = true;
            }
            String password = request.getParameter("txtPassword");
            String confirm = request.getParameter("txtConfirm");
            if (!confirm.trim().equals(password)) {
                errors.setConfirmNotMatch("Confirm password not match");
                bError = true;
            }

            try {
                RegistrationDAO dao = new RegistrationDAO();
                boolean result = dao.updatePassword(userID, password);
                if (result) {
                    url = UPDATEPAGE;
                }
            } catch (SQLException e) {
                e.printStackTrace();
                request.setAttribute("UPDATEERROR", errors);
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
