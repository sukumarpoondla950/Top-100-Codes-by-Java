//10.	Write a program to print all even numbers in range 700 to 900.
import java.util.*;
class even
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		int b=x.nextInt();
		for (int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}	
		}
	}
}
