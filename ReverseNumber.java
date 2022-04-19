//using while loop print all natural numbers in reverse 
import java.util.Scanner;
//class
class ReverseNumber
  {
  //main method
public static void main(String[] args)
  {
    int n,i;
    System.out.println("enter the n value");
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    i=n;
    while(i>=1){
      
    System.out.println(i);
        i--;
      }
  }
  }