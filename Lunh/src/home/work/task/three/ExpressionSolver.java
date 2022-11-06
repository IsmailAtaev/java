package home.work.task.three;

public class ExpressionSolver {

    private Double result;

    public ExpressionSolver(Double result) {
        this.result = result;
    }


    public ExpressionSolver() {
        this.result = 0.0D;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }


    public Double valueSin(int x, int y) {
        return Math.sin(x) + Math.cos(y);
    }

    public Double valueCos(int x, int y) {
        return Math.cos(x) + Math.sin(y);
    }

    public Double valueTan(Double x, Double y) {
        result = x * y;
        return Math.tan(result);
    }
}