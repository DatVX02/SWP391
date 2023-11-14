/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SivaRyi
 */
public class HomeDesController extends HttpServlet {

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
        HttpSession session = request.getSession();
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String size = request.getParameter("size");
            String gender = request.getParameter("gen");
            String service1 = request.getParameter("Service1");
            String service2 = request.getParameter("Service2");
            String service3 = request.getParameter("Service3");
            String service4 = request.getParameter("Service4");
            String service5 = request.getParameter("Service5");
            String service6 = request.getParameter("Service6");
            String file1 = request.getParameter("file1");
            String file2 = request.getParameter("file2");
            String file3 = request.getParameter("file3");
            String file4 = request.getParameter("file4");
            String file5 = request.getParameter("file5");
            String file6 = request.getParameter("file6");
            session.setAttribute("Size", size);
            session.setAttribute("Gender", gender);
            session.setAttribute("S1", service1);
            session.setAttribute("S2", service2);
            session.setAttribute("S3", service3);
            session.setAttribute("S4", service4);
            session.setAttribute("S5", service5);
            session.setAttribute("S6", service6);
            session.setAttribute("F1", file1);
            session.setAttribute("F2", file2);
            session.setAttribute("F3", file3);
            session.setAttribute("F4", file4);
            session.setAttribute("F5", file5);
            session.setAttribute("F6", file6);
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
