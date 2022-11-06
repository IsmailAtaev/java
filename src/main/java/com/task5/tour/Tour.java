package com.task5.tour;


import com.task5.country.Country;
import com.task5.tourType.TourType;
import com.task5.transportType.TransportType;

import java.util.Objects;

public class Tour {
    private Country country;
    private TourType tourType;
    private TransportType transportType;
    private int countDay;
    private float price;

    public Tour() {
    }

    public Tour(Country country,
                TourType tourType,
                TransportType transportType,
                int countDay,
                float price) {

        this.country = country;
        this.tourType = tourType;
        this.transportType = transportType;
        this.countDay = countDay;
        this.price = price;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
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
        return countDay == tour.countDay && Float.compare(tour.price, price) == 0
                && Objects.equals(country, tour.country)
                && tourType == tour.tourType
                && transportType == tour.transportType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, tourType, transportType, countDay, price);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "country=" + country +
                ", tourType=" + tourType +
                ", transportType=" + transportType + '\'' +
                ", countDay=" + countDay +
                ", price=" + price +
                '}';
    }
}