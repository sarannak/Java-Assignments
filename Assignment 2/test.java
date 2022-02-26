enum accType
{
	S("Savings"),
	C("Current");

	private final String value;

	accType(String value)
	{
		this.value = value;
	}

	String value()
	{
		return this.value;
	}
}

class test
{
	public static void main(String[] args)
	{
		accType t = accType.S;
		System.out.println();
	}
}