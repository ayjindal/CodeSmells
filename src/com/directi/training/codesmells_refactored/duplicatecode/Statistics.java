package com.directi.training.codesmells_refactored.duplicatecode;

public class Statistics
{
    public double calculateDifferenceOfAverage(double[] array1, double[] array2)
    {
        double average1 = getAverage(array1);
        double average2 = getAverage(array2);
        return Math.abs(average1 - average2);
    }

    private double getAverage(double[] array)
    {
        double sum1 = 0;
        double average1;
        for (double element : array) {
            sum1 += element;
        }
        average1 = sum1 / array.length;
        return average1;
    }

    public double calculateSampleVariance(double[] elements)
    {
        double average1 = getAverage(elements);
        double temp = 0.0;
        for (double element : elements) {
            temp += Math.pow(element - average1, 2);
        }
        return temp / (elements.length - 1);
    }

}