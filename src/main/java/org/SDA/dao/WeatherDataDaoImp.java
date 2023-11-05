package org.SDA.dao;

import org.SDA.model.Location;
import org.SDA.model.WeatherData;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;
import java.util.UUID;

public class WeatherDataDaoImp implements WeatherDataDao{
    private SessionFactory sessionFactory;

    public  WeatherDataDaoImp(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }

    @Override
    public WeatherData findById(UUID Id) {
        Session session = sessionFactory.getCurrentSession();
        return  session.get(WeatherData.class,Id);
    }

    @Override
    public List<WeatherData> findAll(Location location) {
        try (Session session = sessionFactory.openSession()) {
            Query<WeatherData> q = session.createQuery("From WeatherData WHERE Location=:location",WeatherData.class);
            q.setParameter("location",location);
            return q.getResultList();
        }
    }

    @Override
    public void save(WeatherData weatherData) {
         Session session = sessionFactory.getCurrentSession();
         session.save(weatherData);
    }

    @Override
    public void update(WeatherData weatherData) {
        Session session = sessionFactory.getCurrentSession();
        session.update(weatherData);

    }

    @Override
    public void delete(WeatherData weatherData) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(weatherData);
    }
}
