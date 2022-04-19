/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations 
{
public static void main(String[] args)
  {
    int a,b,c,d,e,f,g,h,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a and b");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("Difference of 2 number:"+(a-b));
     
    System.out.println("Enter c and d");
    c=sc.nextInt();
    d=sc.nextInt();
    System.out.println("Product of 2 numbers:"+(c*d));
  
    System.out.println("enter e and f");
      e=sc.nextInt();
    f=sc.nextInt();
    System.out.println("Divison of 2 numbers:"+(e/f));
  
    System.out.println("enter value of g");
    g=sc.nextInt();
    System.out.println("increment of g is:"+(++g));
    System.out.println("Decrement of g is:"+(--g));
  
    System.out.println("enter h and i");
    h=sc.nextInt();
    i=sc.nextInt();
    System.out.println("reminder of h and i:"+(h/i));
    
    
  }
}