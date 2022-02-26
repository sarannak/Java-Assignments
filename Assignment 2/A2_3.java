class Student
{
	private String name;
	private int[] sub = new int[5];

	Student()
	{
		name = "Unkown Student";
		for(int i=0;i<5;++i)
			sub[i] = 0;

	}

	Student(String name,int a,int b,int c,int d,int e)
	{
		this.name = name;
		sub[0] = a;
		sub[1] = b;
		sub[2] = c;
		sub[3] = d;
		sub[4] = e;
	}

	String getName()
	{
		return name;
	}
	int getSub1()
	{
		return sub[0];
	}
	int getSub2()
	{
		return sub[1];
	}
	int getSub3()
	{
		return sub[2];
	}
	int getSub4()
	{
		return sub[3];
	}
	int getSub5()
	{
		return sub[4];
	}

	void setName(String name)
	{
		this.name = name;
	}
	void setSub1(int a)
	{
		sub[0] = a;
	}
	void setSub2(int a)
	{
		sub[1] = a;
	}
	void setSub3(int a)
	{
		sub[2] = a;
	}
	void setSub4(int a)
	{
		sub[3] = a;
	}
	void setSub5(int a)
	{
		sub[4] = a;
	}

	private int sum()
	{
		int sum = 0;

		for(int i:sub)
			sum+=i;

		return sum;
	}

	float avg()
	{
		return sum()/5.0f;
	}

	char grade()
	{
		int sum = sum();
        int p = (sum/50)*10;

        switch(p)
        {
        	case 10:
        	case 9:  return 'O';
        	case 8:  return 'E';
        	case 7:  return 'A';
        	case 6:  return 'B';
        	case 5:  return 'C';
        	case 4:  return 'D';
        	case 3:
        	case 2:
        	case 1:
        	case 0:  return 'F';
        	default: return 'I';   
        }

	}

	public String toString()
	{
		String s = name;

		for(int i:sub)
			s+=" "+i;

		return s;
	}
}

class A2_3
{
	public static void main(String[] args)
	{
		System.out.println("\n------Student Class------");

		Student s = new Student("Name",80,90,45,50,60);
		System.out.println(s);
		 
	}
}