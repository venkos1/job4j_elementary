package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiplay(double first, double second) {
        return sum(first, second) + multiplay(first, second);
    }

    public static double sumSubtractionDivision(double first, double second) {
        return subtraction(first, second) + division(first, second);
    }

    public static double sumSumSubMultDiv(double first, double second) {
        return sum(first, second) + subtraction(first, second)
                + multiplay(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен: " + sumAndMultiplay(10, 20));

    }
}
