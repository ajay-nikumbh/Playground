import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      
      Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  System.out.println(square(num));
	}	
public static int square(int num) 
{
return num * num;
}

} 
