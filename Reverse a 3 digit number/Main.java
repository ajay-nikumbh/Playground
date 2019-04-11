import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc=new Scanner(System.in);
    int num = sc.nextInt();
    int reversed = 0;

        for(;num != 0; num /= 10)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println( reversed);
  }
}