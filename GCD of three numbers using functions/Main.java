import java.util.*;

public class Main{
	public static int hcf(int a, int b) {
		if (b == 0)
			return a;
		else
			return hcf(b, a % b);
	}

	public static int hcf(int a, int b, int c) {

		return hcf(hcf(a, b), c);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		
		int num2 = input.nextInt();
		
		int num3 = input.nextInt();
		int hcfOfNumbers = Main.hcf(num1, num2, num3);
		System.out.println(hcfOfNumbers);
	}
}