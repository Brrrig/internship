import static java.lang.System.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String s = Util.reading();
        out.println(Calculator.calculator(Util.split(s)));
    }
}