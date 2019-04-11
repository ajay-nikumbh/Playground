import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code her
      int number, first_digit, last_digit;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();	
		
		first_digit = number;
		while(first_digit >= 10)
		{
			first_digit = first_digit / 10;
		}	
		
		last_digit = number % 10;
      int c=first_digit+last_digit;
		System.out.println(c);
	}
}