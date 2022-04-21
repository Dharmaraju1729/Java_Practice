//print the given number in a reverse manner
import java.util.Scanner;
//positive class
class Reverse
  {
    // declare the main method
    public static void main(String[] args)
    {
      //initilazing the scanner class 
      Scanner sc = new Scanner (System.in);
       System.out.println("given number is:");
      int n = sc.nextInt();
      int rev =0;
      while(n!=0)
        {
          int rem = n%10;
          rev = rev*10+rem;
          n=n/10;
        }
      System.out.println("reverse number is:");
      System.out.println(rev);
    }
  }
