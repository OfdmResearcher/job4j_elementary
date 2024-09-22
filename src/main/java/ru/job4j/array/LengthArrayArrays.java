package ru.job4j.array;

public class LengthArrayArrays {

    public static void main(String[] args) {
        int[][] array = {{5}, {2, 1}, {65, 34, 2}, {4, 7, 553, 1001}};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Размер вложенного массива равен: " + array[i].length);
        }
    }
}
