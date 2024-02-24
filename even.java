// Even or odd
import java.util.*;
class even
{
	public static void main(String args[])
	{
		System.out.print("Enter a Number=");
		Scanner obj= new Scanner(System.in);
		int a = obj.nextInt();
		if(a%2==0)
			System.out.println(a+" is Even number");
		else
			System.out.println(a+" is odd number");
		
	}
}