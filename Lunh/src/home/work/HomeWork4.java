package home.work;

public class HomeWork4 {
    public static void main(String[] args) {

        int x = 749;
        int y = 5;

        double result = (double) x / y;

        int younger = (int) (result % 10);
        int older = (int) ((result * 10) % 10);


        System.out.println(x + " / " + y + " = " + result);
        System.out.println("Старшая цифра дробной части: " + older);
        System.out.println("Младшая цифра целой части: " + younger);
    }
}
