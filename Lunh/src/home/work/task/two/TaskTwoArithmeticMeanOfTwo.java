package home.work.task.two;

import home.work.modul.ModulInputStream;

public class TaskTwoArithmeticMeanOfTwo {
    public static void main(String[] args) {

        ModulInputStream in = new ModulInputStream();
        Calculate calculate = new Calculate();

        int result = calculate.arithmeticalMean(in.myInputInt(" a "), in.myInputInt(" b "));
        System.out.println("Result = " + result);

    }
}
