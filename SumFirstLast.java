//printing the sum of first and last digit of a number
import java.util.Scanner;
//class
class SumFirstLast
  {//main method
    public static void main(String[] args)
    {
      //associating the Scanner class
      Scanner sc =new Scanner(System.in);
      //decalring and initilazing the variables
      int n = sc.nextInt();
      int lastDigit = n % 10;
      int firstDigit = 0;
     //while loop for the first digit in a given number
      while(n!=0)
        {
          firstDigit =n%10;
          n=n/10;
        }
      firstDigit +=lastDigit;
      System.out.println(firstDigit);
    }
 
  }
