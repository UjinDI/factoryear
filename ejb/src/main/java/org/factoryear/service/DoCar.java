package org.factoryear.service;


import org.factoryear.TypeCarParts;
import org.factoryear.model.carparts.CarPart;
import org.factoryear.model.cars.Car;
import org.factoryear.model.interfaces.PropParts;

import java.util.List;

public interface DoCar {
    Car makeCar();
    CarPart makeCarPart(TypeCarParts typeCarPart, List<PropParts<?>> propPartses);
}
