package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] month = new int[]{12, 30, 30, 9, 6, 7, 8, 12, 6, 30, 11, 22};
        int[] set = service.calculate(month);

        System.out.println("Сумма всех продаж  " + set[0]);
        System.out.println("Средняя сумма продаж за год  " + set[1]);
        System.out.println("Месяц максимальных продаж  " + set[2]);
        System.out.println("Месяц минимальных продаж  " + set[3]);
        System.out.println("Кол-во месяцев с продажами выше среднего  " + set[4]);
        System.out.println("Кол-во месяцев с продажами ниже среднего  " + set[5]);
    }
}

