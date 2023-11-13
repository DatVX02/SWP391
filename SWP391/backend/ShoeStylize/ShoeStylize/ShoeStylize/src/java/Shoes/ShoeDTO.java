/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shoes;

/**
 *
 * @author duong
 */
public class ShoeDTO {
   private int ShoeID;
    private int BrandID;
     private String ShoesName;
     private String Category;
     private String Description;
     private String Image;
      private int Quantity;
     private double Price;
     private int SizeID;

    public ShoeDTO() {
    }

    public ShoeDTO(int ShoeID, int BrandID, String ShoesName, String Category, String Description, String Image, int Quantity, double Price, int SizeID) {
        this.ShoeID = ShoeID;
        this.BrandID = BrandID;
        this.ShoesName = ShoesName;
        this.Category = Category;
        this.Description = Description;
        this.Image = Image;
        this.Quantity = Quantity;
        this.Price = Price;
        this.SizeID = SizeID;
    }

    public int getShoeID() {
        return ShoeID;
    }

    public void setShoeID(int ShoeID) {
        this.ShoeID = ShoeID;
    }

    public int getBrandID() {
        return BrandID;
    }

    public void setBrandID(int BrandID) {
        this.BrandID = BrandID;
    }

    public String getShoesName() {
        return ShoesName;
    }

    public void setShoesName(String ShoesName) {
        this.ShoesName = ShoesName;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getSizeID() {
        return SizeID;
    }

    public void setSizeID(int SizeID) {
        this.SizeID = SizeID;
    }
}
