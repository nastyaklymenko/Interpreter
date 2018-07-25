
public class InterpreterApp{

    public static void main(String[] args) {
        Context context = new Context();
        Expression expr = context.evaluate("1+2+3");
        System.out.println("1 + 2 + 3 = " + expr.interpret());
    }
}

