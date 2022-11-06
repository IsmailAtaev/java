package com.task.two;

/**
 *
 * */


public class Circle {

    private double radius;

    private double square;

    public Circle() {
        super();
    }

    public Circle(double radius, double square) {
        this.radius = radius;
        this.square = square;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    //* setter radius and return square
    public double getSquare(Double radius) throws NullPointerException,Exception {
        if (radius == null)
            throw new NullPointerException();
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}