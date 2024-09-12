package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ChessBoardTest {

    @Test
    void wayIs3() {
        int x1 = 2;
        int y1 = 1;
        int x2 = 5;
        int y2 = 4;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void wayIs1() {
        int x1 = 7;
        int y1 = 7;
        int x2 = 6;
        int y2 = 6;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void wayIs0() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 5;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}