package com.directi.training.codesmells_refactored.longmethod;

import com.directi.training.codesmells.longmethod.Order;

import java.util.ArrayList;
import java.util.List;

public class Foo
{
    private String _name = "bar";
    private List<Order> _orders = new ArrayList<>();

    public void printOwing()
    {
        printBanner();
        printDetails(getOutstanding());
    }

    private double getOutstanding()
    {
        double outStanding = 0.0;
        for (Order order : _orders) {
            outStanding += order.getAmount();
        }
        return outStanding;
    }

    private void printDetails(double outstanding)
    {
        System.out.println("Name: " + _name);
        System.out.println("Amount: " + outstanding);
    }

    private void printBanner()
    {
        System.out.println("***************************");
        System.out.println("****** Customer Owes ******");
        System.out.println("***************************");
    }
}