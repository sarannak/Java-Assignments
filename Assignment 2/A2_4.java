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

class Account
{
	private String name;
	private final long no;
	private accType type;
	private float balance; 
	public static int tx = 0;

	//parameterized constructor
	Account(String name,long no,accType type)
	{
		this.name = name;
		this.no = no;
		this.type = type;
		balance = 0;
	}

	//Accessors
	String getName()
	{
		return name;
	}
	long getNo()
	{
		return no;
	}
	accType getType()
	{
		return type;
	}
	float getBalance()
	{
		return balance;
	}

	//Mutators
	void setName(String name)
	{
		this.name = name;
	}
	void setType(accType type)
	{
		this.type = type;
	}

	void Deposit(float amt)
	{
		balance+=amt;
		++tx;
	}
	boolean Withdraw(float amt)
	{
		if(balance-amt>-1)
		{
			balance-=amt;
			--tx;
			return true;
		}
		else
			return false;
	}

	public String toString()
	{
		return name+" "+no+" "+" "+type.value()+" Rs."+String.format("%.2f",balance)
	}

}

class A2_4
{
	public static void main(String[] args)
	{
		;
	}
}