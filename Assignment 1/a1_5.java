import java.util.Scanner;

class a1_5
{
	public static void printarray(int[] a)
	{
		int n = a.length - 1;
		System.out.printf("\nGiven Array:-\n");
		for(int i=1;i<n+1;++i)
			System.out.printf("   %d",a[i]);
		System.out.println();
		return;
	}
	public static void printdash(int n)
	{
		System.out.print("\n");
		for(int i=0;i<n;++i)
		    System.out.print("-");
		return;
	}
	public static void insertion_sort(int[] a)
	{
		a[0] = Integer.MIN_VALUE; int i = 0,j = 0,temp = 0 ,len = 0, n = a.length - 1;

		String pass = "| PASS |", head = "";
		for(i=0;i<n+1;++i)
			head += "  A["+i+"]  ";
		pass += head + "|";
		len = pass.length();

		printdash(len);
		System.out.print("\n"+pass);

		for(i=1;i<n;++i)
		{
			printdash(len);
			System.out.printf("\n|%6d|",i);
			for(int k=0;k<n+1;++k)
			{
				if(k==0)
					System.out.print("    -INF");
				else if(k==i+1)
					System.out.printf(" [%3d  ]",a[k]);
				else
					System.out.printf("%8d",a[k]);
			}
			System.out.print("|");

			temp = a[i+1];
			for(j=i;temp<a[j];--j)
				a[j+1] = a[j];
			a[j+1] = temp;
		}

		printdash(len);
		System.out.printf("\n|Sort:-|");
			for(int k=0;k<n+1;++k)
			{
				if(k==0)
					System.out.print("    -INF");
				else
					System.out.printf("%8d",a[k]);
			}
		System.out.print("|");
		printdash(len);

		return;
	}
	public static void main(String[] args)
	{
		System.out.printf("\n--------Insertion Sort--------\n");

		if(args.length>0)
		{
			int[] a = new int[args.length+1];int i=1;
			for(String s:args)
				a[i++] = Integer.parseInt(s);

			printarray(a);

			insertion_sort(a);
		}
		else
		{
			Scanner kb = new Scanner(System.in);

		    System.out.printf("\nEnter no. of integers: ");
		    int n = kb.nextInt();

		    int[] a = new int[n+1];

		    System.out.printf("Enter %d integers:-\n",n);
		    for(int i=1;i<n+1;++i)
			    a[i] = kb.nextInt();
		    printarray(a);

		    insertion_sort(a);
		}

		System.out.println();
	}
}