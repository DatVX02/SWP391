/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shoes;

import Database.DBUtils;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author duong
 */
public class ShoeDAO implements Serializable {

    public ArrayList<ShoeDTO> AlllistShoe() throws SQLException {
        ArrayList<ShoeDTO> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            String sql = "SELECT [Shoes].[ShoeID], [BrandName], [ShoesName], [Category], [Description], [Image], [Quantity], [Price]\n"
                    + "FROM [dbo].[Shoes]\n"
                    + "INNER JOIN Brand ON Shoes.BrandID = Brand.BrandID";
            PreparedStatement pst = cn.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    int ShoeID = rs.getInt("ShoeID");
                    String Brand = rs.getString("BrandName");
                    String ShoesName = rs.getString("ShoesName");
                    String Description = rs.getString("Description");
                    String Image = rs.getString("Image");
                    int Quantity = rs.getInt("Quantity");
                    double Price = rs.getDouble("Price");
                    ShoeDTO shoes = new ShoeDTO(ShoeID, Brand, ShoesName, Image, Description, Image, Quantity, Price);
                    list.add(shoes);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<ShoeDTO> CatelistShoe(String by) throws SQLException {
        ArrayList<ShoeDTO> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            String sql = "SELECT [Shoes].[ShoeID], [BrandName], [ShoesName], [Category], [Description], [Image], [Quantity], [Price]\n"
                    + "FROM [dbo].[Shoes]\n"
                    + "INNER JOIN Brand ON Shoes.BrandID = Brand.BrandID\n"
                    + "WHERE [Category] = ?;";

            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, by);
            ResultSet rs = pst.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    int ShoeID = rs.getInt("ShoeID");
                    String Brand = rs.getString("BrandName");
                    String ShoesName = rs.getString("ShoesName");
                    String Description = rs.getString("Description");
                    String Image = rs.getString("Image");
                    int Quantity = rs.getInt("Quantity");
                    double Price = rs.getDouble("Price");
                    ShoeDTO shoes = new ShoeDTO(ShoeID, Brand, ShoesName, Image, Description, Image, Quantity, Price);
                    list.add(shoes);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<ShoeDTO> BrandlistShoe(String by) throws SQLException {
        ArrayList<ShoeDTO> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            String sql = "SELECT\n"
                    + "    [Shoes].[ShoeID],\n"
                    + "    [Brand].[BrandName],\n"
                    + "    [Shoes].[ShoesName],\n"
                    + "    [Shoes].[Category],\n"
                    + "    [Shoes].[Description],\n"
                    + "    [Shoes].[Image],\n"
                    + "    [Shoes].[Quantity],\n"
                    + "    [Shoes].[Price]\n"
                    + "FROM\n"
                    + "    [dbo].[Shoes]\n"
                    + "LEFT JOIN\n"
                    + "    [dbo].[Brand] ON [Brand].[BrandID] = [Shoes].[BrandID]\n"
                    + "WHERE\n"
                    + "    [Brand].[BrandName] = ?";

            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, by);
            ResultSet rs = pst.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    int ShoeID = rs.getInt("ShoeID");
                    String Brand = rs.getString("BrandName");
                    String ShoesName = rs.getString("ShoesName");
                    String Description = rs.getString("Description");
                    String Image = rs.getString("Image");
                    int Quantity = rs.getInt("Quantity");
                    double Price = rs.getDouble("Price");
                    ShoeDTO shoes = new ShoeDTO(ShoeID, Brand, ShoesName, Image, Description, Image, Quantity, Price);
                    list.add(shoes);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<ShoeDTO> AlllistShoeCost() throws SQLException {
        ArrayList<ShoeDTO> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            String sql = "SELECT \n"
                    + "    [Shoes].[ShoeID],\n"
                    + "    [Shoes].[ShoesName],\n"
                    + "    [Price],\n"
                    + "    [Quantity],\n"
                    + "    [ImageLink1],\n"
                    + "    [ImageLink2],\n"
                    + "    [ImageLink3],\n"
                    + "    [ImageLink4],\n"
                    + "    [ImageLink5],\n"
                    + "    [ImageLink6]\n"
                    + "FROM \n"
                    + "    [dbo].[CustomizeShoes]\n"
                    + "INNER JOIN \n"
                    + "    Shoes ON Shoes.ShoeID = CustomizeShoes.ShoeID";
            PreparedStatement pst = cn.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    int ShoeID = rs.getInt("ShoeID");
                    String ShoesName = rs.getString("ShoesName");
                    int Quantity = rs.getInt("Quantity");
                    double Price = rs.getDouble("Price");
                    int count = 0;
                    if (rs.getString("ImageLink1") != null) {
                        count++;
                    }
                    if (rs.getString("ImageLink2") != null) {
                        count++;
                    }
                    if (rs.getString("ImageLink3") != null) {
                        count++;
                    }
                    if (rs.getString("ImageLink4") != null) {
                        count++;
                    }
                    if (rs.getString("ImageLink5") != null) {
                        count++;
                    }
                    if (rs.getString("ImageLink6") != null) {
                        count++;
                    }
                    double NewPrice = count * Price;

                    double increaseDecreaseRatio = (NewPrice - Price) / Price;

                    ShoeDTO shoes = new ShoeDTO(ShoeID, ShoesName, Quantity, Price, NewPrice, increaseDecreaseRatio);
                    list.add(shoes);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void getInfo(HttpServletRequest request) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        HttpSession session = request.getSession();

        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "SELECT FullName, Email, PhoneNumber, Birthdate, Gender FROM Users WHERE UserID = ?";
                stm = con.prepareStatement(sql);
                stm.setObject(1, session.getAttribute("id"));
                rs = stm.executeQuery();

                if (rs.next()) { // Check if there are results
                    session.setAttribute("Price", rs.getString("Price"));
                }
            }
        } catch (SQLException e) {
            // Handle the SQLException, or at least log it
            e.printStackTrace();
            throw e; // Re-throw the exception if needed
        } finally {
            // Close resources in reverse order of acquisition, and check for null
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
    }
    
    public boolean addShoe(int brandID, String shoeName, String category, String description, String image, int quantity, int price) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "INSERT INTO [dbo].[Shoes]([BrandID],[ShoesName],[Category],[Description],[Image],[Quantity],[Price])" +
                " VALUES(?, ?, ?, ?, ?, ?, ?) ";
                stm = con.prepareStatement(sql);
                stm.setInt(1, brandID);
                stm.setString(2, shoeName);
                stm.setString(3, category);
                stm.setString(4, description);
                stm.setString(5, image);
                stm.setInt(6, quantity);
                stm.setInt(7, price);
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
    
    
}
