package org.factoryear.data;

import org.factoryear.data.dao.interfaces.CarDAO;
import org.factoryear.data.dao.interfaces.CarPartDAO;
import org.factoryear.model.carparts.CarPart;
import org.factoryear.model.cars.Car;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@RequestScoped
public class CarProducer {

    @Inject
    private CarDAO carDAO;

    @Inject
    private CarPartDAO carPartDAO;

    private List<Car> cars;
    private List<CarPart> carParts;

    @Produces
    @Named
    public List<Car> getCars() {
        return cars;
    }

    @Produces
    @Named
    public List<CarPart> getCarParts() {
        return carParts;
    }


    @PostConstruct
    void postConstruct() {
        refreshCars();
        refreshCarParts();
    }

    void refreshCars()
    {
        cars=carDAO.getCarsList();
    }

    void refreshCarParts()
    {
        carParts=carPartDAO.getCarPartsList();
    }
}
