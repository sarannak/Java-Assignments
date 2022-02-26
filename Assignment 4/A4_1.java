class A4_1
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("\nint x=0 , y=3/x ;");
			int x=0 , y=3/x;
		}
		catch(Exception e)
		{
			System.out.println("\nException caught: "+e);
			System.out.println("Origin: "+e.getStackTrace()[0]);
		}
	}
}