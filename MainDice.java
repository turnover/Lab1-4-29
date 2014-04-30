import java.util.Scanner;

public class MainDice 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		RandomGenerator rand = new RandomGenerator();
		rand.Value();
		rand.Throw();
		
		int val1;
		
		System.out.println("Enter 1 to roll dice: ");
		val1 = input.nextInt();
		
		if(val1 == 1)
		{
			System.out.printf("You have rolled %d\n", rand.num2);
		}
		else
		{
			System.out.println("You did not enter 1.");
		}
	}

}
