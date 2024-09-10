package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumOfSubtractionAndDivision(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }

    public static double sumOfAllMathOperations(double first, double second) {
        return sumAndMultiply(first, second) + sumOfSubtractionAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат суммы разности и деления двух чисел: " + sumOfSubtractionAndDivision(6, 3));
        System.out.println("Результат суммы всех математических операций: " + sumOfAllMathOperations(6, 3));
    }
}
