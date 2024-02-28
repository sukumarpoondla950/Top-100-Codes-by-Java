import java.util.*;
class swi
{
		public static void main(String args[])
		{
			Scanner obj= new Scanner(System.in);
			int a=obj.nextInt();
			int b=obj.nextInt();
			char c =obj.next().charAt(0);
			
			switch (c)
			{
				case '+': System.out.println(a+b);
					
				case '-': System.out.println(a-b);
					break;
				case '*': System.out.println(a*b);
					break;
				case '/': System.out.println(a/b);
					break;
				default:System.out.println("invaild");
					break;
			}
				
				
		}

}