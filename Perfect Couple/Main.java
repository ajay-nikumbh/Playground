import java.util.*;
public class Main
{
    static void findThePairs(int inputArray[], int inputNumber)
    {
        
        for (int i = 0; i < inputArray.length; i++)
        {
            for (int j = i+1; j < inputArray.length; j++)
            {
                if(inputArray[i]+inputArray[j] == inputNumber)
                {
                    System.out.println(inputArray[i]+", "+inputArray[j]);
                }
            }
        }
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int value=sc.nextInt();
        findThePairs(a, value);
     }
}
