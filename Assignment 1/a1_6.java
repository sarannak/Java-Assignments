import java.util.Scanner;
import java.lang.Math;

class a1_6
{
	public static void printdash(int n)
	{
		System.out.print("\n");
		for(int i=0;i<n;++i)
		    System.out.print("-");
		return;
	}
	public static void main(String[] args)
	{
		System.out.printf("\n-------Interest Calculator-------\n");
		Scanner kb = new Scanner(System.in);

		System.out.printf("\nEnter Initial Balance: ");
		float init_bal = kb.nextFloat();

		System.out.printf("\nEnter Interest Rate: ");
		float rate = kb.nextFloat();

		System.out.printf("\nEnter no. of years: ");
		int years = kb.nextInt();

        float old_bal = init_bal;
        float new_bal = init_bal;

        System.out.println();
		printdash(47);
		System.out.printf("\n| Year | Old Balance | New Balance | Interest |");
		for(int i=1;i<years+1;++i)
		{
			old_bal = new_bal;
			new_bal = old_bal*(1+((float)rate/100));

			printdash(47);
			System.out.printf("\n|%6d|%13.2f|%13.2f|%10.2f|",i,old_bal,new_bal,new_bal-old_bal);
		}
		printdash(47);

		System.out.println();
		return;

	}
}