/**
* This class implements a simple program that will compute
* the amount of interest that is earned on an investment over
* a period of one year. The initial amount of the investment
* and the interest rate are input by the user. The value of
* the investment at the end of the year is output. The
* rate must be input as a decimal, not a percentage (for
* example, 0.05 rather than 5).
*/

import java.util.Scanner; // import Scanner class to take user input info

public class Interest2 {

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    double principal; // The value of the investment.
    double rate; // The annual interest rate.
    double interest; // The interest earned during the year.

    System.out.print("Enter the initial investment: ");
    principal = myObj.nextDouble(); // can be an integer or a float

    System.out.print("Enter the annual interest rate (as a decimal): ");
    rate = myObj.nextDouble(); // example .025

    interest = principal * rate; // Compute this year’s interest.
    principal = principal + interest; // Add it to principal.

    System.out.printf("The amount of interest is $%1.2f%n", interest);
    System.out.printf("The value after one year is $%1.2f%n", principal);
  } // end of main()

} // end of class Interest2

/* Interger Formaters in String */

/* Every format specifier begins with a percent sign (%) and ends
with a letter, possibly with some extra formatting information in between.
The letter specifies the type of output that is to be produced. */

//  "%d" = specifies that an integer is to be written
/*
    "%12d" = specifies the min num of spaces that should be used for the output.
    If the integer that is being output takes up fewer than 12 spaces, extra
    blank spaces are added in front of the integer to bring the total up to 12.
*/
//  "%10s" = "s" the value should be output in its default format 10 min numbers
//  "%1.2f" = formats for money 2 decimals or "%1.5f" 5 decimal places;
//  1 min num spaces so if "%12.3f" right-justify 12 with 3 decimal places
//  "%15.8e" = used for exponets format 8 determins how many to use after
//  decimal
//  "%1.8g" = same as "e" but 8 includes number before decimal
