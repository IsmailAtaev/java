package Lunh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lunh {
    public static void main(String[] args) {
        String flags = new String();
        do {
            List<Integer> arrays = new ArrayList<>();
            System.out.println(" Введите номер карты ");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();

            for (int i = str.length(); i > 0; i--) {
                arrays.add(Character.getNumericValue(str.charAt(i - 1)));
            }

            for (int j = 0; j < arrays.size(); j++) {
                System.out.println(arrays.get(j));
                if (j % 2 == 0) {
                    Integer temp = new Integer(arrays.get(j) * 2);
                    arrays.set(j, temp);
                    if (arrays.get(j) > 9) {
                        Integer val = new Integer(arrays.get(j) - 9);
                        arrays.set(j, val);
                    } else
                        continue;
                } else
                    continue;
            }
            Integer res = new Integer(0);
            for (int n = 0; n < arrays.size(); n++) {
                res += arrays.get(n);
            }
            if (res % 10 == 0) {
                System.out.println(" Карта валидатная true ");
            } else {
                System.out.println("  Карта не валидатная false!!! ");
            }
            System.out.println(" Хотите повторить если Да нажмите (1) или Нет (2)");
            flags = scanner.next();
        } while (flags.equals("1"));
    }
}