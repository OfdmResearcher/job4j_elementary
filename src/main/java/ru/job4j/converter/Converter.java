package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 90;
    }

    public static void main(String[] args) {
        float input = 200;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("200 rubles are 2 EURO. Test result : " + passed);
        float input2 = 180;
        float output2 = Converter.rubleToDollar(input2);
        boolean passed2 = expected == output2;
        System.out.println("180 rubles are 2 dollars. Test result : " + passed2);
    }
}
