package com.pluralsight;

public class StringFormating {
    static void main() {
        //print to the screen usig System.out.print()
        //printout the text but doesnt ass a CR/LF (doesnt hit the enter key)
        //System.out.print("Caleb");
      //  System.out.print("Shufford");


        //print to the screen using System.out.println()
        //System.out.println();




        //formatting strings with System.out.printf()
        String firstName = "eric";
        double crazyDecimal = 123.4567;

        System.out.printf("Hi! my name is %s and my favorite decimal is %.2f. I really like the number %d as well ", firstName, crazyDecimal, 27);



    }
}