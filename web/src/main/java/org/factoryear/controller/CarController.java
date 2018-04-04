package org.factoryear.controller;

import org.factoryear.data.dao.interfaces.CarPartDAO;
import org.factoryear.model.carparts.CarPart;
import org.factoryear.model.cars.Car;

import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.util.List;

@Model
public class CarController {

    @Inject
    private FacesContext facesContext;

    @Inject
    private CarPartDAO carPartDAO;

    private List<CarPart> carParts;

    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<CarPart> getCarParts() {
        return carParts;
    }

    public void setCarParts(List<CarPart> carParts) {
        this.carParts = carParts;
    }

    public void makeEngin() {
        try {
            carPartDAO.saveCarPartNew();
        } catch (Exception e) {
            FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_ERROR, "saveCarPartNew error", "ad fail");
            facesContext.addMessage(null, m);
        }

    }
}
