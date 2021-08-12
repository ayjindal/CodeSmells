package com.directi.training.codesmells.longmethod;

import java.util.ArrayList;
import java.util.List;

public class RFoo {

	private String _name = "Bar";
	private List<Order> _orders = new ArrayList<>();

	public void printOwing() {
		printBanner();
		printDetails(getOutstanding());
	}

	private double getOutstanding() {
		return _orders.stream().mapToDouble(o -> o.getAmount()).sum();
	}

	private void printDetails(double outstanding) {
		System.out.println("Name: " + _name);
		System.out.println("Amount: " + outstanding);
	}

	private void printBanner() {
		System.out.println("***************************");
		System.out.println("****** Customer Owes ******");
		System.out.println("***************************");
	}

}
