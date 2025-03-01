package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    // Тест для 100% покрытия кода тестами
    // Дополнительный тест по нахождению максимального значения, если первый элемент не является самым большим
    @Test
    void findMaxIfFirstDigitNotMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {8, 5, 8, 4, 5, 3, 8, 6, 15, 11, 12};
        long expected = 15;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}