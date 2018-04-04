package org.factoryear.data.dao.interfaces;

import org.factoryear.model.cars.Car;

import java.util.List;

public interface CarDAO {
    List<Car> getCarsList();
    void saveCar(Car car);
}
