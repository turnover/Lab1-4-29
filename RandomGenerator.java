
public class RandomGenerator 
{
	public int num1;
	public int num2;
	
	public int Throw()
	{
		num1 = 1 +(int) (Math.random()*6);
		return num1;
	}
	public int Value()
	{
		num2 = num1;
		return num2;
	}
	
}

