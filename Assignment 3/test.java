class i
{
	int data;

	void exchange(i ob)
	{
		this = ob;
	}
}

public class test
{
	public static void main(String args[])
	{
		i a = new i();
		i b = new i();

		a.data = 8;
		b.data = 9;

		a.exchange(b);

		System.out.println("\n"+a.data);
	}
}