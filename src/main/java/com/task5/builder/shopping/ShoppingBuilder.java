package com.task5.builder.shopping;

import com.task5.builder.Builder;
import com.task5.country.Country;
import com.task5.tourType.TourType;
import com.task5.transportType.TransportType;

public class ShoppingBuilder extends Builder {

    @Override
    public void buildCountry() {
        tour.setCountry(new Country("Italy", "Rome"));
    }

    @Override
    public void buildTourType() {
        tour.setTourType(TourType.SHOPPING);
    }

    @Override
    public void buildTransportType() {
        tour.setTransportType(TransportType.CAR);
    }

    @Override
    public void buildCountDay() {
        tour.setCountDay(7);
    }

    @Override
    public void buildPrice() {
        tour.setPrice(275);
    }
}
