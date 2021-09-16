package com.retail.sales.service;

import org.springframework.stereotype.Service;

@Service
public class RetailsService {

	/*
	* Assumption
	* Case 1: User :Employee/affiliate/old_customer
      Case 2: Grocery_Type = nongrocery/grocery
	* */

    double netpayable = 0d;

    public double getNetPayableAmount(String user, double amount, String grocery_Type) {
// case 1
        if (user != null) {
            if (user.equalsIgnoreCase("employee") &&
                    grocery_Type.equalsIgnoreCase("non_grocery")) {

                amount = amount * 30 / 100;

            } else if (user.equalsIgnoreCase("affiliate") &&
                    grocery_Type.equalsIgnoreCase("non_grocery")) {
                amount = amount * 10 / 100;
            } else if (user.equalsIgnoreCase("old_customer") &&
                    grocery_Type.equalsIgnoreCase("non_grocery")) {
                amount = amount * 5 / 100;
            }
        }
        int amnt = (int) (amount / 100);
        amnt = amnt * 5;
        amount = amount - amnt;
        return amount;
    }

}
