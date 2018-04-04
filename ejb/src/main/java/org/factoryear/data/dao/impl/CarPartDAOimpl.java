package org.factoryear.data.dao.impl;

import org.factoryear.TypeCarParts;
import org.factoryear.TypeEngineProp;
import org.factoryear.data.dao.interfaces.CarPartDAO;
import org.factoryear.model.carparts.CarPart;
import org.factoryear.model.interfaces.PropParts;
import org.factoryear.model.typeprops.SerialPropParts;
import org.factoryear.model.typeprops.StrPropParts;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.logging.Logger;

@Stateless
public class CarPartDAOimpl implements CarPartDAO {

    @Inject
    private Logger log;

    @Inject
    private EntityManager em;

    @Inject
    private Event<CarPart> carPartEventSrc;

    @Override
    public List<CarPart> getCarPartsList() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<CarPart> criteria = cb.createQuery(CarPart.class);
        Root<CarPart> carPart = criteria.from(CarPart.class);
        criteria.select(carPart);
        return em.createQuery(criteria).getResultList();
    }

    @Override
    public void saveCarPart(CarPart carPart) {
        log.info("save carPart");
        em.persist(carPart);
    }

    @Override
    public void saveCarProp(PropParts propParts) {
        em.persist(propParts);
    }

    @Override
    public void saveCarPartNew() {
        SerialPropParts serialPropParts = new SerialPropParts();
        serialPropParts.setName(TypeEngineProp.SERIAL.getText());
        serialPropParts.setSerial("AF566");

        StrPropParts volumePropParts = new StrPropParts();
        volumePropParts.setName(TypeEngineProp.VOLUME.getText());
        volumePropParts.setValue("1.8");

        em.persist(serialPropParts);
        em.persist(volumePropParts);

        CarPart carPart = new CarPart();
        carPart.setParttype(TypeCarParts.ENGIN.getText());
        carPart.getProperties().add(serialPropParts);
        carPart.getProperties().add(volumePropParts);

        em.persist(carPart);
    }
}
