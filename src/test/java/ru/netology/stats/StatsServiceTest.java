package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void calculatingTheAmount() {
        int[] month = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        StatsService service = new StatsService();
        int expected = 12;
        int[] set = service.calculate(month);

        assertEquals(expected, set[0]); //sum
    }

    @Test
    void calculatingTheAverage() {
        int[] month = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        StatsService service = new StatsService();
        int expected = 1;
        int[] set = service.calculate(month);

        assertEquals(expected, set[1]); //Average
    }

    @Test
    void calculatingTheMaxSalesMonth() {
        int[] month = new int[]{1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1};
        StatsService service = new StatsService();
        int expected = 4;
        int[] set = service.calculate(month);

        assertEquals(expected, set[2]); //maxSales
    }

    @Test
    void calculatingTheMinSalesMonth() {
        int[] month = new int[]{2, 2, 2, 2, 1, 1, 1, 2, 1, 1, 1, 2};
        StatsService service = new StatsService();
        int expected = 11;
        int[] set = service.calculate(month);

        assertEquals(expected, set[3]); //minSales
    }

    @Test
    void calculatingMoreAverage() {
        int[] month = new int[]{3, 3, 3, 3, 1, 1, 1, 1, 2, 2, 2, 2};
        StatsService service = new StatsService();
        int expected = 4;
        int[] set = service.calculate(month);

        assertEquals(expected, set[4]); //more
    }

    @Test
    void calculatingBelowAverage() {
        int[] month = new int[]{3, 3, 3, 3, 1, 1, 1, 1, 2, 2, 2, 2};
        StatsService service = new StatsService();
        int expected = 4;
        int[] set = service.calculate(month);

        assertEquals(expected, set[5]); //below
    }
}
