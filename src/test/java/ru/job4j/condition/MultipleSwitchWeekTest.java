package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MultipleSwitchWeekTest {

    @Test
    void whenMondayThen1() {
        String name = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenRussianFridayThen5() {
        String name = "Пятница";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenUnknownDayThenMinusOne() {
        String name = "Holiday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}