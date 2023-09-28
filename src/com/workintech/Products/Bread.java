package com.workintech.Products;

public class Bread extends ProductForSale {
    private final String justBread = "My Bread";

    public Bread(String type, String descpription, double price) {
        super(type, descpription, price);
    }

    @Override
    public void showDetails() {
        System.out.println("Bread details: " + this.justBread);
        System.out.println("Bread type: " + super.getType());
        System.out.println("Bread's description: " + super.getDescpription());
        System.out.println("Price: " + super.getPrice() + "₺");


    }
}
