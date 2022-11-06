package com.task5.builder.treatment;

import com.task5.builder.Builder;
import com.task5.country.Country;
import com.task5.tourType.TourType;
import com.task5.transportType.TransportType;

public class TreatmentBuilder extends Builder {
    @Override
    public void buildCountry() {
        tour.setCountry(new Country("Germany", "Berlin"));
    }

    @Override
    public void buildTourType() {
        tour.setTourType(TourType.RECREATION);
    }

    @Override
    public void buildTransportType() {
        tour.setTransportType(TransportType.AIRLINE);
    }

    @Override
    public void buildCountDay() {
        tour.setCountDay(30);
    }

    @Override
    public void buildPrice() {
        tour.setPrice(500);
    }
}
