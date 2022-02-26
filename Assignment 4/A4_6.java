import java.util.Scanner;
import java.util.regex.*;

class InputMismatchException extends Throwable
{
	public String toString()
	{
		return "InputMismatchException";
	}
}

class A4_6
{
	static void validName(String name) throws InputMismatchException
	{
		String regex = "^[A-Za-z]\\w{2,29}\\s\\w{2,29}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);

		if(m.matches())
			return;
		else
			throw new InputMismatchException();
	}
	public static void main(String args[])
	{
		String name;Scanner kb = new Scanner(System.in);

		while(true)
		{
			try
			{
				System.out.print("\nEnter name: ");
				name = kb.nextLine();
				validName(name);
				System.out.println("Name is Valid");
				System.out.println("Name: "+name);
				break;
			}
			catch(InputMismatchException e)
			{
				System.out.println("\nException: "+e);
				System.out.println("NOT A VALID NAME");
			}
		}
	}
}