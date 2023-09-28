package com.workintech.Products;

public class Chocolate extends ProductForSale {
    private final String justChocolate = "My Chocolate";

    public Chocolate(String type, String descpription, double price) {
        super(type, descpription, price);
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate details: " + this.justChocolate);
        System.out.println("Chocolate type: " + super.getType());
        System.out.println("Chocolate's description: " +super.getDescpription());
        System.out.println("Price: " + super.getPrice() + "₺");
    }

}
