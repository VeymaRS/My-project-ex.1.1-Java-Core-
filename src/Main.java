public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(56, 0);
        int d = calc.pow.apply(25);
        int e = calc.abs.apply(25);
        boolean f = calc.isPositive.test(25);
        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(e);
        calc.printlnTest.accept(f);

    }
}
