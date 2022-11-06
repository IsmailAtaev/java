package com.task5.country;

import java.util.Objects;

public class Country {
    private String nameCountry;
    private String nameCity;

    public Country(String nameCountry, String nameCity) {
        this.nameCountry = nameCountry;
        this.nameCity = nameCity;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(nameCountry, country.nameCountry) && Objects.equals(nameCity, country.nameCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCountry, nameCity);
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameCountry='" + nameCountry + '\'' +
                ", nameCity='" + nameCity + '\'' +
                '}';
    }
}
