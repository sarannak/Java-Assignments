import java.util.Scanner;
import java.lang.Math;

class a1_3
{
	public static boolean checkprime(int n)
	{
	    if(n==1)
	        return false;

		int c = 1 , sqrt = (int)Math.sqrt(n);
		for(int i=2;i<=sqrt;++i)
		{
			if(n%i==0)
				++c;
		}

		if(c==1)
			return true;
		else
			return false;
	}

	public static void printdash(int n)
	{
		System.out.print("\n");
		for(int i=0;i<n;++i)
		    System.out.print("-");
		return;
	}

	public static void main(String[] args)
    {
		int n = 0;

		System.out.printf("\n-------Check Prime-------\n");

		if(args.length>0)
		{
			String str="";
			printdash(15);

			System.out.printf("\n|   n   | Y/N |");
			for(String s : args)
			{
				n = Integer.parseInt(s);

				if(checkprime(n))
					str="yes";
				else
					str="no";

				printdash(15);
				System.out.printf("\n|%7d|%5s|",n,str);
			}
			printdash(15);

		}
		else
		{
			Scanner kb = new Scanner(System.in);

			System.out.print("Enter an integer: ");
			n = kb.nextInt();

			if(checkprime(n))
					System.out.printf("\n%d is prime\n",n);
				else
					System.out.printf("\n%d is not prime\n",n);
		}

		System.out.println();
		return;
	}
}