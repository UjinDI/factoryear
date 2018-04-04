package org.factoryear.model.carparts;

import javax.persistence.*;
import java.io.Serializable;

@Table( name = "CarPartProp" )
public class CarPartProp implements Serializable {

    @Column(name = "carpart_id")
    private String carpart_id;

    @Column(name = "property_type")
    private String property_type;

    @Column(name = "prop_id")
    private Long prop_id;

    public CarPartProp(String carpart_id, String property_type, Long prop_id) {
        this.carpart_id = carpart_id;
        this.property_type = property_type;
        this.prop_id = prop_id;
    }


    public String getCarpart_id() {
        return carpart_id;
    }

    public void setCarpart_id(String carpart_id) {
        this.carpart_id = carpart_id;
    }

    public String getProperty_type() {
        return property_type;
    }

    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }

    public Long getProp_id() {
        return prop_id;
    }

    public void setProp_id(Long prop_id) {
        this.prop_id = prop_id;
    }
}
