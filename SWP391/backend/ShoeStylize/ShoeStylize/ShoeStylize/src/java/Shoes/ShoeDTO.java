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
    private String Brand;
    private String ShoesName;
    private String Category;
    private String Description;
    private String Image;
    private int Quantity;
    private double Price;
    private String Size;
    private double NewPrice;
    private double increaseDecreaseRatio;

    public ShoeDTO() {
    }

    public ShoeDTO(int ShoeID, String Brand, String ShoesName, String Category, String Description, String Image, int Quantity, double Price) {
        this.ShoeID = ShoeID;
        this.Brand = Brand;
        this.ShoesName = ShoesName;
        this.Category = Category;
        this.Description = Description;
        this.Image = Image;
        this.Quantity = Quantity;
        this.Price = Price;
    }

    public ShoeDTO(int ShoeID, String ShoesName, int Quantity, double Price, double NewPrice,double increaseDecreaseRatio) {
        this.ShoeID = ShoeID;
        this.ShoesName = ShoesName;
        this.Quantity = Quantity;
        this.Price = Price;
        this.NewPrice = NewPrice;
        this.increaseDecreaseRatio = increaseDecreaseRatio;
    }

    public double getIncreaseDecreaseRatio() {
        return increaseDecreaseRatio;
    }

    public void setIncreaseDecreaseRatio(double increaseDecreaseRatio) {
        this.increaseDecreaseRatio = increaseDecreaseRatio;
    }
    

    public double getNewPrice() {
        return NewPrice;
    }

    public void setNewPrice(double NewPrice) {
        this.NewPrice = NewPrice;
    }
    
    

    public int getShoeID() {
        return ShoeID;
    }

    public void setShoeID(int ShoeID) {
        this.ShoeID = ShoeID;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
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

}
