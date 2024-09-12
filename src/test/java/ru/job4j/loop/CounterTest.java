package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void when0To4Then10() {
        int start = 0;
        int finish = 4;
        int result = Counter.sum(start, finish);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when3To3Then3() {
        int start = 3;
        int finish = 3;
        int result = Counter.sum(start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when4To2Then0() {
        int start = 4;
        int finish = 2;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

}