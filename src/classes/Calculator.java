package classes;

import interfaces.Printing;

import java.util.function.*;

import static java.lang.Float.NaN;

public class Calculator {
    public static Supplier<Calculator> instance = Calculator::new;

    public Calculator() {
    }

    public BinaryOperator<Integer> plus = (x, y) -> x + y;
    public BinaryOperator<Integer> minus = (x, y) -> x - y;
    public BinaryOperator<Integer> multiply = (x, y) -> x * y;
    public BinaryOperator<Integer> divide = (x, y) -> x / y;
    public UnaryOperator<Integer> pow = x -> x * x;
    public UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    public Predicate<Integer> isPositive = x -> x > 0;

    public Printing<String, Object> printing = (a, b) -> {
        System.out.println(a + " : " + b);
    };



}
