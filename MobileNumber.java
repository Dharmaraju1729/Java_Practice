//JFM1T3_Assignment4:
/*
1.Write a program to store your best friend's mobile number in a variable and print the last 4 digits. Consider the following sample for reference.
  Mobile number should accept only 10 digits. Not less than 10 digits or greater than 10 digits. 
  Allow user to input the phone number from the terminal

  Sample Input:
        mobileNum=9393927890

  Expected Output:
        Your friend's mobile number ends with ******7890

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

class MobileNumber 
{
public static void main(String[] args)
  {
    String mobileNumber;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter mobile number:");
    mobileNumber=sc.nextLine();
    if((mobileNumber).length()==10)
    {
      
       System.out.println("last fou digits of mobile number:"+mobileNumber.substring(6,10));
      }
    

else
      System.out.println("invalid mobile number:");

        }

}