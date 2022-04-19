//finding first and last digit of the number 
import java.util.Scanner;
//class
class FirstLastDigit
{
  //main method
  public static void main(String[] args)
  {
    System.out.println("enter the digit:");
    //associating the Scanner class
    Scanner sc =new Scanner(System.in);
    //declaring and initilizing the variable
    int n=sc.nextInt();
    int lastDigit = n%10;
    int firstDigit = 0;
    while(n!=0)
      {
        firstDigit = n%10;
        n/=10;
      }
    System.out.println( "first digit:");
        System.out.println( firstDigit);
    System.out.println( "last digit:");
    System.out.println( lastDigit);
  }
}