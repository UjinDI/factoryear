package org.factoryear.data.dao.impl;

import org.factoryear.data.dao.interfaces.CarDAO;
import org.factoryear.model.cars.Car;

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
public class CarDAOimpl implements CarDAO {

    @Inject
    private Logger log;

    @Inject
    private EntityManager em;

    @Inject
    private Event<Car> carEventSrc;

    @Override
    public List<Car> getCarsList() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Car> criteria = cb.createQuery(Car.class);
        Root<Car> car = criteria.from(Car.class);
        criteria.select(car);
        return em.createQuery(criteria).getResultList();
    }

    @Override
    public void saveCar(Car car) {
        log.info("save car");
        em.merge(car);
        carEventSrc.fire(car);
    }


}
