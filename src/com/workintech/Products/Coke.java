package com.workintech.Products;

public class Coke extends ProductForSale{
    private final String justCoke = "My Coke";
    public Coke(String type, String descpription, double price) {
        super(type, descpription, price);
    }

    @Override
    public void showDetails() {
        System.out.println("Coke details: " + this.justCoke);
        System.out.println("Coke type: " + super.getType());
        System.out.println("Coke's description: " +super.getDescpription());
        System.out.println("Price: " + super.getPrice() + "₺");
    }
}
