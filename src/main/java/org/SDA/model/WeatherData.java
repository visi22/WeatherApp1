package org.SDA.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "weatherdata")
public class WeatherData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    private Date date;
    private double temperature;
    private double pressure;
    private double humidity;
    private double windDirection;
    private double windSpeed;

    public WeatherData(Date date, double temperature, double pressure, double humidity, double windDirection, double windSpeed) {
        this.date=date;
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
    }

    public WeatherData() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(double windDirection) {
        this.windDirection = windDirection;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }


}
