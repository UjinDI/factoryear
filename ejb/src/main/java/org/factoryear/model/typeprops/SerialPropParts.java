package org.factoryear.model.typeprops;


import org.factoryear.model.interfaces.PropParts;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="SerialPropParts",
        uniqueConstraints =  @UniqueConstraint(
                name = "uk_serial_constraint",
                columnNames = {
                        "serial"
                }
            )
        )
public class SerialPropParts implements PropParts<String>, Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "serial")
    private String serial;

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
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

}
