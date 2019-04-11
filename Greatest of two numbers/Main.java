import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int number1, number2;
		Scanner sc = new Scanner(System.in);
		number1 = sc.nextInt();	
		number2 = sc.nextInt();	
		
		if(number1 > number2) 
	    {
			System.out.println("num1 is the greatest number");          
	    } 
	    else if (number2 > number1)
	    { 
	    	System.out.println("num2 is the greatest number");        
	    } 
	    else 
	    {
	    	System.out.println("\n Both are Equal");
	    }	
	}
}