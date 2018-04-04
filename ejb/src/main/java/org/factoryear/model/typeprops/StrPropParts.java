package org.factoryear.model.typeprops;

import org.factoryear.model.interfaces.PropParts;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="StrPropParts")
public class StrPropParts implements PropParts<String>, Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "value")
    private String value;

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

    public String getSerial() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}