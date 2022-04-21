// Complete and execute java Program for finding smallest/minimum element in a single dimensional array
class Sample1
  {
     public static void main(String args[]) 
     {
         //Initialize array  
        	int a[] = new int [] {25, 11, 7, 75, 56};  
         //Initialize min with first element of array.  
        	int min = a[0];  
          //Loop through the array  
          //for (//Intialization;Condition;Increment) { 
         for(int i=0;i<a.length;i++)
           {
         	//Compare elements of array with min  
           	//if(//Test Condition)  
               	//Write code to store in min if array element is less than it. 
             if(a[i]<min)
               min=a[i];
        }  
        System.out.println("Smallest element present in given array: " + min);  
   }
}
