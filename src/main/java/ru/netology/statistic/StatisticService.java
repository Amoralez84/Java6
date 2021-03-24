package ru.netology.statistic;

public class StatisticService<amountMonth> {

    public int calculateSum(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageAmount(int[] sales) {

        int sum = 0;
        int averageAmount = 0;
        for (int sale : sales) {
            sum += sale;
        }
        averageAmount = sum / sales.length;
        return averageAmount;
    }

    public int maxMonthSale(int[] sales) {
        int maxSales = sales[0];
        int i = 0;
        int maxMonthSale = 0;
        for (int sale : sales) {
            i++;
            if (maxSales <= sale) {
                maxSales = sale;
                maxMonthSale = i;
            }
        }
        return maxMonthSale;
    }

    public int minMonthSale(int[] sales) {
        int minSales = sales[0];
        int i = 0;
        int minMonthSale = 0;
        for (int sale : sales) {
            i++;
            if (minSales >= sale) {
                minSales = sale;
                minMonthSale = i;
            }
        }
        return minMonthSale;
    }

    public int amountMonthSaleDownAverage(int[] sales) {
        int average = averageAmount(sales);
        int amountMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                amountMonth++;
            }
        }
        return amountMonth;
    }

    public int amountMonthSaleUpAverage(int[] sales) {
        int average = averageAmount(sales);
        int amountMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                amountMonth++;
            }
        }
        return amountMonth;
    }
}