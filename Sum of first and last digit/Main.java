import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
		

		int number = sc.nextInt();	
		int last_digit;
		int first_digit = number;
		while(first_digit >= 10)
		{
			first_digit = first_digit / 10;
		}	
		
		last_digit = number % 10;
		int c=first_digit+last_digit;
		System.out.println(c);
		
	}
}