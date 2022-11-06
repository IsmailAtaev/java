package com.task5.builder.recreation;

import com.task5.builder.Builder;
import com.task5.country.Country;
import com.task5.tourType.TourType;
import com.task5.transportType.TransportType;

public class RecreationBuilder extends Builder {
    @Override
    public void buildCountry() {
        tour.setCountry(new Country("USA","LasAngels"));
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
        tour.setCountDay(15);
    }

    @Override
    public void buildPrice() {
        tour.setPrice(1115.30F);
    }
}
