class Rectangle
{
	//attributes
	float height;
	float width;
	float surfaceArea;

    //constructors
	Rectangle()     //default
	{
		height = 0;
		width = 0;
		surfaceArea = 0;
	}
	Rectangle(float h,float w)   //parameterized
	{
		height = h;
		width = w;
		surfaceArea = height * width;
	}
	Rectangle(Rectangle r)   //copy
	{
		height = r.height;
		width = r.width;
		surfaceArea = r.surfaceArea;
	}

	//methods
	float computeSurfaceArea()
	{
		surfaceArea = height * width;
		return surfaceArea;
	}
}

class Cuboid extends Rectangle
{
	float depth;

	//constructors
	Cuboid()
	{
		super();
		depth = 0;
	}
	Cuboid(float h,float w,float d)
	{
		super(h,w);
		depth = d;
		computeSurfaceArea();
	}

	//methods
	float computeSurfaceArea() //method overrride
	{
		surfaceArea = 2*((height*width)+(height*depth)+(depth*width));
		return surfaceArea;
	}
}

public class A3_1   //democlass
{
	public static void main(String[] args)
	{
		System.out.println("\n---------Rectangle and Cuboid---------");

		System.out.println("\nRectangle r = new Rectangle(10,20)");
		Rectangle r = new Rectangle(10,20);
		System.out.printf("r.height = %.2f r.width = %.2f\n",r.height,r.width);
		System.out.printf("r.computeSurfaceArea() = %.2f\n",r.computeSurfaceArea());

		System.out.println("\nCuboid c = new Cuboid(10,20,30)");
		Cuboid c = new Cuboid(10,20,30);
		System.out.printf("c.height = %.2f c.width = %.2f c.depth = %.2f\n",c.height,c.width,c.depth);
		System.out.printf("c.computeSurfaceArea() = %.2f\n",c.computeSurfaceArea());

	}
}