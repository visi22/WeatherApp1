package org.SDA.dao;

import org.SDA.model.Location;
import org.SDA.model.WeatherData;

import java.util.List;
import java.util.UUID;

public interface WeatherDataDao {
    WeatherData findById(UUID Id);
    List<WeatherData> findAll(Location location);
    void save(WeatherData weatherData);

    void update(WeatherData weatherData);

    void delete(WeatherData weatherData);
}
