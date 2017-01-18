package com.redhat;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Viral Gohel
 */
@XmlRootElement
public class Order {
    private String itemName;
    private int qty;
    private double price;

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
