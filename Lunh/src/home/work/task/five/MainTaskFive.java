package home.work.task.five;

import java.util.Scanner;

public class MainTaskFive {
    public static void main(String[] args) {

        FindCircleArea findCircleArea = new FindCircleArea();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length =\t");
        double l = in.nextDouble();

        double r = findCircleArea.radius(l);
        double s = findCircleArea.square(r);

        System.out.println("Length " + l + "\tRadius = " + r + "\tSquare = " + s);
    }
}