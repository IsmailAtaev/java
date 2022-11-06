package algorithmSwap;

public class AlgorithmSwap {
    public static void main(String[] args) {
        int a = 50;
        String b = new String("123");
        System.out.println("a = " + a + " b = " + b);
        a = swapFunction(a, b);
        System.out.println("a = " + a + " b = " + b);
    }

    public static int swapFunction(int a, String b) {
        System.out.println("a = " + a + " b = " + b);
        Integer temp = (Integer) a;
        a = Integer.parseInt(b);
        b = temp.toString();
        System.out.println("a = " + a + " b = " + b);
        return a;
    }

    public static String chekString(String str) {
        String a = "0";
        String b = "9";
        String result = new String();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > a.charAt(0) || str.charAt(i) < b.charAt(0)) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
