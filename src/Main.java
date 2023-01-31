import classes.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(30, 2);

        //Здесь значение не должно быть равно 0
        int b = calc.minus.apply(1, 1);

        int c = calc.divide.apply(a, b);
        int d = calc.multiply.apply(b, c);
        int e = calc.pow.apply(d);
        int f = calc.abs.apply(c);

        boolean isFPositive = calc.isPositive.test(f);
        boolean isCPositive = calc.isPositive.test(c);
        calc.printing.out("a", a);
        calc.printing.out("b", b);
        calc.printing.out("c", c);
        calc.printing.out("d", d);
        calc.printing.out("e", e);
        calc.printing.out("f", f);
        calc.printing.out("Положительное f", isFPositive);
        calc.printing.out("Положительное c", isCPositive);

    }
}
