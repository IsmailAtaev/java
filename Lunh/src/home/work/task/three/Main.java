package home.work.task.three;
import home.work.modul.*;

public class Main {
    public static void main(String[] args) {

        ModulInputStream in = new ModulInputStream();
        ExpressionSolver expressionSolver = new ExpressionSolver();

        double sin = expressionSolver.valueSin(in.myInputInt(" sin a "), in.myInputInt(" cos b "));
        double cos = expressionSolver.valueCos(in.myInputInt("cos a "), in.myInputInt(" sin b "));
        double result = expressionSolver.valueTan(sin, cos);
        System.out.println("Result = " + result);

    }
}
