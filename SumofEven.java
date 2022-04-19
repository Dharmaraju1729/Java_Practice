//java program to print Sum of all even numbers between 1 to n
import java.util.Scanner;
//class 
class SumofEven
  {
    //declaring the main method
    public static void main(String[] args)
    {
      // use scanner class
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the n:");
      // declaring and initilizing the variables
      int n=sc.nextInt();
      int i=1;
      int sum=0;
      while(i<=n)
        {
          if(i%2==0)
            sum=sum+i;
          i++;
        }
      System.out.println(sum);
    }
  }
