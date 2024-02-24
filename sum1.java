//Sum of Natural numbers
import java.util.*;
class sum2
{
	public static void main(String args[])
	{
		System.out.print("Enter a Positive value:");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		
		System.out.println("Sum of Natural numbers="+((a*(a+1))/2));
	}
}