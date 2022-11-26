package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public int calculateSum(int[] month) {
        int sum = 0;
        for (int sale : month) {
            sum += sale;
        }
        return sum;
    }


    public int calculateAverage(int[] month) {
        int average = calculateSum(month) / 12;
        return average;
    }

    public int calculateMax(int[] month) {
        int maxMonth = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[maxMonth] <= month[i]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int calculateMin(int[] month) {
        int minMonth = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[minMonth] >= month[i]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calculateMore(int[] month) {
        int moreThanAverage = 0;
        for (int i = 0; i < month.length; i++) {
            int average = calculateSum(month) / 12;
            if (month[i] > average) {
                moreThanAverage++;
            }
        }
        return moreThanAverage;
    }

    public int calculateBelow(int[] month) {
        int belowAverage = 0;
        for (int i = 0; i < month.length; i++) {
            int average = calculateSum(month) / 12;
            if (month[i] < average) {
                belowAverage++;
            }
        }
        return belowAverage;
    }
}




