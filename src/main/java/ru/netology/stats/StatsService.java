package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;

    }

    public long averageSales(long[] sales) {

        long sum = this.sumSales(sales);
        long average = sum / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long numberMonthLessAverage(long[] sales) {
        long average = this.averageSales(sales);
        long number = 0;
        for (long sale : sales) {
            if (sale < average) {
                number++;
            }
        }
        return number;
    }

    public long numberMonthMoreAverage(long[] sales) {
        long average = this.averageSales(sales);
        long number = 0;
        for (long sale : sales) {
            if (sale > average) {
                number++;
            }
        }
        return number;
    }

}
