import java.util.Scanner;

class MathException extends Throwable
{
	private int value;

	MathException(int x)
	{
		value = x ;
	}

	int getValue()
	{
		return value;
	}

	public String toString()
	{
		return "MathException("+value+")";
	}
}

class OverFlowException extends MathException
{
	OverFlowException(int x)
	{
		super(x);
	}

	public String toString()
	{
		return "OverFlowException("+getValue()+")";
	}
}

class UnderFlowException extends MathException
{
	UnderFlowException(int x)
	{
		super(x);
	}

	public String toString()
	{
		return "UnderFlowException("+getValue()+")";
	}
}

class A4_4
{
	static void func() throws OverFlowException
	{
		try
		{
			System.out.println("throw new OverFlowException(0);");
			throw new OverFlowException(0);
		}
		catch(OverFlowException e)
		{
			System.out.println("\nRethrowing....");
			System.out.println("throw e;");
			throw e;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("\n-----First Part-----");

		try
		{
			func();
			throw new UnderFlowException(0);
		}
		catch(UnderFlowException e)
		{
			System.out.println("\nCaught Exception");
			System.out.println("Inside 2nd catch block");
		}
		catch(MathException e)
		{
			System.out.println("\nCaught Exception");
			System.out.println("Inside 3rd catch block");
		}

		System.out.println("\n-----Second Part-----");
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int x = kb.nextInt();

		try
		{
			if(x>100)
				throw new OverFlowException(x);
			else
				throw new UnderFlowException(x);
		}
		catch(OverFlowException e)
		{
			System.out.println("\nException: "+e);
		}
		catch(UnderFlowException e)
		{
			System.out.println("\nException: "+e);
		}
	}
}