public class Calculator {

    private static double calc(char a, double x, double y) throws Exception {
        switch (a) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
            default:
                throw new Exception("введена неверная операция");
        }
    }

    private static double calc3(double[] doubles, char[] c) throws Exception {
        double halfRes;
        double res;
        if ((c[1] == '*' || c[1] == '/') && (c[0] == '+' || c[0] == '-')) {
            halfRes = calc(c[1], doubles[1], doubles[2]);
            res = calc(c[0], doubles[0], halfRes);
        } else {
            halfRes = calc(c[0], doubles[0], doubles[1]);
            res = calc(c[1], halfRes, doubles[2]);
        }
        return res;
    }

    public static double calculator(String[] s) throws Exception {
        double result;
        if (s.length == 3) result = calc(Util.getOperations(s)[0],
                Util.getInt(s)[0], Util.getInt(s)[1]);
        else result = calc3(Util.getDouble(Util.getInt(s)), Util.getOperations(s));
        return result;
    }
}
