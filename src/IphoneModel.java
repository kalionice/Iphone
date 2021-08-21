package com.MWcode;

public enum IphoneModel {
    IPHONE_12_PRO("Iphone 12 Pro"),
    IPHONE_12_MINI("Iphone 12 Mini"),
    IPHONE_12("Iphone 12");

    private String modelStr;

    IphoneModel(String model) {
        this.modelStr = model;
    }

    public String getModelStr() {
        return modelStr;
    }
}
