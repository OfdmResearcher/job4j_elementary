package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class FitTest {

    @Test
    public void whenManHeight180ThenWeight92() {
        short height = 180;
        double expected = 92.0;
        double result = Fit.manWeight(height);
        assertThat(result).isCloseTo(expected, within(0.01));
    }

    @Test
    public void whenManHeight160ThenWeight69() {
        short height = 160;
        double expected = 69.0;
        double result = Fit.manWeight(height);
        assertThat(result).isCloseTo(expected, within(0.01));
    }

    @Test
    public void whenWomanHeight170ThenWeight69() {
        short height = 170;
        double expected = 69.0;
        double result = Fit.womanWeight(height);
        assertThat(result).isCloseTo(expected, within(0.01));
    }

    @Test
    public void whenWomanHeight160ThenWeight57Dot5() {
        short height = 160;
        double expected = 57.5;
        double result = Fit.womanWeight(height);
        assertThat(result).isCloseTo(expected, within(0.01));
    }
}