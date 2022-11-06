package com.task5.builder.excursion;

import com.task5.builder.Builder;
import com.task5.country.Country;
import com.task5.tourType.TourType;
import com.task5.transportType.TransportType;

public class ExcursionBuilder extends Builder {

    @Override
    public void buildCountry() {
        this.tour.setCountry(new Country("Russion", "Moscow"));
    }

    @Override
    public void buildTourType() {
        tour.setTourType(TourType.EXCURSIONS);
    }

    @Override
    public void buildTransportType() {
        tour.setTransportType(TransportType.AIRLINE);
    }

    @Override
    public void buildCountDay() {
        tour.setCountDay(10);
    }

    @Override
    public void buildPrice() {
        tour.setPrice(365.23F);
    }
}
