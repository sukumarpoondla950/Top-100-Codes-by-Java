import java.util.*;
class positive
{
	public static void main(String args[])
	{	
		System.out.print("Enter a Number:");
		Scanner obj=new Scanner(System.in);
		int a= obj.nextInt();
		if(a>0)
		{
			System.out.println(a+" is positive number");
		}
		else if(a<0)
		{	
			System.out.println(a+" tis negative number");
		}
		else
		{
			System.out.println(a+" value is zero");
		}
			
		
	}
}