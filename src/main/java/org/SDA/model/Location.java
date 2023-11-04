package org.SDA.model;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID Id;
    private double latitude;
    private double longitude;

    private String region;
    private String country;

    public Location(double latitude, double longitude, String region, String country) {

        this.latitude = latitude;
        this.longitude = longitude;
        this.region = region;
        this.country = country;
    }

    public Location() {

    }

    public UUID getId() {
        return Id;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setRegion(String rajoni) {
        region = rajoni;
    }

    public void setCountry(String shteti) {
        country = shteti;
    }

    @Override
    public String toString() {
        return "Location{" +
                "Id=" + Id +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
