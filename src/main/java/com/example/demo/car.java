package com.example.demo;

public class car
{
    private String model;
    private int year;
    private Manufacturer manufacturer;

    public car(String model, int year, Manufacturer manufacturer) {
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
