package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] month = new int[]{12, 30, 30, 9, 6, 7, 8, 12, 6, 30, 11, 22};
        int sum = service.calculateSum(month);
        int average = service.calculateAverage(month);
        int maxMonth = service.calculateMax(month);
        int minMonth = service.calculateMin(month);
        int moreThanAverage = service.calculateMore(month);
        int belowAverage = service.calculateBelow(month);


        System.out.println("Сумма всех продаж  " + sum);
        System.out.println("Средняя сумма продаж за год  " + average);
        System.out.println("Месяц максимальных продаж  " + maxMonth);
        System.out.println("Месяц минимальных продаж  " + minMonth);
        System.out.println("Кол-во месяцев с продажами выше среднего  " + moreThanAverage);
        System.out.println("Кол-во месяцев с продажами ниже среднего  " + belowAverage);
    }
}

