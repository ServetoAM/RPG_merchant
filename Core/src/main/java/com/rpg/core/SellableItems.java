package com.rpg.core;

import java.util.ArrayList;

/**
 *
 * @author Serveto
 */
public class SellableItems {
    
    private ArrayList<Items> listMerchandise;
    
    private int basePrice;

    /**
     * Get the value of basePrice
     *
     * @return the value of basePrice
     */
    public int getBasePrice() {
        return basePrice;
    }

    /**
     * Set the value of basePrice
     *
     * @param basePrice new value of basePrice
     */
    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    private int quantity;

    /**
     * Get the value of quantity
     *
     * @return the value of quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Set the value of quantity
     *
     * @param quantity new value of quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private String item;

    /**
     * Get the value of item
     *
     * @return the value of item
     */
    public String getItem() {
        return item;
    }

    /**
     * Set the value of item
     *
     * @param item new value of item
     */
    public void setItem(String item) {
        this.item = item;
    }

}
