//using while loop print sum of all natural numbers between 1 to n
import java.util.Scanner;
//class
class SumofnNum
  // main method 
{
public static void main(String[] args)
  {
    //initalize the variables
    int sum=0,i,n;
    //scanner class
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the n value");
    n=sc.nextInt();
    i=1;
    while(i<=n)
      {
        sum=sum+i;
        i++;
      }
    System.out.println(sum);
    }
  }