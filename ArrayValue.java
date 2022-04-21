//displaying the array valuesd
import java.util.Scanner;
//class
class ArrayValue
  {
    //main method
    public static void main(String[] args)
    {
      int a[] =new int[5];
      Scanner sc =new Scanner(System.in);
      System.out.println("enter the values:");
      //read and store
      for(int i=0; i<5;i++)
    
        
          {
          a[i]=sc.nextInt();
            }
           //printing
         for(int i=0; i<5;i++)
         {
           System.out.println(a[i]);
           }     
    }
  }