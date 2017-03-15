import java.util.Scanner;

public class Name 
{
	public static void main(String args[]) 
	{
		int x = 0;
		
		while(x!=1 && x!=2)
		{
			Scanner input = new Scanner(System.in);
			x = input.nextInt();
		}
		
		if(x==1)
			System.out.println("My name is Lee SangSeung");
		
		else if(x==2)
			System.out.println("My major is Computer Science Engineering");
	}
}