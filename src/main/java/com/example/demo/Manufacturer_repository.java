package com.example.demo;

public interface Manufacturer_repository {
    void addManufacturer(Manufacturer manufacturer);
    Manufacturer getManufacturerByName(String name);
    void updateManufacturer(Manufacturer manufacturer);
    void deleteManufacturer(String name);
}
