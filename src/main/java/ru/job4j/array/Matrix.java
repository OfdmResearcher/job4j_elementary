package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i == 0) {
                    table[i][j] = j + 1;
                } else if (j == 0) {
                    table[i][j] = i + 1;
                } else {
                    table[i][j] = (i + 1) * (j + 1);
                }
            }
        }
        return table;
    }
}
