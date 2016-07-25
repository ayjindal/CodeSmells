package com.directi.training.codesmells_refactored.duplicatecode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StatisticsTest
{
    @Test
    public void testCalculateDifferenceOfAverage()
    {
        Statistics statistics = new Statistics();
        double[] array1 = {1, 2, 3, 4, 5};
        double[] array2 = {11, 12, 13, 14, 15};
        double actualValue = statistics.calculateDifferenceOfAverage(array1, array2);
        assertThat(actualValue, is(10.0));
    }

    @Test
    public void testCalculateSampleVariance()
    {
        Statistics statistics = new Statistics();
        double[] elements = {1, 2, 3, 4, 5};
        double actualSampleVariance = statistics.calculateSampleVariance(elements);
        assertThat(actualSampleVariance, is(2.5));
    }
}
