package ex09;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Juan Nicora
 */

/*
Exercise 9 - Paint Calculator
Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.

Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.
Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints
Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.
 */

import java.util.Scanner;

public class Base {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Length: ");
        int l = in.nextInt();
        System.out.print("Enter Width: ");
        int w = in.nextInt();
        int f2 = l * w;
        int gallons = 0;

        if (f2 > 350) {
            gallons = f2 / 350;
            if ((f2 % 350) != 0) {
                gallons++;
            }
        }
        else if (f2 != 0) {
            gallons = 1;
        }

        System.out.println("You will need to purchase " + gallons + " gallons of paint to cover " + f2 + " square feet.");
    }
}
