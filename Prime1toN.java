//identifying the prime numbers between 1 to n
import java.util.Scanner;
//class
class Prime1toN
  {
    //main method
    public static void main(String[] args)
    {  
      //decalring the scanner class
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the range:");
      int n =sc.nextInt();
      int count =0;
      for(int i=1;i<n;i++)
        {
          count=0;
          for(int j=1;j<n;j++)
            {
              if(i%j==0)
              {
                count++;
              }
            }
          if(count==2)
          {
            System.out.println(i);
          }
        }
      
    }
  }