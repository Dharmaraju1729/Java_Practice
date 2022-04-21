//printing the count of negative in a array
import java.util.Scanner;
//class
class CountNegativeNumarray
  {
    //main method
    public static void main(String[] args)
    {
          int i;
          int count=0;
          int a[]=new int[5];
          // using the scanner class 
          System.out.println("enter element");
          Scanner sc=new Scanner(System.in);
         for( i =0;i<5;i++)
             {
               a[i]=sc.nextInt();
              }
              System.out.println("count of  negavtive element are");
         for( i =0;i<5;i++)
                {
                     if(a[i]<0)
                     {
                        count++;
                        System.out.println(count);
                       }
                  }
    }
  }