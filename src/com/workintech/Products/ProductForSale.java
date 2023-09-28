package com.workintech.Products;

public abstract class ProductForSale {
    private String type, descpription;
    private double price;

    public ProductForSale(String type, String descpription, double price) {
        this.type = type;
        this.descpription = descpription;
        this.price = price;
    }



    public String getType() {
        return type;
    }

    public String getDescpription() {
        return descpription;
    }

    public double getPrice() {
        return price;
    }

    public double getSalesPrice(int quantity) {
        return quantity * getPrice();
    }

    public abstract void showDetails();
}
