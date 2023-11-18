/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author SivaRyi
 */
public class OrderDTO {
    private int id;
    private String name;
    private String img;
    private int price;
    private int quantity;
    private String category;
    private String status;
    Map<String, Integer> items;

    public OrderDTO() {
    }

    public OrderDTO(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public OrderDTO(int id, String name, String img, int price, int quantity, String category, String status) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Map<String, Integer> getItems() {
        return items;
    }

    public void setItems(Map<String, Integer> items) {
        this.items = items;
    }
    
    
    public void addItemToOrder(String title) {
        if (items == null) {
            items = new HashMap<>();
        }
        int i = 1;
        if (items.containsKey(title)) {
            i = items.get(title) + 1;
        }
        items.put(title, i);
    }

    public void removeItemFromOrder(String title) {
        if (items == null) {
            return;
        }
        if (items.containsKey(title)) {
            items.remove(title);
            if (items.isEmpty()) {
                items = null;
            }
        }
    }
    
}
