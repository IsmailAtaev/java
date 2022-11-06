package com.task5.builder;

import com.task5.tour.Tour;

public abstract class Builder {

    protected Tour tour = new Tour();

    public abstract void buildCountry();

    public abstract void buildTourType();

    public abstract void buildTransportType();

    public abstract void buildCountDay();

    public abstract void buildPrice();

    public Tour getTour() {
        return tour;
    }
}