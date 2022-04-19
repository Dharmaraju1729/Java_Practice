// checking whether the given number is a Palindrome or not
//importing scanner class
import java.util.Scanner;
//class
class Palindrome
{
  //main method
 public static void main(String[] args) 
  {
     //associating Scanner class
    Scanner sc=new Scanner(System.in);
    //declaring and initialzing the number
    int number = sc.nextInt();
    int temp = number;
    int sum = 0,rem;
   
    
    //while loop to check whether the number is a Palindrome or not
    while(number > 0)
      {
        rem = number%10;
        sum =(sum*10) + rem;
        number = number/10;
        }
    if(temp == sum)
    {
      System.out.println("the given number is a Palindrome: ");
    }
    else
    {
      System.out.println("the given number is  not a Palindrome:");
    }
    }
  }
