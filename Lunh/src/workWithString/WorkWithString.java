package workWithString;

import java.io.UnsupportedEncodingException;
import java.util.*;

public class WorkWithString {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String a = new String("iphone6777");
        String b = new String("iphone");
        //System.out.println("a = " + a + "\tb = " + b);
        //int res = a.codePointAt(0);
        //gSystem.out.println(a.codePointAt(2));
        //System.out.println(a.codePointBefore(2));
        //System.out.println(a.codePointCount(2,5));
        // int res = a.codePointBefore(1);
        //  System.out.println(b.compareTo(a));
        // System.out.println(b.compareTo(a));
        //System.out.println(a.compareToIgnoreCase(b));
        //System.out.println(a.concat(b));
        //System.out.println(a.contains(b));
        //System.out.println(a.contentEquals(b));
        //char ch[] = {'a','e','r','t','g','y'};
        ///String c = String.copyValueOf(ch,2,2);
        //System.out.println(c);
        //a.endsWith(b);
        //CharSequence d = a.subSequence(2,40);
        //System.out.println(d);
        // char ch='现';// Unicode code - 73b0; utf8 - E7 8E B0
        //String str = new String("现");
        //int k = str.getBytes().length;
        //System.out.println("String size = " + str.getBytes().length);
        //System.out.println(ch);
        //System.out.println(str);

        /*String str = "现已整合";
        System.out.println("Строка - " + str);
        System.out.println("Длина строки - " + str.length());
        System.out.println("Длина строки в байтах - " + str.getBytes().length);

        for (int i = 0; i < str.codePointCount(0, str.length()); i++) {
            int index = str.offsetByCodePoints(0, i);
            int code = str.codePointAt(index);
            int[] mas = {code};
            System.out.println(i + "-й символ: " + Integer.toHexString(code) + " " + new String(mas, 0, mas.length));
        }

        System.out.println();
        int[] mas2 = {0x3fdc, 0x4010};
        String str2 = new String(mas2, 0, mas2.length);
        System.out.println("Строка - " + str2);
        System.out.println("Длина строки - " + str2.length());
        System.out.println("Длина строки в байтах - " + str2.getBytes().length);*/


        /*byte[] data3 = { (byte) 0xE3, (byte) 0xEE };
        String str = "Мама мыла раму1!";
        byte[] strCP866 = str.getBytes(Charset.forName("cp866"));

        byte[] strCP1251 = str.getBytes("cp1251");
        for (byte b : strCP866)
            System.out.print(b + " ");
        System.out.println();
        for (byte b : strCP1251)
            System.out.print(b + " ");
        System.out.println();
        System.out.println(new String(strCP866));
        System.out.println(new String(strCP866, "cp866"));
        System.out.println(new String(strCP1251));*/
        /**
         * ОТЛИЧИЕ объектов класса String от объектов классов StringBuilder, StringBuffer:
         * для класса StringBuffer не переопределены методы equals() и hashCode(), т.е. сравнить
         * содержимое двух объектов невозможно, к тому же хэш-коды всех объектов этого типа
         * вычисляются так же, как и для класса Object.
         * */
        /*StringBuilder sb = new StringBuilder();
        sb.append("Java StringBuilder");
        System.out.println("StringBuilder1 : " + sb);
        sb.append(" Example");
        System.out.println("StringBuilder2 : " + sb);
        StringBuilder sb = new StringBuilder();
        sb.append("Java StringBuilder");
        sb.insert(5, "insert ");
        System.out.println("StringBuilder :" + sb);

        StringBuilder sb = new StringBuilder();
        sb.append("Java tringBuilder");
        sb.setCharAt(5, '*');
        System.out.println("StringBuilder : " + sb);

        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();
        formatter.format("%tD", calendar);
        System.out.print(formatter);*


        Calendar cal = Calendar.getInstance();
        System.out.printf(Locale.GERMAN, "%1$tB %1$tA%n", cal);
        System.out.printf(Locale.getDefault(), "%1$tB %1$tA%n", cal);
        Locale l =  new Locale("uk","UK","Linux");
        System.out.println(l.getDisplayName());


        int data[] = { 100, 1000, 10000, 1000000 };
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        for (int i = 0; i < data.length; ++i) {
            System.out.println(data[i] + "\t" + nf.format(data[i]));
        }
        double number = 9876.598;
        NumberFormat nfGer = NumberFormat.getNumberInstance(Locale.GERMANY);
        NumberFormat nfJap = NumberFormat.getNumberInstance(new Locale("no","NO"));
        NumberFormat nfDef = NumberFormat.getNumberInstance(Locale.US);
        System.out.println("Formatting the number: " + nfGer.format(number));
        System.out.println("Formatting the number: " + nfJap.format(number));
        System.out.println("Formatting the number: " + nfDef.format(number));*/

        String s = "         bmw result hashcode zero ";
        //int c = s.split(" ").length;
        //System.out.println(" c = "  +c);
        //int y = s.codePointCount(2,s.length()); // количество точки unicode
        //System.out.println("y = "+y);
        // System.out.println(" codePointBefor = " + s.codePointBefore(+5)); // низкий и высокий сурогатт
        String s2 = String.join(" ", s.trim().split(" "));
        System.out.println(s2);
        String s3 = s.toUpperCase(Locale.ROOT);
        System.out.println(s3.toString());
        //System.out.println(s3.contains(" bmwg result ")); // проверяет есть ли така последовательность символов
        CharSequence dd = new StringBuffer("bmw ");
        System.out.println(s.contentEquals(dd));
        char arr[] = {'s', 'm', 'a', 'q', 'w', 'e'};
        System.out.println(String.copyValueOf(arr));
        System.out.println(String.copyValueOf(arr, 1, 4));
        String s4 = new String("Ataev Ismayyl");
        System.out.println(s4.endsWith("l"));
        String s5 = String.format("%S", s4);
        System.out.println(s5);
        byte d[] = s5.getBytes();
        System.out.println(d);
        System.out.println(" boolean " + s4.startsWith("Ismayyl", 5));
        String s6 = String.valueOf(true);
        String s7 = String.valueOf(arr);
        String s8 = String.valueOf(88);
        String s9 = String.valueOf(99.89);
        String s0 = String.copyValueOf(arr, 2, 4);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s9);
        System.out.println(s0);
        System.out.println(s7.toUpperCase(Locale.ROOT));
        System.out.println(s4.indexOf(4, 6));
        char v[] = new char[20];
        s4.getChars(2, 6, v, 2);
        System.out.println(v);
        System.out.println(s4.lastIndexOf(5, 6));
        System.out.println(s4.replace('a', 'e'));
        String k = String.valueOf(s4);
        System.out.println(k.toLowerCase(Locale.ROOT));
    }
}