class A4_2
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("\nint[] a = new int[10];");
			int[] a = new int[10];

			System.out.println("a[15] = 7;");
			a[15] = 7;
		}
		catch(Exception e)
		{
			System.out.println("\nERROR");
			System.out.println("OUT OF BOUND ASSIGNMENT");
		}
	}
}