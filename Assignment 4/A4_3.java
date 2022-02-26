class A4_3
{
	static void func()
	{
		try
		{
			System.out.println("\nint[] a = new int[10];");
			int[] a = new int[10];

			System.out.println("a[15] = 7;");
			a[15] = 7;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("\nInside 1st catch block");
			throw e;
		}
	}
	public static void main(String args[])
	{
		try
		{
			func();
		}
		catch(Exception e)
		{
			System.out.println("\nInside 2nd catch block");
			System.out.println("Stack Trace:-");
			e.printStackTrace();
		}
	}
}