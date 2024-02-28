/*4.	Write a java program that performs the following tasks.
a.	Store a number in a variable
b.	If value is not in range (100-1000) prints wrong number else follows the steps
c.	Check even or odd
d.	If even divide the number by 3 and print the remainder
e.	If odd divide the number by 2 and print the remainder. 
*/

import java.util.*;
class multi
{
	public static void main(String args[])
	{
		Scanner x= new Scanner(System.in);
		int a=x.nextInt();
		if( a<100 || a>1000)
		{
			System.out.println("Wrong");
		}
		else
		{
			if(a%2==0)
			{
				System.out.println("even");
				System.out.println(a%3);
				
			}
			else
			{
				System.out.println("odd");
				System.out.println(a%2);
				
			}
				
		}


		
	}
}
