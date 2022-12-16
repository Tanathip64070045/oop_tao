/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.Icon;

/**
 *
 * @author norrapat
 */
public class EachDrinkModel {
    private Icon icon;
    private String product;
    private String category;
    private double price;

    public EachDrinkModel(Icon icon, String product, String category, double price) {
        this.icon = icon;
        this.product = product;
        this.category = category;
        this.price = price;
    }
    

    public Icon getIcon() {
        return icon;
    }

    public String getProduct() {
        return product;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
    
}
