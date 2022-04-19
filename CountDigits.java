//counting the number of digits in the given number
import java.util.Scanner;
//class 
class CountDigits
  //declaring the main method here
{
  public static void main(String[] args)
  {
    //intilizing the input variables
    int count=0, n;
    //Scanner class to read the input from user
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number:");
    //for counting the digits in a number, we  have to use divison and modulus
    n=sc.nextInt();
    while(n!=0)
      {
        n=n/10; 
        count++;
        // count will give us how many times does the number is divisible by the 10
      }
    System.out.println(count);
  }
}