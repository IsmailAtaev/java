package com.task5.builder.cruise;

import com.task5.builder.Builder;
import com.task5.country.Country;
import com.task5.tourType.TourType;
import com.task5.transportType.TransportType;

public class CruiseBuilder extends Builder {

    @Override
    public void buildCountry() {
        tour.setCountry(new Country("Denmark", "Copenhagen"));
    }

    @Override
    public void buildTourType() {
        tour.setTourType(TourType.CRUISE);
    }

    @Override
    public void buildTransportType() {
        tour.setTransportType(TransportType.MOTOR_SHIP);
    }

    @Override
    public void buildCountDay() {
        tour.setCountDay(16);
    }

    @Override
    public void buildPrice() {
        tour.setPrice(755);
    }
}
