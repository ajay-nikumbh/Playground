import java.util.Scanner;
class Main
{
  static int largestNumber(int a,int b, int c)
	{
		int largest=0;
		if(a>b && a>c)
			largest=a;
		else if(b>a && b>c)
			largest=b;
		else
			largest=c;
		return largest;
	}

	public static void main (String[] args){

	int a,b,c;
	Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();


	System.out.println(largestNumber(a,b,c));
	
	}
}