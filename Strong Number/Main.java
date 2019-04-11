import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int number, Temp, Reminder, Sum = 0, i, Factorial;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();		
		Temp = number;
		while(Temp>0)
		{
			Factorial = 1; 
			i = 1; 
		    Reminder = Temp % 10;
		    while (i <= Reminder)
		    {
		     	Factorial = Factorial * i;
		     	i++;
		    }
		    
		     Sum = Sum + Factorial;
		     Temp = Temp /10;
		}
		
		
		
		if ( number == Sum )
		{
			System.out.println("Yes");
		}
		else
		{
		   System.out.println("No");
		}
	}
}