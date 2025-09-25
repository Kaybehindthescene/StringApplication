package com.pluralsight;

public class Reciept {

    static void main() {
        //create variables for an item name and item price
        String itemName = "Controllers";
        double itemPrice = 70.00;

        //create a quantity variable
        int quantity = 3;

        // print out a sentence describing what we brought, how many, and the price
        System.out.println("You bought " + quantity + " " + itemName + " for $" + itemPrice * quantity);
    }

}
