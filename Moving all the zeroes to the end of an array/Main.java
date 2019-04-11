









import java.util.Scanner;
class Main{
    
       // Type your code here
      static void moveZeroElementToEnd(int[] arr)
	 {  
		 // declare and initialize.
		 int size = arr.length;  
	     int count = 0;  
	  
	     // access all array elements.
	     for (int i = 0; i < size; i++)
	     {  
	    	 if (arr[i] != 0)
	    	 {  
	             arr[count++] = arr[i];  
	         }  
	     }  
	  
	     while (count < size)  
	     arr[count++] = 0;  
	 }  
	  
	 public static void main(String[] args) 
	 {  
		 // take default elements in array.
       	Scanner sc=new Scanner(System.in);
       	int n=sc.nextInt();
	     int[] arr =new int[n];  
       	for(int i=0;i<n;i++)
          arr[i]=sc.nextInt();
	     moveZeroElementToEnd(arr);   
	
	  
	     for (int i = 0, size = arr.length; i < size; i++)  
	     System.out.print(arr[i]+" " );  
    }
}