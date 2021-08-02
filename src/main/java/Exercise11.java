/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Umran Jameel
 */

import java.util.*;

public class Exercise11 {
    public static void main(String[] args)
    {
        Dictionary<String, Double> rates = new Hashtable<>();
        Dictionary<String, String> currencies = new Hashtable<>();
        currencies.put("europe", "euros");
        currencies.put("england", "pounds");
        currencies.put("mexico", "pesos");
        currencies.put("canada", "Canadian Dollars");
        rates.put("euros", 1.19);
        rates.put("pounds", 1.39);
        rates.put("pesos", 0.050);
        rates.put("Canadian Dollars", 0.80);

        Scanner in = new Scanner(System.in);

        System.out.print("Which country (Europe, England, Mexico, Canada)? ");
        String country = in.nextLine().toLowerCase();
        String currency = currencies.get(country);
        double rate = rates.get(currency);

        System.out.print("How many " + currency + " are you exchanging: ");
        String amount = in.nextLine();
        double quantity = Double.parseDouble(amount);


        System.out.printf("%.2f %s at an exchange rate of %f is\n%.2f U.S. Dollars.", quantity, currency, rate, quantity * rate);

    }
}
