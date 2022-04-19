//Print all odd number using while loop
import java.util.Scanner;
//class
class OddNum
  {
    //main method
    public static void main(String[] args)
    {
      //scanner class10
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the n value");
     
      int n,i=1,sum=0;
      n=sc.nextInt();
      while(i<=n)
        {
          if(i%2!=0)
          System.out.println(i);
          i++;
         
        }
     
      }
  }