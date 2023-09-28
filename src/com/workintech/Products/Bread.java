package com.workintech.Products;

public class Bread extends ProductForSale{
    public Bread(String type, String descpription, double price) {
        super(type, descpription, price);
    }

    @Override
    public void showDetails() {
        System.out.println("Bread details area");
    }
}
