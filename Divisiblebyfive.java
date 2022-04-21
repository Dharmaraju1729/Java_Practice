//printing the number of values divisible by 5 from a array
import java.util.Scanner;
//class
class Divisiblebyfive
  {
    public static void main(String[] args)
    {
      int i;
      int a[]=new int[5];
      // using the scanner class 
      System.out.println("enter element");
      Scanner sc=new Scanner(System.in);
       for( i =0;i<5;i++)
             {
               a[i]=sc.nextInt();
              }
                  System.out.println(" numbers divisible by 5 are:");
                 for( i =0;i<5;i++)
                {
                     if(a[i]%5==0)
                     {
                       System.out.println(a[i]);
                       }
                  }
    }
  }