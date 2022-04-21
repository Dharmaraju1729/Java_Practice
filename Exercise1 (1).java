//  Write a program to print the elements of an array present on even position
class Exercise1
  {
//main method
	public static void main(String args[])
    {
      //initilazing the array
      int a[]=new int[]{1,2,3,4,56,6,4,8};
      System.out.println("Elements of given array present on even position:");
      
       for (int i = 1; i < a.length; i = i+2) 
       {   
            System.out.println(a[i]);  
         }
   }
}