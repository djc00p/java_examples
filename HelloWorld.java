/** A program to display the message
* "Hello World!" on standard output.
* String Manipulation including built in methods
*/

public class HelloWorld {

 public static void main(String[] args) {
   System.out.println("\"Hello World!!\"" + "\nThe number of characters in " + "the string \"Hello World!!\" is " + "Hello World!!".length());

   /* "Hello World!!"
      The number of characters in the string "Hello World!!" is 13

      ^output

      The above code is the simple way to concatinate all outputs below */

   // System.out.println("\"Hello World!!\"");
   // System.out.print("The number of characters in ");
   // System.out.print("the string \"Hello World!!\" is ");
   // System.out.println( "Hello World!!".length() );
  }


}  // end of class HelloWorld

/* String Manipulation */

// "Hello World!!" = Hello World!!

// "\"Hello World!!\"" = "Hello World!!"

// "\\\"Hello World!!\"\\" = \"Hello World!!"\

// "\t\"Hello World!!\"" = tabbed	"Hello World!!"

// "\n\"Hello World!!\"" = new line	"Hello World!!"

// "hello".equals("hello") = true but "hello".equals("Hello") = false

// "hello".equalsIgnoreCase("Hello") = true; ignores case sensitivity "truthy"

/* "hello".charAt(0) = "h"; An error occurs if the value of the parameter is
less than zero or is greater than or equal to "hello".length(). Use
"hello".charAt("hello".length() - 1) to get last character which returns "o" */

// "Hello World!!".length() = 13

// "Hello World!!".substring(0,5) return within index range = Hello

/* "hello".indexOf('hello') returns an integer. If 'hello' occurs as a
substring of "hello", then the returned value is the starting position of that
substring. Otherwise, the returned value is -1. You can also use
"hello".indexOf(ch) to search for a char, ch, in "hello". To find the first
occurrence of x at or after position N, you can use "hello".indexOf(x,N). To
find the last occurance of x in "hello", use "hello".lastIndexOf(x). */

// "hello".toUpperCase() = "HELLO"

// "HELLO".toLowerCase() = "hello"

// "hello world   ".trim() = "hello world" removes excess white space
