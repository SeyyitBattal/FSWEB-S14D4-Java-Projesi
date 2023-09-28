package com.workintech.Products;

public class Coke extends ProductForSale{
    public Coke(String type, String descpription, double price) {
        super(type, descpription, price);
    }

    @Override
    public void showDetails() {
        System.out.println("Coke details area");
    }
}
