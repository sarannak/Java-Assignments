class Room
{
	float height,width,breadth;

	Room()
	{
		height=0;
		width=0;
		breadth=0;
	}

	Room(float height,float width,float breadth)
	{
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}

	float vol()
	{
		return height*width*breadth;
	}
}

class A2_1
{
	public static void main(String[] args)
	{
		System.out.println("\n-------Room Class-------");

		Room[] r = new Room[2];

		r[0] = new Room();
		r[0].height = 10;
		r[0].width = 10;
		r[0].breadth = 10;

		r[1] = new Room(20,30,40);

		System.out.printf("\nVolume of Room 1 = %.2f\n",r[0].vol());
		System.out.printf("Volume of Room 2 = %.2f\n",r[1].vol());

	}
}