package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ThreeMaxTest {

    @Test
    public void firstMax() {
        int first = 3;
        int second = 2;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void secondMax() {
        int first = 3;
        int second = 5;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void thirdMax() {
        int first = 3;
        int second = 5;
        int third = 8;
        int result = ThreeMax.max(first, second, third);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenAllNumbersEqualThenAnyNumberIsMax() {
        int first = 3;
        int second = 3;
        int third = 3;
        int result = ThreeMax.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

}