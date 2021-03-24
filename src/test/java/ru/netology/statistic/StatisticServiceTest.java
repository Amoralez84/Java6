package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    void calculateSum() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void averageAmount() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageAmount(sales);
        assertEquals(expected, actual);
    }

    @Test
    void maxMonthSale() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxMonthSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    void minMonthSale() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minMonthSale(sales);
        assertEquals(expected, actual);
    }

    @Test
   void amountMonthSaleDownAverage() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.amountMonthSaleDownAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
   void amountMonthSaleUpAverage() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.amountMonthSaleUpAverage(sales);
        assertEquals(expected, actual);
    }
}