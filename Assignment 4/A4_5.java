class A4_5
{
	static int a;
	static void f2(int[] a)
	{
		System.out.println(a.length);
	}
	static void f1()
	{
		try
		{
			System.out.println("\nInside try");
			System.out.println("int a;");
			System.out.println("f2(null)");
			f2(null);
		}
		finally
		{
			System.out.println("\nInside Finally");
			System.out.println("a = 10;");
			a = 10;
		}
	}
	public static void main(String[] args)
	{
		try
		{
			f1();
		}
		catch(NullPointerException e)
		{
			System.out.println("\nException Caught");
			System.out.println("Value of a = "+a);
		}	
	}
}