package org.factoryear.model.typeprops;

import org.factoryear.model.interfaces.PropParts;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="IntPropParts")
public class IntPropParts implements PropParts<Integer>, Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "value")
    private Integer value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSerial() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}