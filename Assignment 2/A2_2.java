import java.util.Scanner;
import java.lang.Math;

abstract class Shape
{
	private String name;

	Shape()
	{
		name = "Unknown Shape";
	}

	Shape(String name)
	{
		this.name = name;
	}

	String getName()
	{
		return this.name; 
	}

	abstract float calcArea();
}

class Square extends Shape
{
	float side;

	Square(float side)
	{
		super("Square");
		this.side = side;
	}

	float calcArea()
	{
		return side*side;
	}
}

class Rectangle extends Shape
{
	float length,breadth;

	Rectangle(float length,float breadth)
	{
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}

	float calcArea()
	{
		return height*width;
	}
}

class Triangle extends Shape
{
	float a,b,c,s;

	Triangle(float a, float b,float c)
	{
		if( a+b>c && b+c>a && c+a>b)
		{
			super("Triangle");
			this.a = a;
			this.b = b;
			this.c = c;
			s = (a+b+c)*0.5;
		}
		else
		{
			System.out.printf("\nNOT A VALID TRIANGLE");
			System.out.printf("\nInitializing values to 0.....\n");

			this.a = 0;
			this.b = 0;
			this.c = 0;
			s = 0;
		}
	}

	float calcArea()
	{
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}

class A2_2
{
	public static void main(String[] args)
	{
		float side,length,breadth,a,b,c;
		Shape[] shp = new Shape[3];

		shp[0] = new Square(side);
		shp[1] = new Rectangle(length,breadth);
		shp[3] = new Triangle(a,b,c);

	}
}