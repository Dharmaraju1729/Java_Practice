/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a
   a b c b a
     a b a
       a
*/
 import java.util.Scanner;
 public class DiamondPattern
  {
//Add main method here
    public static void main(String[] args)
    {
//scanner class 
Scanner sc = new Scanner(System.in);
      //output statement to take input
      System.out.println("input the number:");
      //decarling the initalisizing variables
  int n= sc.nextInt();
  int count = 1;
  int count2 = 1;
  char c = 'a';    
//use for loop to print diamond pattern
        for (int i = 1; i < (n * 2); i++)
        {
          //for loop to print spaces
       for (int spc = n - count2; spc > 0; spc--)  
            {
              //printing space
                System.out.print("   ");
            }
            if (i < n)
            {
                count2++;
            }
            else
            {
                count2--;
            }
          //for loop to print values in pattern
            for (int j = 0; j < count; j++)
          {
            //print characters
                System.out.print(" "+c+" ");
            // if else condition to check j is less than count by 2
                if (j < count / 2)
                {
                    c++;
                } else
                {
                    c--;
                }
            }
            //if condition to check i is less than n
            if (i < n)
            {
                count = count + 2;
            }
            else
            {
                count = count - 2;
            }
            c = 'a';
            // printing characters in nextline
            System.out.println();
        }
    }
  }
