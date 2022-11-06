package home.work.task.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SquareRoot {

    private double result;
    private List<Double> arrayKoren;

    double korenX1(double a, double b, double koren) {
        return (-b + koren) / (Math.pow(a, 2));
    }

    double korenX2(double a, double b, double koren) {
        return (-b - koren) / (Math.pow(a, 2));
    }

    public List<Double> getArrayKoren() {
        return arrayKoren;
    }

    public void squareRoot(int a, int b, int c) {
        try {
            this.result = Math.sqrt(discriminant(a, b, c));

            if (result < 0) {
                throw new IndexOutOfBoundsException("Value  < zero"); // logic exceptin ne nashol
            } else if (result == 0) {
                this.arrayKoren.add(korenX1(a, b, result));
            } else {
                this.arrayKoren.add(korenX1(a, b, result));
                this.arrayKoren.add(korenX2(a, b, result));
            }

        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException iex) {
            System.out.println(iex.getStackTrace());
        } catch (Exception ex) {
            System.out.println(ex.getStackTrace());
        }
    }

    Double discriminant(double a, double b, double c) throws NullPointerException {
        if (a == 0) {
            throw new NullPointerException("Your value equals zero ");
        }
        return Math.pow(b, 2) - 4 * (a * c);
    }

    public SquareRoot() {
        this.result = 0.0D;
        this.arrayKoren = new ArrayList<>();
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "SquareRoot{" +
                "result=" + result +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SquareRoot that = (SquareRoot) o;
        return Objects.equals(result, that.result);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}