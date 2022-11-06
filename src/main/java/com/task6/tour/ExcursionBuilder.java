package com.task6.tour;

import com.task5.tourType.TourType;
import com.task5.transportType.TransportType;

public class ExcursionBuilder implements Builder{
   Tour tour;

   public ExcursionBuilder () {
       tour = new Tour();
   }

    @Override
    public Tour setCountry(String country) {
        this.tour.setCountry(country);
        return this.tour;
    }

    @Override
    public Tour setTourType(TourType tourType) {
        return null;
    }

    @Override
    public Tour setTransportType(TransportType transportType) {
        return null;
    }

    @Override
    public Tour setTourName(String tourName) {
        return null;
    }

    @Override
    public Tour setCountDay(int countDay) {
        return null;
    }

    @Override
    public Tour setPrice(float price) {
        return null;
    }
}
