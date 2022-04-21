/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/
import java.util.Scanner;
  //class
   public class TwoDimentionalArray
       {     
           //define main method
          public static void main(String[] args)
           {  
                   //declare the variables
                    int i,j,row,col,post1=0,post2=0;
        //Take number of rows and columns from user in two-dimensional array
                    Scanner sc = new Scanner(System.in);
                     System.out.println("enter the row value");
                       row = sc.nextInt();
                    System.out.println("Enter the col value");
                     col=sc.nextInt();
                     int a[][] = new int[row][col];
//assume first element is largest and use for loop to compare the largest element with all the reamaining elements
   
                 for(i=0;i<row;i++)
                    {
                          for(j=0;j<col;j++)
                            {
                            System.out.print("element ["+(i+1)+"],["+(j+1)+"] :");
                              a[i][j]=sc.nextInt();
                                    }
                            }
                         System.out.println("the array is :" );
                         for(i=0;i<row;i++)
                             {
                                   for(j=0;j<col;j++)
                                      {
                                   System.out.print(a[i][j] + "  ");
                                     }
                                   System.out.println( );
                                   }
             //Calcualte the maximum element based on index poistion
                         int max=a[0][0];
                          for(i=0;i<row;i++)
                                {
                          for(j=0;j<col;j++)
                             {
                               if(a[i][j]>max)
                                  {
                                 max=a[i][j];
                                post1=i;
                       
                              post2=j;
                         }
           
                      }
     
                    }
                //Print result

                           System.out.println("the highest number in the matrix is "+max+" the position of the element is a["+(post1)+"],"+"["+(post2)+"]");
}
}