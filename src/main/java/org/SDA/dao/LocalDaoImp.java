package org.SDA.dao;

import org.SDA.model.Location;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;
import java.util.UUID;

public class LocalDaoImp implements LocationDao{
    private SessionFactory sessionFactory;

    public LocalDaoImp(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }

    @Override
    public Location findById(UUID Id) {
        Session session = sessionFactory.getCurrentSession();
        return  session.get(Location.class, Id);
    }

    @Override
    public List<Location> findAll() {
        //Perdoret per rastin kur doam te marrim nje list me sesione open Session
        try(Session session= sessionFactory.openSession()){
            Query<Location> q = session.createQuery("From Location",Location.class);
            return  q.getResultList();
        }

    }

    @Override
    public void save(Location l) {
        Session session= sessionFactory.getCurrentSession();
            session.save(l);
        }


    @Override
    public void update(Location l) {
        Session session= sessionFactory.getCurrentSession();
        session.update(l);
    }

    @Override
    public void delete(Location l) {
        Session session= sessionFactory.getCurrentSession();
        session.delete(l);
    }
}
