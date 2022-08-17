import org.junit.jupiter.api.Assertions;
import ru.netology.stats.StatsService;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    @Test
    public void totalSalesOfAllMonthsTest() {
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long sum = service.sumSales(sales);
        Assertions.assertEquals(180, sum);
    }

    @Test
    public void averageSaleValueTest() {
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long average = service.averageSales(sales);
        Assertions.assertEquals(15, average);
    }

    @Test
    public void maxValueSaleTest() {
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long max = service.maxSales(sales);
        Assertions.assertEquals(8, max);
    }

    @Test
    public void minValueSaleTest() {
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long min = service.minSales(sales);
        Assertions.assertEquals(9, min);
    }

    @Test
    public void numberMonthLessAverageTest() {
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long less = service.numberMonthLessAverage(sales);
        Assertions.assertEquals(5, less);
    }

    @Test
    public void numberMonthMoreAverageTest() {
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long more = service.numberMonthMoreAverage(sales);
        Assertions.assertEquals(5, more);
    }
}