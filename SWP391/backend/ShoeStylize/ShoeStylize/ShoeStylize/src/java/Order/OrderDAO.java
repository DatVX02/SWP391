/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import Shoes.*;
import Database.DBUtils;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author duong
 */
public class OrderDAO implements Serializable {

    public ArrayList<OrderDTO> AlllistOrder() throws SQLException {
        ArrayList<OrderDTO> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            String sql = "SELECT OrderDetails.CusShoeID,\n"
                    + "       CustomizeShoes.ShoesName,\n"
                    + "       Image,\n"
                    + "       OrderDetails.Price,\n"
                    + "       OrderDetails.Quantity,\n"
                    + "       Orders.Status\n"
                    + "  FROM dbo.Orders\n"
                    + "  INNER JOIN OrderDetails ON OrderDetails.OrderID = Orders.OrderID\n"
                    + "  INNER JOIN CustomizeShoes ON CustomizeShoes.CusShoeID = OrderDetails.CusShoeID\n"
                    + "  INNER JOIN Shoes ON CustomizeShoes.ShoeID = Shoes.ShoeID";
            PreparedStatement pst = cn.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    int ShoeID = rs.getInt("CusShoeID");
                    String ShoesName = rs.getString("ShoesName");
                    String Image = rs.getString("Image");
                    double Price = rs.getDouble("Price");
                    int Quantity = rs.getInt("Quantity");
                    String Category = rs.getString("Category");
                    String Status = rs.getString("Status");
                    OrderDTO orders = new OrderDTO(ShoeID, ShoesName, Image, Price, Quantity, Category, Status);
                    list.add(orders);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<OrderDTO> CatelistOrder(String by) throws SQLException {
        ArrayList<OrderDTO> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            String sql = "SELECT [ShoeID]\n"
                    + "      ,[ShoesName]\n"
                    + "      ,[Image]\n"
                    + "      ,[Price]\n"
                    + "	  ,[Quantity]\n"
                    + "	  ,[Category]\n"
                    + "      ,[Status]\n"
                    + "  FROM [dbo].[Orders]\n"
                    + "  INNER JOIN Shoes ON Shoes.ShoeID = Orders.OrderID\n"
                    + "Where [Category] = ?;";

            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, by);
            ResultSet rs = pst.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    int ShoeID = rs.getInt("ShoeID");
                    String ShoesName = rs.getString("ShoesName");
                    String Image = rs.getString("Image");
                    double Price = rs.getDouble("Price");
                    int Quantity = rs.getInt("Quantity");
                    String Category = rs.getString("Category");
                    String Status = rs.getString("Status");
                    OrderDTO orders = new OrderDTO(ShoeID, ShoesName, Image, Price, Quantity, Category, Status);
                    list.add(orders);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean insertNewOrder(int userID, String orderDate, String orderTime, int total, String status, int quantity) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        
        try{
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "INSERT INTO [dbo].[Orders]([UserID],[OrderDate],[OrderTime],[TotalAmount],[Status],[Quantity])"
                        + "VALUES(?, ?, ?, ?, ?, ?)";
                stm = con.prepareStatement(sql);
                stm.setInt(1, userID);
                stm.setString(2, orderDate);
                stm.setString(3, orderTime);
                stm.setInt(4, total);
                stm.setString(5, status);
                stm.setInt(6, quantity);
                int row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
    
    public int findOrderID(String date, String time) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "SELECT [OrderID] FROM [dbo].[Orders]"
                        + " WHERE OrderDate = ? AND OrderTime = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, date);
                stm.setString(2, time);
                rs = stm.executeQuery();
                if (rs.next()) {
                    return rs.getInt("OrderID");
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        
        return -1;
    }
}
