//Sum of First N Natural numbers
import java.util.*;
class sum1
{
	public static void main(String args[])
	{
		System.out.print("Enter a Positive value:");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int s=0;
		for (int i=0;i<=a;i=i+1)
		{
			s=s+i;
		}
		System.out.println("Sum of First N Natural numbers="+s);
	}
}