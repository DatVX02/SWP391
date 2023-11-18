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
                    int Price = rs.getInt("Price");
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
                    int Price = rs.getInt("Price");
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

}
