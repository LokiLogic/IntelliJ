package com.example.demo;

public interface CRUD_repository {
    void addCar(car car);
    car getCarByModel(String model);
    void updateCar(car car);
    void deleteCar(String model);

}
