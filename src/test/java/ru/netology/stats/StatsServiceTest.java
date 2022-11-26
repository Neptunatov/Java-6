package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void calculatingTheAmount() {
        int[] month = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        StatsService service = new StatsService();
        int expected = 12;
        int sum = service.calculateSum(month);

        assertEquals(expected, sum); //sum
    }

    @Test
    void calculatingTheAverage() {
        int[] month = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        StatsService service = new StatsService();
        int expected = 1;
        int average = service.calculateAverage(month);

        assertEquals(expected, average); //Average
    }

    @Test
    void calculatingTheMaxSalesMonth() {
        int[] month = new int[]{1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1};
        StatsService service = new StatsService();
        int expected = 4;
        int maxMonth = service.calculateMax(month);

        assertEquals(expected, maxMonth); //maxSales
    }

    @Test
    void calculatingTheMinSalesMonth() {
        int[] month = new int[]{2, 2, 2, 2, 1, 1, 1, 2, 1, 1, 1, 2};
        StatsService service = new StatsService();
        int expected = 11;
        int minMonth = service.calculateMin(month);

        assertEquals(expected, minMonth); //minSales
    }

    @Test
    void calculatingMoreAverage() {
        int[] month = new int[]{3, 3, 3, 3, 1, 1, 1, 1, 2, 2, 2, 2};
        StatsService service = new StatsService();
        int expected = 4;
        int moreThanAverage = service.calculateMore(month);

        assertEquals(expected, moreThanAverage); //more
    }

    @Test
    void calculatingBelowAverage() {
        int[] month = new int[]{3, 3, 3, 3, 1, 1, 1, 1, 2, 2, 2, 2};
        StatsService service = new StatsService();
        int expected = 4;
        int belowAverage = service.calculateBelow(month);

        assertEquals(expected, belowAverage); //below
    }
}
