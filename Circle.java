//JFM1T3_Assignment1: 
/* Write a program to calculate the circumference of a circle and print the result in whole number. 
  Allow user to input the cirlce radius from terminal. 

  Sample Input:
    radius of the circle=6

  Expected Output:
   Circumference of the circle=38
   

*/ 

//import statement for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Circle
  {
    public static void main(String[] args)
    {
int r;
  float circumference,pi=3.14f;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter radius as a positive number:");
      r=sc.nextInt();
      circumference = 2*pi*r;
      int circle=(int)circumference;
       System.out.println("the circumference of the circle is:"+circle);
        }
} 