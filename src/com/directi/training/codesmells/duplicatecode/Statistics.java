package com.directi.training.codesmells.duplicatecode;

public class Statistics
{
    public double calculateDifferenceOfAverage(double[] array1, double[] array2)
    {
        double sum1 = 0;
        double average1;

        for (double element : array1) {
            sum1 += element;
        }
        average1 = sum1 / array1.length;

        double sum2 = 0;
        double average2;

        for (double element : array2) {
            sum2 += element;
        }
        average2 = sum2 / array2.length;

        return Math.abs(average1 - average2);
    }

    public double calculateSampleVariance(double[] elements)
    {
        double sum1 = 0;
        double average1;
        for (double element : elements) {
            sum1 += element;
        }
        average1 = sum1 / elements.length;
        double temp = 0.0;
        for (double element : elements) {
            temp += Math.pow(element - average1, 2);
        }
        return temp / (elements.length - 1);

    }
}