/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Shoes.ShoeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author duong
 */
public class CategoryController extends HttpServlet {

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
        String byCategory = request.getParameter("byCategory");
        String byBrand = request.getParameter("brand");
        String byCategory1 = request.getParameter("byCategory1");
        String byBrand1 = request.getParameter("brand1");
        ShoeDAO dao = new ShoeDAO();
        ArrayList list = new ArrayList();
        HttpSession session = request.getSession(false);
        String url = "";
//        homepage_guest
        try {
            if (byCategory.equals("Sport") || byCategory.equals("Party")) {
                list = dao.CatelistShoe(byCategory);
                session.setAttribute("shoesList", list);
                session.setAttribute("Cate", "Cate");
                url = "homepage_guest.jsp";
            } else {
                list = dao.BrandlistShoe(byCategory);
                session.setAttribute("shoesList", list);
                session.setAttribute("Cate", "Cate");
                url = "homepage_guest.jsp";
            }
        } catch (Exception e) {
        }
//        homepage
        try {
            if (byCategory1.equals("Sport") || byCategory1.equals("Party")) {
                list = dao.CatelistShoe(byCategory1);
                session.setAttribute("shoesList", list);
                session.setAttribute("Cate", "Cate");
                url = "homepage.jsp";
            } else {
                list = dao.BrandlistShoe(byCategory1);
                session.setAttribute("shoesList", list);
                session.setAttribute("Cate", "Cate");
                url = "homepage.jsp";
            }
        } catch (Exception e) {
        }
        request.getRequestDispatcher(url).forward(request, response);
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
