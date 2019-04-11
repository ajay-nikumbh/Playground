import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int x, y, z;
       Scanner in = new Scanner(System.in);
 
    x = in.nextInt();
    y = in.nextInt();
    z = in.nextInt();
 
    if (x > y && x > z)
      System.out.println(x);
    else if (y > x && y > z)
      System.out.println(y);
    else if (z > x && z > y)
      System.out.println(z);
    else
      System.out.println("The numbers are not distinct.");

    }
}