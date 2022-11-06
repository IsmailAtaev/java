package com.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void setTankVolumeTest() {
        Car car = new Car();
        float actually = 25;
        car.setTankVolume(actually);
        float expected = car.getTankVolume();
        Assertions.assertEquals(expected,actually);
    }

    @Test
    void driveTestPositive() {

        Car carActually = new Car(new Engine("BMW", "G550", "5.5", 2001),
                new Wheel(11, "Dunlop", "Sedan", "Winter"),
                "BMW", 60);

        boolean actually = true;
        boolean expected = carActually.drive();
        Assertions.assertEquals(expected,actually);

    }
    @Test
    void driveTestNegative() {

        Car carActually = new Car(new Engine("BMW", "G550", "5.5", 2001),
                new Wheel(11, "Dunlop", "Sedan", "Winter"),
                "BMW", 1);

        carActually.drive();
        boolean expected = carActually.drive();
        Assertions.assertEquals(expected,false);

    }

    @Test
    void changeWheelTest() {
        Car car = new Car(new Engine("BMW", "G550", "5.5", 2001),
                new Wheel(11, "Dunlop", "Sedan", "Winter"),
                "BMW", 50);
        int actually = 11 * 2;
        int expected = car.getWheel().wheelDiameter;
        Assertions.assertEquals(expected, actually);
    }
}