package org.factoryear.model.cars;

import org.factoryear.model.carparts.CarPart;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Car")
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<CarPart> carparts = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CarPart> getCarparts() {
        return carparts;
    }

    public Car(List<CarPart> carparts) {
        this.carparts = carparts;
    }

    public void addCarPart(CarPart carPart) {
        carparts.add(carPart);
        carPart.setCar(this);
    }

    public void removeCarPart(CarPart carPart) {
        carparts.remove( carPart );
        carPart.setCar(null);
    }

    public void detachCarPart(CarPart carPart) {
        carPart.setCar(null);
    }

    public void detachAllCarPart() {
        carparts.stream().forEach(c->c.setCar(null));
    }
}
