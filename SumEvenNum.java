//printing sum of even numbers
import java.util.Scanner;
//class
class SumEvenNum
  {
    public static void main(String[] args)
    {
      int i;
      int sum=0;
      int a[]=new int[5];
      // using the scanner class 
      System.out.println("enter element");
      Scanner sc=new Scanner(System.in);
       for( i =0;i<5;i++)
             {
               a[i]=sc.nextInt();
              }
                  System.out.println(" sum of even element are");
                 for( i =0;i<5;i++)
                {
                     if(a[i]%2==0)
                     {
                        sum=sum+a[i];
                        
                       }
                  }
                  System.out.println(sum);
      }
   }