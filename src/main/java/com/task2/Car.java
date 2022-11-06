package com.task2;

import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.CancellationException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;


public class Car implements Serializable {

    private static Logger logger = LogManager.getLogger(Car.class.getName());
    private Engine engine;
    private Wheel wheel;
    private String autoBrand;
    private float tankVolume;

    public Car(Engine engine, Wheel wheel, String autoBrand, float tankVolume) {
        this.engine = engine;
        this.wheel = wheel;
        this.autoBrand = autoBrand;
        this.setTankVolume(tankVolume);
    }

    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public Car(String autoBrand, float tankVolume) {
        this.autoBrand = autoBrand;
        this.setTankVolume(tankVolume);
    }

    //* constructor copy
    public Car(Car car) {
        this.engine = car.engine;
        this.wheel = car.wheel;
        this.autoBrand = car.autoBrand;
        this.setTankVolume(car.getTankVolume());
    }

    public Car() {
    }

    public String getAutoBrand() {
        return autoBrand;
    }

    public void setAutoBrand(String autoBrand) {
        this.autoBrand = autoBrand;
    }

    public float getTankVolume() {
        return tankVolume;
    }

    /**
     * @param tankVolume
     * @throws IllegalArgumentException if tankVolume more 100 or less 1
     *                                  because car do not have more one hundred gasoline
     */
    public void setTankVolume(float tankVolume) throws IllegalArgumentException {
        if (tankVolume > 100.0F || tankVolume < 1.0F) {
            logger.log(Level.ERROR, "class Car method setTankVolume()");
            throw new IllegalArgumentException("countLiter more one hundred or" +
                    " countLiter less one");
        }
        this.tankVolume = tankVolume;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheel=" + wheel +
                ", autoBrand='" + autoBrand + '\'' +
                ", tankVolume=" + tankVolume +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Car();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Float.compare(car.tankVolume, tankVolume) == 0 && Objects.equals(engine, car.engine) && Objects.equals(wheel, car.wheel) && Objects.equals(autoBrand, car.autoBrand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, wheel, autoBrand, tankVolume);
    }

    /**
     * @throws IllegalArgumentException
     * @throws Exception
     * if car have less one gasoline then exception
     * @return boolean;
     * */

    public boolean drive() {
        if (this.getTankVolume() < 1) return false;
        System.out.println("Drive the car" + this.getAutoBrand() + " gasoline " + this.getTankVolume());
        this.tankVolume--;
        return true;
    }

    public void changeWheel(int radiusWheel) {
        this.wheel.setWheelDiameter(radiusWheel * 2);
    }

    public boolean gasUp(int countLiter) {
        try {
            this.setTankVolume(countLiter);
        } catch (IllegalArgumentException argumentException) {
            logger.log(Level.ERROR, argumentException);
            return false;
        } catch (Exception e) {
            logger.log(Level.ERROR, e);
            return false;
        }
        return true;
    }

}