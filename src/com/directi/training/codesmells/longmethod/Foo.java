package com.directi.training.codesmells.longmethod;

import java.util.ArrayList;
import java.util.List;

public class Foo
{
    private String _name = "bar";
    private List<Order> _orders = new ArrayList<>();

    public void printOwing()
    {
        double outStanding = 0.0;

        // Print Banner
        System.out.println("***************************");
        System.out.println("****** Customer Owes ******");
        System.out.println("***************************");

        // Calculate outstanding
        for (Order order : _orders) {
            outStanding += order.getAmount();
        }

        // Print Details
        System.out.println("Name: " + _name);
        System.out.println("Amount: " + outStanding);
    }

}