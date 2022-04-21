//identifying the factors of a number
import java.util.Scanner;
//class
class FactorofNum
  {
    //declaring the main method
    public static void main(String[] args)
    {
       //scanner class 
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the number");
      int n= sc.nextInt();
      int temp = n;
      int sum=0;
      for(int i=1;i<n;i++)
        {
          if(n%i==0)
          {
            System.out.println(i);
            
          }
        }
    }
  }