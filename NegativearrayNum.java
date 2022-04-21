//printing the negative numbers in a array
import java.util.Scanner;
//class
class NegativearrayNum
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
                  System.out.println(" negative numbers are:");
                 for( i =0;i<5;i++)
                {
                     if(a[i]<0)
                     {
                      System.out.println(a[i]);
                        
                       }
                  }
                 
      }
   }