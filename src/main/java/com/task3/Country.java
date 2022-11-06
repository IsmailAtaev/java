package com.task3;

import java.util.ArrayList;

public class Country {

    private String countryName;
    private City capital;
    private ArrayList<Region> regions;

    public Country(String countryName, City capital) {
        this.countryName = countryName;
        this.capital = capital;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public void printCapital() {
        System.out.println(capital.getCityName() + " is the capital of " + countryName);
    }

    public void getCenterRegion() {
        for (int i = 0; i < regions.size(); i++) {
            regions.get(i).printCenter();
        }
    }

    public int countArea(){
        int area = 0;
        for(int i =0 ; i < regions.size();i++){
            area += regions.get(i).getRegionArea();
        }
        return area;
    }

    public void printCenterRegion() {
        for (int i = 0; i < regions.size(); i++) {
            regions.get(i).printCenter();
        }
    }
}
