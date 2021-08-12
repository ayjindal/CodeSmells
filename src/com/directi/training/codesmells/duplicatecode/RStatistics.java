package com.directi.training.codesmells.duplicatecode;

public class RStatistics {
	
	 private double getAverage(double[] array) {
	        double cont = 0;
	        for (double element : array) {
	            cont += element;
	        }
	        return cont / array.length;
	 }
	 
	 public double calculateSampleVariance(double[] elements) {
	        double average = getAverage(elements);
	        double count = 0.0;
	        for (double e : elements) {
	        	count += Math.pow(e - average, 2);
	        }
	        return count / (elements.length - 1);
	 }
	 
	 public double calculateDifferenceOfAverage(double[] array1, double[] array2) {
	        return Math.abs(getAverage(array1) - getAverage(array2));
	 }
	 
}





