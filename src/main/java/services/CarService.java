package services;

import model.Car;

import java.util.List;

public interface CarService {
    List<Car> getListByNumbersOfCars(int amount);
    List<Car> getAllCars();
}
