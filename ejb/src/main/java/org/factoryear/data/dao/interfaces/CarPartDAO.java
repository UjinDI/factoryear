package org.factoryear.data.dao.interfaces;


import org.factoryear.model.carparts.CarPart;
import org.factoryear.model.interfaces.PropParts;

import java.util.List;

public interface CarPartDAO {
    List<CarPart> getCarPartsList();
    void saveCarPart(CarPart carPart);
    void saveCarProp(PropParts propParts);
    void saveCarPartNew();
}
