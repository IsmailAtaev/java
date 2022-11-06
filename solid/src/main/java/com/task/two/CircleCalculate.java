package com.task.two;

public class CircleCalculate {
    public static double getCircleAreaOfSmaller(Circle squareFirst, Circle squareSecond) {
        if (squareFirst == null || squareSecond == null)
            throw new NullPointerException();
        return (squareFirst.getSquare() <= squareSecond.getSquare()) ? squareFirst.getSquare() : squareSecond.getSquare();
    }
}
