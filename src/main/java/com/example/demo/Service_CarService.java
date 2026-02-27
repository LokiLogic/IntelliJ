package com.example.demo;


import java.util.List;

public interface Service_CarService {
    void SaveCar(car car);
    List<car> getCarsByManufacturer(Manufacturer manufacturer);
     void updateCar(car car);
     void deleteCar(String model);
}
