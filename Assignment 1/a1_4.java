import java.util.Scanner;

class a1_4
{
	public static void main(String[] args)
	{
		int n=0,i=0;Scanner kb = new Scanner(System.in);
		
		System.out.printf("\n------Find Min Max Array------\n");
		System.out.printf("\nEnter size of array: ");
		n = kb.nextInt();

		int[] a = new int[n];

		System.out.printf("Enter %d elements:-\n",n);
		for(i=0;i<n;++i)
			a[i] = kb.nextInt();

		System.out.printf("\nGiven Array:-\n");
		for(i=0;i<n;++i)
			System.out.printf("   %d",a[i]);
		System.out.println();

		int max = a[0]; int min = a[0];

		for(int j : a)
		{
			if(j>max)
				max = j;
			if(j<min)
				min = j;
		}

		System.out.printf("\nMax = %d\nMin = %d\n",max,min);

		System.out.println();
		return;

	}
}