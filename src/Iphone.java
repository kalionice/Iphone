package com.MWcode;

public class Iphone {

    // Properties

    private IphoneModel model;
    private double price;
    private boolean isWaterResistant;

    public Iphone() {}

    public Iphone(IphoneModel model,
                  double price,
                  boolean isWaterResistant) {
        this.model = model;
        this.price = price;
        this.isWaterResistant = isWaterResistant;
    }

    public Iphone(IphoneModel model) {
        this(model, 999, true);
        this.model = model;
    }

    public Iphone(IphoneModel model, double price) {
        this(model, 1_000, true);
        this.model = model;
        this.price = price;
    }

    // Behaviors -> functionality

    public IphoneModel getModel() {
        return model;
    }

    public void setModel(IphoneModel model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        this.isWaterResistant = waterResistant;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", isWaterResistant=" + isWaterResistant +
                '}';
    }
}
