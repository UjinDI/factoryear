package org.factoryear.model.carparts;

import org.factoryear.model.cars.Car;
import org.factoryear.model.interfaces.PropParts;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "CarPart" )
public class CarPart implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "parttype")
    private String parttype; //кузов, двигатель, трансмиссия, ...

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carid")
    private Car car;

    @ManyToAny(
            metaDef = "CarPartsPropertyMetaDef",
            metaColumn = @Column( name = "property_type" )
    )

    @Cascade( { org.hibernate.annotations.CascadeType.ALL })
    @JoinTable(name = "CarPartProp",
            joinColumns = @JoinColumn(name = "carpart_id"),
            inverseJoinColumns = @JoinColumn(name = "prop_id")
    )
    private List<PropParts<?>> properties = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParttype() {
        return parttype;
    }

    public void setParttype(String parttype) {
        this.parttype = parttype;
    }

    public List<PropParts<?>> getProperties() {
        return properties;
    }

    public void setProperties(List<PropParts<?>> properties) {
        this.properties = properties;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
