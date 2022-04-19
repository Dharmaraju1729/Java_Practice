/*  JFM1T2_Assignment3:

     Print the results for the following statements considering x = true and y = false
             1. x&&y
             2. x||y
             3. !x
             4. !y
     Prompt the user input from the terminal.
             
     Sample Input:
     Enter x as boolean value(true/false): 
     true
     Enter y as boolean value(true/false): 
     false
     
     Expected Output:
     x&&y is: false
     x||y is: true
     !x is: false
     !y is: true

*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

class BooleanOperation 
{
public static void main(String[] args)
  {  
boolean a,b;

Scanner sc =new Scanner(System.in);
  System.out.println("enter a value(true/false)");
a=sc.nextBoolean();
System.out.println("enter b value(true/false)");
b=sc.nextBoolean();
System.out.println("a&&b is:"+(a&&b));
    System.out.println("a&&b is:"+(a&&b));
    System.out.println("!b is:"+(!b));
    System.out.println("!a is:"+(!a));
    }

}