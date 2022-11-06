package com.task3;


/**
 * @author issy
 *
 * */

public class City {

    private String cityName;
    private boolean regionCenter;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public boolean isRegionCenter() {
        return this.regionCenter;
    }

    public void setRegionCenter(boolean regionCenter) {
        this.regionCenter = regionCenter;
    }
}