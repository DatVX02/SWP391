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
            String sql = "SELECT [ShoeID]\n"
                    + "                           ,[BrandName]\n"
                    + "                           ,[ShoesName]\n"
                    + "                           ,[Category]\n"
                    + "                           ,[Description]\n"
                    + "                           ,[Image]\n"
                    + "                           ,[Quantity]\n"
                    + "                           ,[Price]\n"
                    + "                           ,[Size]\n"
                    + "                       FROM [dbo].[Shoes]\n"
                    + "INNER JOIN Brand ON Shoes.BrandID = Brand.BrandID\n"
                    + "INNER JOIN SizeList ON Shoes.SizeID = SizeList.SizeID;";
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
                    String Size = rs.getString("Size");
                    ShoeDTO shoes = new ShoeDTO(ShoeID, Brand, ShoesName, Image, Description, Image, Quantity, Price, Size);
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
            String sql = "SELECT [ShoeID]\n"
                    + "                           ,[BrandName]\n"
                    + "                           ,[ShoesName]\n"
                    + "                           ,[Category]\n"
                    + "                           ,[Description]\n"
                    + "                           ,[Image]\n"
                    + "                           ,[Quantity]\n"
                    + "                           ,[Price]\n"
                    + "                           ,[Size]\n"
                    + "                       FROM [dbo].[Shoes]\n"
                    + "INNER JOIN Brand ON Shoes.BrandID = Brand.BrandID\n"
                    + "INNER JOIN SizeList ON Shoes.SizeID = SizeList.SizeID\n"
                    + "Where [Category] = ?;";

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
                    String Size = rs.getString("Size");
                    ShoeDTO shoes = new ShoeDTO(ShoeID, Brand, ShoesName, Image, Description, Image, Quantity, Price, Size);
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
            String sql = "SELECT \n"
                    + "    [Shoes].[ShoeID],\n"
                    + "	[Brand].[BrandName],\n"
                    + "    [Shoes].[ShoesName],\n"
                    + "    [Shoes].[Category],\n"
                    + "    [Shoes].[Description],\n"
                    + "    [Shoes].[Image],\n"
                    + "    [Shoes].[Quantity],\n"
                    + "    [Shoes].[Price],\n"
                    + "    [Shoes].[SizeID]\n"
                    + "FROM \n"
                    + "     [dbo].[Shoes]\n"
                    + "LEFT JOIN \n"
                    + "   [dbo].[Brand]  ON [Brand].[BrandID] = [Shoes].[BrandID] \n"
                    + "   Where  [Brand].[BrandName] = ? ";

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
                    String Size = String.valueOf("SizeID");
                    ShoeDTO shoes = new ShoeDTO(ShoeID, Brand, ShoesName, Image, Description, Image, Quantity, Price, Size);
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
            String sql = "SELECT [Shoes].[ShoeID]\n"
                    + "      ,[Shoes].[ShoesName]\n"
                    + "      ,[Price]\n"
                    + "	  ,[Quantity]\n"
                    + "      ,[Shoes].[ShoesName]\n"
                    + "      ,[ImageLink1]\n"
                    + "      ,[ImageLink2]\n"
                    + "      ,[ImageLink3]\n"
                    + "      ,[ImageLink4]\n"
                    + "      ,[ImageLink5]\n"
                    + "      ,[ImageLink6]\n"
                    + "  FROM [dbo].[CustomizeShoes]\n"
                    + "  INNER JOIN Shoes ON Shoes.ShoeID = CustomizeShoes.ShoeID\n"
                    + "  INNER JOIN [Image] ON [Image].ImageID = CustomizeShoes.ImageID";
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
}
