package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
    public int[] calculate(int[] month) {
        int[] set = new int[6];
        int sum = Arrays.stream(month).sum();
        int average = Arrays.stream(month).sum() / 12;

        int maxMonth = 0;
        int minMonth = 0;

        for (int i = 0; i < month.length; i++) {
            if (month[maxMonth] <= month[i]) {
                maxMonth = i;
            }
            if (month[minMonth] >= month[i]) {
                minMonth = i;
            }
        }
        int moreThanAverage = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[i] > average) {
                moreThanAverage++;
            }
        }
        int belowAverage = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[i] < average) {
                belowAverage++;
            }
        }

        set[0] = sum;
        set[1] = average;
        set[2] = maxMonth + 1;
        set[3] = minMonth + 1;
        set[4] = moreThanAverage;
        set[5] = belowAverage;
        return set;
    }
}