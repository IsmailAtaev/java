package com.task3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class District implements Serializable {

    private String nameDistrict;
    private ArrayList<City> cities;

    public District() {
    }

    public District(String nameDistrict) {
        this.nameDistrict = nameDistrict;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }
}