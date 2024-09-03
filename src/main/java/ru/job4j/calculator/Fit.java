package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 173;
        double man = manWeight(height);
        System.out.printf("Man 173 is %.2f\n", man);
        double woman = womanWeight(height);
        System.out.printf("Woman 173 is %.2f", woman);
    }

}
