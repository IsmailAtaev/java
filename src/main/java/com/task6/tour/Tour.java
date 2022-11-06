package com.task6.tour;


import com.task5.country.Country;
import com.task5.tourType.TourType;
import com.task5.transportType.TransportType;

import java.util.Objects;

public class Tour {
    private String country;
    private String city;
    private TourType tourType;
    private TransportType transportType;
    private String tourName;
    private int countDay;
    private float price;

    public Tour(String country, String city, TourType tourType, TransportType transportType, String tourName, int countDay, float price) {
        this.country = country;
        this.city = city;
        this.tourType = tourType;
        this.transportType = transportType;
        this.tourName = tourName;
        this.countDay = countDay;
        this.price = price;
    }

    public Tour() {

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public TourType getTourType() {
        return tourType;
    }

    public void setTourType(TourType tourType) {
        this.tourType = tourType;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public int getCountDay() {
        return countDay;
    }

    public void setCountDay(int countDay) {
        this.countDay = countDay;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return countDay == tour.countDay && Float.compare(tour.price, price) == 0 && Objects.equals(country, tour.country) && Objects.equals(city, tour.city) && tourType == tour.tourType && transportType == tour.transportType && Objects.equals(tourName, tour.tourName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, tourType, transportType, tourName, countDay, price);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", tourType=" + tourType +
                ", transportType=" + transportType +
                ", tourName='" + tourName + '\'' +
                ", countDay=" + countDay +
                ", price=" + price +
                '}';
    }
}