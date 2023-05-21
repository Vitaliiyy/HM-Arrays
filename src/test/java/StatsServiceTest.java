import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test

    public void monthOfMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinNumber = 9;
        int actualMInNumber = service.minSales(sales);

        Assertions.assertEquals(expectedMinNumber, actualMInNumber);

    }


    @Test

    public void monthOfMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxNumber = 8;
        int actualMaxNumber = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxNumber, actualMaxNumber);

    }

    @Test

    public void summAllMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxNumber = 180;
        int actualMaxNumber = service.summAllMonth(sales);

        Assertions.assertEquals(expectedMaxNumber, actualMaxNumber);

    }

    @Test

    public void avgSumm() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxNumber = 15;
        int actualMaxNumber = service.avgSumm(sales);

        Assertions.assertEquals(expectedMaxNumber, actualMaxNumber);

    }

    @Test

    public void lowerAvgMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxNumber = 7;
        int actualMaxNumber = service.lowerAvgMonth(sales);

        Assertions.assertEquals(expectedMaxNumber, actualMaxNumber);

    }


    @Test

    public void upperAvgMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxNumber = 7;
        int actualMaxNumber = service.upperAvgMonth(sales);

        Assertions.assertEquals(expectedMaxNumber, actualMaxNumber);

    }
}
