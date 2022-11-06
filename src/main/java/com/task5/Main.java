package com.task5;

import com.task5.builder.cruise.CruiseBuilder;
import com.task5.builder.excursion.ExcursionBuilder;
import com.task5.builder.recreation.RecreationBuilder;
import com.task5.builder.shopping.ShoppingBuilder;
import com.task5.builder.treatment.TreatmentBuilder;
import com.task5.director.Director;
import com.task5.tour.Tour;

public class Main {
    public static void main(String[] args) {
        Tour tour1 = Director.createTour(new ExcursionBuilder());
        Tour tour2 = Director.createTour(new ShoppingBuilder());
        Tour tour3 = Director.createTour(new RecreationBuilder());
        Tour tour4 = Director.createTour(new TreatmentBuilder());
        Tour tour5 = Director.createTour(new CruiseBuilder());


        System.out.println("\nexcursion --> " + tour1.toString() + "\n");
        System.out.println("shopping --> " + tour2.toString() + "\n");
        System.out.println("recreation --> " + tour3.toString() + "\n");
        System.out.println("treatment --> " + tour4.toString() + "\n");
        System.out.println("cruise --> " + tour5.toString() + "\n");
    }
}
