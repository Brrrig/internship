import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Util {

    public static String reading() {
        out.println("Введите математическую операцию с двумя или тремя целыми числами по модулю от 1 до 10");
        Scanner scanner = new Scanner(in);
        String s = scanner.nextLine();
        scanner.close();
        return s;
    }

    public static String[] split(String s) {
        return s.split(" ");
    }

    public static int[] getInt(String[] s) {
        ArrayList <Integer> integerList = new ArrayList<>();
        integerList.add(0, Integer.parseInt(s[0]));
        integerList.add(1, Integer.parseInt(s[2]));
        if (s.length > 3) integerList.add(2, Integer.parseInt(s[4]));
        for (int re : integerList) {
            if (Math.abs(re) < 1 || Math.abs(re) > 10) try {
                throw new Exception("Illegal argument");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        int[] res = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            res[i] = integerList.get(i);
        }
        return res;
    }

    public static double[] getDouble(int[] intArgs) {
        double [] doubles = new double[3];
        for (int i = 0; i < intArgs.length; i++) {
            doubles[i] = intArgs[i];
        }
        return doubles;
    }

    public static char[] getOperations(String[] s) {
        char [] operators = new char[2];
        operators[0] = s[1].charAt(0);
        if (s.length > 3) operators[1] = s[3].charAt(0);
        return operators;
    }

}
