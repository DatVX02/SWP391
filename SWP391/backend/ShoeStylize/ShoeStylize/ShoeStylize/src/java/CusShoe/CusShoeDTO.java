/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CusShoe;

/**
 *
 * @author Administrator
 */
public class CusShoeDTO {
    private int id;
    private String name;
    private String img1;
    private String img2;
    private String img3;
    private String img4;
    private String img5;
    private String img6;
    private boolean service1;
    private boolean service2;
    private boolean service3;
    private boolean service4;
    private boolean service5;
    private boolean service6;
    private String gender;
    private String size;
    private double price;

    public CusShoeDTO() {
    }

    public CusShoeDTO(int id, String name, String img1, String img2, String img3, String img4, String img5, String img6, boolean service1, boolean service2, boolean service3, boolean service4, boolean service5, boolean service6, String gender, String size, double price) {
        this.id = id;
        this.name = name;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.img6 = img6;
        this.service1 = service1;
        this.service2 = service2;
        this.service3 = service3;
        this.service4 = service4;
        this.service5 = service5;
        this.service6 = service6;
        this.gender = gender;
        this.size = size;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getImg4() {
        return img4;
    }

    public void setImg4(String img4) {
        this.img4 = img4;
    }

    public String getImg5() {
        return img5;
    }

    public void setImg5(String img5) {
        this.img5 = img5;
    }

    public String getImg6() {
        return img6;
    }

    public void setImg6(String img6) {
        this.img6 = img6;
    }

    public boolean isService1() {
        return service1;
    }

    public void setService1(boolean service1) {
        this.service1 = service1;
    }

    public boolean isService2() {
        return service2;
    }

    public void setService2(boolean service2) {
        this.service2 = service2;
    }

    public boolean isService3() {
        return service3;
    }

    public void setService3(boolean service3) {
        this.service3 = service3;
    }

    public boolean isService4() {
        return service4;
    }

    public void setService4(boolean service4) {
        this.service4 = service4;
    }

    public boolean isService5() {
        return service5;
    }

    public void setService5(boolean service5) {
        this.service5 = service5;
    }

    public boolean isService6() {
        return service6;
    }

    public void setService6(boolean service6) {
        this.service6 = service6;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
