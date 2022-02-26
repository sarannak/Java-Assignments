import java.util.Scanner;

class node
{
	//attributes
	private int data;
	private node next;

	//constructors
	node()
	{
		data = 0;
	}
	node(int d)
	{
		data = d;
	}

	//methods
	node insertAsc(int v)
	{
		if(v<this.data)
		{
			node new_node = new node(v);
			new_node.next = this;
			return new_node;
		}

		node n = this;
		for(;n.next!=null&&v>n.next.data;n=n.next);
		if(n.next==null)
		{
			;
		}
		else if(n.data==v||n.next.data==v)
		{
			System.out.println("\nDuplicate element NOT ALLOWED");
			return this;
		}

		node new_node = new node(v);
		new_node.next = n.next;
		n.next = new_node;
		return this;
	}

	boolean search(int v)
	{
		for(node n=this;n!=null;n=n.next)
		{
			if(n.data==v)
				return true;
		}
		return false;
	}
	node remove(int v)
	{
		if(this.data==v)
			return this.next;

		node n = this;
		for(;n.next.data!=v;n=n.next);
		n.next = n.next.next;
	    return this;
	}
	void display()
	{
		node n = this;
		System.out.println("\nLinked List:-");
		for(;n.next!=null;n=n.next)
			System.out.print("   "+n.data);
		System.out.println("   "+n.data);
	} 
}

public class A3_5
{
	static node head;

	public static void main(String[] args)
	{
		System.out.println("\n-------Linked List--------");

		int n,value;Scanner kb = new Scanner(System.in);

		do
		{
			System.out.println("\n~~~~~Menu~~~~~");
			System.out.println("1.Insert Node(Ascending)");
			System.out.println("2.Search Node");
			System.out.println("3.Remove Node");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			System.out.print("Enter option: ");
			n = kb.nextInt();
			System.out.println();

			switch(n)
			{
				case 1:{//insert block
					      System.out.print("Enter value: ");
					      value = kb.nextInt();

					      if(head==null)
					      {
					      	System.out.println("Creating Linked List....");
					      	head = new node(value);
					      }	
					      else
					      {
					      	System.out.println("Inserting node("+value+")......");
					      	head = head.insertAsc(value);
					      	System.out.println("Inserted node("+value+")");
					      }

					      break;
					   }

				case 2:{//search block
					      if(head==null)
					      {
					      	System.out.println("Linked List is EMPTY");
					      	break;
					      }

					      System.out.print("Enter value to search: ");
					      value = kb.nextInt();
					      if(head.search(value))
					      	System.out.println(value+" exists in list");
					      else
					      	System.out.println(value+" does not exist in list");
					      break;
					   }

				case 3:{//delete block
					      if(head==null)
					      {
					      	System.out.println("Linked List is EMPTY");
					      	break;
					      }

					      System.out.print("Enter value to be deleted: ");
					      value = kb.nextInt();
					      if(head.search(value))
					      {
					      	System.out.println("Deleting "+value+"......");
					      	head = head.remove(value);
					      	System.out.println("Deleted "+value);
					      }
					      else
					      	System.out.println("CANNOT DELETE "+value);
					      break;
					   }

				case 4:{//search block
					      if(head==null)
					      {
					      	System.out.println("Linked List is EMPTY");
					      }
					      else
					      	head.display();
					      break;
					   }

				case 5:  System.out.println("Exiting.....");
				         break;
				default: System.out.println("NOT A VALID OPTION");
			}

		}while(n!=5);
	}
}