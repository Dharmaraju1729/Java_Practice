//print all the even numbers using while loop
import java.util.Scanner;
//class
public class ShowEven
  {
    //main method
    public static void main(String[] args)
    {
      //use scanner class
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the n value");
     
      int n,i=1,sum=0;
      n=sc.nextInt();
      while(i<=n)
        {
          if(i%2==0)
          System.out.println(i);
          i++;
         
        }
     
      }
  }