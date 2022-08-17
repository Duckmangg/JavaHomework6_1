import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long sumSales = service.sumSales(sales);
        System.out.println(sumSales);

        long average = service.averageSales(sales);
        System.out.println(average);

        long max = service.maxSales(sales);
        System.out.println(max);

        long min = service.minSales(sales);
        System.out.println(min);

        long less = service.numberMonthLessAverage(sales);
        System.out.println(less);

        long more = service.numberMonthMoreAverage(sales);
        System.out.println(more);
    }
}
