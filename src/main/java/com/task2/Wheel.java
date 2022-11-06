package com.task2;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Ataew Ismayyl
 * */


public class Wheel implements Serializable {

    int wheelDiameter = 0;

    String wheelBrand;

    String wheelType; //* type it is sport or regular, bicycle

    //TODO enum used
    String typeSeason; //* winter or summer

    public Wheel() {
    }

    public Wheel(int wheelRadius, String wheelBrand, String wheelType, String typeSeason) {
        this.wheelDiameter = wheelRadius * 2;
        this.wheelBrand = wheelBrand;
        this.wheelType = wheelType;
        this.typeSeason = typeSeason;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public String getWheelBrand() {
        return wheelBrand;
    }

    public void setWheelBrand(String wheelBrand) {
        this.wheelBrand = wheelBrand;
    }

    public String getWheelType() {
        return wheelType;
    }

    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
    }

    public String getTypeSeason() {
        return typeSeason;
    }

    public void setTypeSeason(String typeSeason) {
        this.typeSeason = typeSeason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return wheelDiameter == wheel.wheelDiameter && Objects.equals(wheelBrand, wheel.wheelBrand) && Objects.equals(wheelType, wheel.wheelType) && Objects.equals(typeSeason, wheel.typeSeason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheelDiameter, wheelBrand, wheelType, typeSeason);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "wheelDiameter=" + wheelDiameter +
                ", wheelBrand='" + wheelBrand + '\'' +
                ", wheelType='" + wheelType + '\'' +
                ", typeSeason='" + typeSeason + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}