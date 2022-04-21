//checking whether the given number is a perfect number or not
import java.util.Scanner;
//class
class PerfectNum
  {
    public static void main(String[] args)
    {   
       System.out.println("enter n value:");
      // declaring the scanner class
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum =0;
      for(int i=1;i<n;i++)
        { 
          //checking the factors for a n
          if(n%i==0)
          {   
             //ading the factors of a n
            sum = sum+i;
          }
        } 
          //sum of a factors equal to n then it is a perfect number
      if(sum==n)
      { 
        System.out.println("the given number is a perfect number");
      }
      else{
        System.out.println("the given number is not a perfect number:");
      }
      }
  }