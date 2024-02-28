/*5.	Declare & initialize a number. Check whether the number is in range 0-100 or not. 
If not in range print invalid input. Else – if the number is in range 90-100 then print Super Smart,
 80-90 print Smart,70-80 print smart enough, 60-70 print just smart, 35-60 print no smart, 0-35 print dump.
*/
import java.util.*;
class d
{
	public static void main(String args[])
	{
		System.out.println("Give a number between 1 to 100:");
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		if(a<0 || a>100)
		{
			System.out.println("Invalid input");
		}
		else if(a>=90 &&a<=100)
		{
			System.out.println("Super Smart");
		}
		else if(a>=80 && a<=90)
		{
		
			System.out.println("Smart");
		}
		else if(a>=70 && a<=80)
		{
			System.out.println("Smart Enough");
		}		
		else if(a>=60 && a<=70)
		{
			System.out.println("Jusy Smart");
		}
		else if(a>=35 && a<=60)
		{
			System.out.println("no smart");
		}
		else
		{
			System.out.println("Dump");
		}
		
	}
}