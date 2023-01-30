import classes.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(30, 2);
        //Здесь значение не должно быть равно 0
        int b = calc.minus.apply(1,5);
        int c = calc.divide.apply(a, b);
        int d = calc.multiply.apply(b,c);
        int e = calc.pow.apply(d);
        int f = calc.abs.apply(c);
        calc.printing.out("a", a);
        calc.printing.out("b", b);
        calc.printing.out("c", c);
        calc.printing.out("d", d);
        calc.printing.out("e", e);
        calc.printing.out("f", f);
        calc.printing.out("Положительное f", calc.isPositive.test(f));
        calc.printing.out("Положительное c", calc.isPositive.test(c));

    }
}
