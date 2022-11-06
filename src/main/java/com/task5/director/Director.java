package com.task5.director;

import com.task5.builder.*;
import com.task5.tour.*;

public class Director {
    public static Tour createTour(Builder builder) {
        builder.buildCountry();
        builder.buildTourType();
        builder.buildTransportType();
        builder.buildCountDay();
        builder.buildPrice();
        return builder.getTour();
    }
}
