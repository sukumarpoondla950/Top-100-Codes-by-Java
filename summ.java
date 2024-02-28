//
import java.util.*;
class summ
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		int b=x.nextInt();
		int s=0;
		for (int i=a;i<=b;i++)
		{	
			s=s+i;	
		}
		System.out.println(s);
	}
}