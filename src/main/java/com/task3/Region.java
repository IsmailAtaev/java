package com.task3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 * @author Ataev Ismayyl
 * @implNote Serializable
 * @see java.io.Serializable
 * Region = Область
 * */

public class Region implements Serializable {

    private String nameRegion;
    private int regionArea;
    protected ArrayList<District> districts = new ArrayList<>();

    public Region() {
    }

    public Region(String nameRegion) {
        this.nameRegion = nameRegion;
    }

    public int getRegionArea() {
        return regionArea;
    }

    public void setRegionArea(int regionArea) {
        this.regionArea = regionArea;
    }

    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
    }

    public void printCenter() {
        for (int i = 0; i < districts.size(); i++) {
            ArrayList<City> cities = districts.get(i).getCities();
            for (int j = 0; j < cities.size(); j++) {
                City city = cities.get(j);
                if (city.isRegionCenter()) {
                    System.out.println(city.getCityName() + " is a region center ");
                }
            }
        }
    }



}
