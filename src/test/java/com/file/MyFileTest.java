package com.file;

import com.task2.Car;
import com.task2.Engine;
import com.task2.Wheel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class MyFileTest {

    @Test
    void myWriteTest() {
        MyFile<Car> carMyFile = new MyFile<>();
        ArrayList<Car> carArrayList = new ArrayList<>();
        Car car1= new Car(new Engine("BMW", "G550", "5.5", 2001),new Wheel(11,"Dunlop","Sedan","Winter"),"BMW",60);
        Car car2 = new Car(new Engine("Mercedes", "G550", "5.5", 2001),new Wheel(9,"Michel","Sedan","Summer"),"Mercedes-Benz",75);
        Car car3 = new Car(new Engine("SportMustang", "KL5.300", "5.3", 1989),new Wheel(10,"Michel","Sedan","Summer"),"BMW",95);
        Car car4 = new Car(new Engine("Jeep", "KL4.200", "5.3", 1995),new Wheel(10,"Michel","jyp","Winter"),"JEEP",93);

        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);
        carArrayList.add(car4);

        boolean expected = carMyFile.myWrite(carArrayList, "Car.txt");
        Assertions.assertEquals(expected, true);
    }
    @Test
    void myReadTest() {
        MyFile<Engine> engineMyFile = new MyFile<>();
        ArrayList<Engine> engineArrayActually = new ArrayList<>();
        engineArrayActually.add(new Engine("BMW", "G550", "5.5", 2001));
        engineArrayActually.add(new Engine("Mercedes", "G550", "5.5", 2001));
        engineArrayActually.add(new Engine("SportMustang", "KL5.300", "5.3", 1989));
        ArrayList<Engine> engineArrayExpected = engineMyFile.myRead("Engine.txt");
        Assertions.assertEquals(engineArrayExpected, engineArrayActually);
    }

    @Test
    void myReadCarTest(){
        MyFile<Car> engineMyFile = new MyFile<>();
        ArrayList<Car> carArrayList = new ArrayList<>();
        Car car1= new Car(new Engine("BMW", "G550", "5.5", 2001),new Wheel(11,"Dunlop","Sedan","Winter"),"BMW",60);
        Car car2 = new Car(new Engine("Mercedes", "G550", "5.5", 2001),new Wheel(9,"Michel","Sedan","Summer"),"Mercedes-Benz",75);
        Car car3 = new Car(new Engine("SportMustang", "KL5.300", "5.3", 1989),new Wheel(10,"Michel","Sedan","Summer"),"BMW",95);
        Car car4 = new Car(new Engine("Jeep", "KL4.200", "5.3", 1995),new Wheel(10,"Michel","jyp","Winter"),"JEEP",93);

        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);
        carArrayList.add(car4);

        ArrayList<Car> carArrayExpected = engineMyFile.myRead("Car.txt");
        Assertions.assertEquals(carArrayExpected, carArrayList);
    }



}