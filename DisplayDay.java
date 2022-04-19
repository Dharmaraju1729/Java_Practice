/*
  JFM1T4_Assignment2:
  Write a program to display the name of the day, based on the number, using the switch statement.
  Prompt the user to input a number between 1 and 7. 
  
  Sample Input: 1
  
  Expected Output: Monday
  
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;
class DisplayDay
  {
    public static void main(String[] args)
    {
//declare number variable  
      int day;
//Use the scanner class to provide input at execution time using scanner object
//Scanner s= new Scanner(System.in);
Scanner sc =new Scanner(System.in);

/*
Take input of the number for displaying day
System.out.println("Enter value for displaying day:");
number=sc.nextInt();
*/
System.out.println("Sample Input from 1 to 7:");
    day = sc.nextInt();  

//Declare switch case and check the input value to print the day entered by the user
     
 switch(day)
      {
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
        case 6:
          System.out.println("saturday");
        case 7:
          System.out.println("Sunday");
        default:
          System.out.println("Invaild Input");
          break;
    }
 }
}