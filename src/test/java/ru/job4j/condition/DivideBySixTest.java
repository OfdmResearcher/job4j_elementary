package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DivideBySixTest {

    @Test
    public void whenNumberDivideBy6() {
        int number = 18;
        String result = DivideBySix.checkNumber(number);
        String expected = "The number divides by 6.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberDivideBy3AndNotEven() {
        int number = 15;
        String result = DivideBySix.checkNumber(number);
        String expected = "The number divides by 3, but it isn't the even number.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberEvenAndNotDivideBy3() {
        int number = 14;
        String result = DivideBySix.checkNumber(number);
        String expected = "The number doesn't divide by 3, but it is the even number.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberNotDivideBy3AndNotEven() {
        int number = 13;
        String result = DivideBySix.checkNumber(number);
        String expected = "The number doesn't divide by 3 and it isn't the even number.";
        assertThat(result).isEqualTo(expected);
    }

}