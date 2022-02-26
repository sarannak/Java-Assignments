import java.lang.Math;

abstract class GeometricObject
{
	//attributes
	private String colour;
	private float weight;

    //constructors
	GeometricObject()
	{
		colour = "white";
		weight = 1.0f;
	}
	GeometricObject(String c,float w)
	{
		colour = c;
		weight = w;
	}

	//accessors
	String getColour()
	{
		return colour;
	}
	float getWeight()
	{
		return weight;
	}
	//mutators
	void setColour(String c)
	{
		colour = c;
	}
	void setWeight(float w)
	{
		weight = w;
	}

	//methods
	abstract float findArea();
	abstract float findCircumference();
}

class Triangle extends GeometricObject
{
	float a,b,c;

	//constructors
	Triangle()
	{
		super();
		a = 0;
		b = 0;
		c = 0 ;
	}
	Triangle(float a,float b,float c)
	{
		this();
		if(a+b>c&&b+c>a&&c+a>b)
		{
			this.a = a;
		    this.b = b;
		    this.c = c;;
		}
		else
		{
			System.out.println("\nNot a valid Triangle");
			System.out.println("Initializing to default");
		}
		
	}
	Triangle(float a,float b,float c,String color,float w)
	{
		this(a,b,c);
		setWeight(w);
		setColour(color);
	}

	//abstract method implementation
	float findArea()
	{
		float s=(a+b+c)*0.5f;
		return (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	float findCircumference()
	{
		return a+b+c;
	}

	//toString
	public String toString()
	{
		return "a = "+a+" , b = "+b+" , c = "+c
		       +" , Colour = "+getColour()+" , Weight = "+getWeight();
	}

}

public class A3_2
{
	public static void main(String[] args)
	{
		System.out.println("\n-------GeometricObject and Triangle------");

		System.out.println("\nTriangle t = new Triangle(4,5,6)");
		Triangle t = new Triangle(4,5,6);
		System.out.println(t);
		System.out.printf("t.findArea() = %.2f sq unit\n",t.findArea());
		System.out.printf("t.findCircumference() = %.2f unit\n",t.findCircumference());
	}
}