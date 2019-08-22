/**
* A program that reads an integer that is typed in by the
* user and computes and prints the square of that integer.
* Also contains extra Scanner examples of possible user inputs
*/
import java.util.Scanner; // import Scanner class to take user input info

public class PrintSquare {

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    int userInput; // The number input by the user.
    int square; // The userInput, multiplied by itself.

    System.out.print("Please type a number: ");
    userInput = myObj.nextInt();
    square = userInput * userInput;
    System.out.println();
    System.out.println("The number that you entered was " + userInput);
    System.out.println("The square of that number is " + square);
    System.out.println();
  } // end of main()

} //end of class PrintSquare


// user input for a string = nextLine()
// user input for a boolean  = nextBoolean()
// user input for a byte = nextByte()
// user input for a double = nextDouble(); double is a large float
// user input for a float = nextFloat()
// user input for a integer = nextInt()
// user input for a long = nextLong(); large integer
// user input for a short = nextShort(); short integer
