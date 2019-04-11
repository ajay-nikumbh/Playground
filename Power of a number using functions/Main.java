import java.util.*;
public class Main {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int base = sc.nextInt();
      	int powerRaised = sc.nextInt();
        int result = power(base, powerRaised);

        System.out.println(result);
    }

    public static int power(int base, int powerRaised) {
        if (powerRaised != 0)
            return (base * power(base, powerRaised - 1));
        else
            return 1;
    }
}