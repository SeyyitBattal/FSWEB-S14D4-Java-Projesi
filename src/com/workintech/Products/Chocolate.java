package com.workintech.Products;

public class Chocolate extends ProductForSale {
    public Chocolate(String type, String descpription, double price) {
        super(type, descpription, price);
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate details area");
    }

}
