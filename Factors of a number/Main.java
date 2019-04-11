import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int number = sc.nextInt();
      for(int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
	}
}