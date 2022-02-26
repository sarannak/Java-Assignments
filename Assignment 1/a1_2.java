import java.util.Scanner;
import java.lang.Math;

class a1_2
{
	public static void printdash(int n)
	{
		System.out.print("\n");
		for(int i=0;i<n;++i)
		    System.out.print("-");
		return;
	}
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.printf("\n--------Fibonacci with Golden Ratio--------\n");
		System.out.printf("\nEnter an integer: ");
		int n = kb.nextInt();

		int a[] = new int[n+2];
		a[0] = 0;a[1] = 1;
		float f = 0;String str = "";

        printdash(48);
		System.out.printf("\n| n | F(n+1)/F(n)  | Value | Value-1.618 | Y/N |");
		for(int i=1; i<n+1; ++i)
		{
			a[i+1] = a[i] + a[i-1];
			f = (float)a[i+1]/a[i];

			if(Math.abs(f-1.618) < .001)
				str = "yes";
			else
				str = "no";

			printdash(48);
			System.out.printf("\n|%3d|%7d/%-6d|%3.5f|%13.5f|%5s|",i,a[i+1],a[i],f,f-1.618,str);
		}
		printdash(48);

        printdash(0);
		return;

	}
}