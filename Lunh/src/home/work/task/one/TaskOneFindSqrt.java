package home.work.task.one;

import home.work.modul.ModulInputStream;
import home.work.modul.MyInputStream;


public class TaskOneFindSqrt {
    public static void main(String[] args) {

        MyInputStream in = new ModulInputStream();
        SquareRoot squareRoot = new SquareRoot();

        squareRoot.squareRoot(in.myInputInt("a"), in.myInputInt("b"), in.myInputInt("c"));
        System.out.println(squareRoot.getArrayKoren());
    }
}