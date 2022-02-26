class Fraction
{
	private int numerator;
	private int denominator;

	Fraction()
	{
		numerator = 0;
		denominator = 1;
	}
	Fraction(int numerator,int denominator)
	{
		if(denominator==0)
		{
			throw new ArithmeticException("\nCannot have 0 in denominator!\n");
		}
		else
		{
			this.numerator = (denominator < 0 ? -numerator : numerator);
            this.denominator = (denominator < 0 ? -denominator : denominator);
            reduce();
		}
	}

	int getNumerator()
	{
		return numerator;
	}
	int getDenominator()
	{
		return denominator;
	}

	void setNumerator(int num)
	{
        numerator = num;
        reduce();
    }
    void setDenominator(int denom)
    {
        if (denom > 0)
        {
           denominator = denom;
           reduce();
        }
        else if (denom < 0)
        {
           numerator = -numerator;
           denominator = -denom;
           reduce();
        }
    }
 
    private void reduce()
    {
        int n = numerator, d = denominator, largest;
        if (numerator < 0)
        {
            n = -numerator;
        }
        if (n > d)
        {
            largest = n;
        }
        else
        {
            largest = d;
        }

        int gcd = 0;
        for (int i = largest; i >= 2; i--)
        {
            if (numerator % i == 0 && denominator % i == 0)
            {
                gcd = i;
                break;
            }
        }
        if (gcd != 0) 
        {
            numerator /= gcd;
            denominator /= gcd;
        }
    }


    public boolean equals(Fraction rhs)
    {
        return (numerator == rhs.numerator) && (denominator == rhs.denominator);
    }
    public Fraction add(Fraction rhs)
    {
        Fraction sum = new Fraction();
        sum.denominator = denominator * rhs.denominator;
        sum.numerator = numerator * rhs.denominator 
                          + denominator * rhs.numerator;
        sum.reduce();
        return sum;
    }
    public Fraction subtract(Fraction f2)
    {
      int numerator2 = f2.getNumerator();
      int denominator2 = f2.getDenominator();
      int numerator3 = numerator * denominator2 - numerator2 * denominator;
      int denominator3 = denominator * denominator2;
      Fraction result = new Fraction(numerator3, denominator3);
      result.reduce();
      return result;
   }
   public Fraction multiply(Fraction f2)
   {
      int numerator2 = f2.getNumerator();
      int denominator2 = f2.getDenominator();
      int numerator3 = numerator * numerator2;
      int denominator3 = denominator * denominator2;
      Fraction result = new Fraction(numerator3, denominator3);
      result.reduce();
      return result;
   }
   public Fraction divide(Fraction f2)
   {
      int numerator2 = f2.getNumerator();
      int denominator2 = f2.getDenominator();
      int numerator3 = numerator * denominator2;
      int denominator3 = denominator * numerator2;
      Fraction result = new Fraction(numerator3, denominator3);
      result.reduceToLowestTerms();
      return result;
   }

   public String toString()
   {
       return numerator + "/" + denominator;
   }
 }

class A2_6
{
	public static void main(String[] args)
	{
		;
	}
}