package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchWeekTest {

    @Test
    public void when1ThenMonday() {
        int input = 1;
        String result = SwitchWeek.nameOfDay(input);
        String expected = "Monday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when5ThenFriday() {
        int input = 5;
        String result = SwitchWeek.nameOfDay(input);
        String expected = "Friday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when1012ThenError() {
        int input = 1012;
        String result = SwitchWeek.nameOfDay(input);
        String expected = "Error! Unknown day";
        assertThat(result).isEqualTo(expected);
    }

}