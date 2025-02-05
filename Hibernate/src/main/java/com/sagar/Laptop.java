package com.sagar;

import jakarta.persistence.Embeddable;

@Embeddable
public class Laptop {
    private String brand;
    private String type;
    private int ram;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", ram=" + ram +
                '}';
    }
}
