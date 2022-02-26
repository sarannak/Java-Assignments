import java.util.Scanner;

class Queue<T>
{
	//attributes
	private Stack<T> s1;
	private Stack<T> s2;

	//constructor
	Queue()
	{
		s1 = new Stack<T>();
		s2 = new Stack<T>();
	}

	//methods
	boolean enqueue(T v)
	{
		return s1.push(v);
	}
	boolean dequeue()
	{
		if(s1.isEmpty())
			return false;

		exchange(s1,s2);
		s2.pop();

		exchange(s2,s1);
		return true;
	}
	@SuppressWarnings("unchecked")
	T peek()
	{
		if(s1.isEmpty())
		{
			System.out.println("\nEMPTY QUEUE");
			return null;
		}
		exchange(s1,s2);
		T n = s2.peek();
		exchange(s2,s1);

		return (T)n;
	}
	boolean isEmpty()
	{
		return s1.isEmpty();
	}
	void display()
	{
		if(s1.isEmpty())
		{
			System.out.println("\nEMPTY QUEUE");
			return;
		}

		System.out.println("\nQUEUE:-");
		exchange(s1,s2);
		for(;!s2.isEmpty();s2.pop())
		{
			System.out.print("   "+s2.peek());
			s1.push(s2.peek());
		}
		System.out.println();
	}
	private void exchange(Stack<T> s1,Stack<T> s2)
	{
		for(;!s1.isEmpty();s1.pop())
			s2.push(s1.peek());
	}
}

public class A3_4
{
	public static void main(String args[])
	{
		int n,value; Scanner kb = new Scanner(System.in);
		Queue<Integer> q = new Queue<Integer>();

		System.out.println("\n-------Queue Class--------");

		do
		{
			System.out.println("\n~~~~~~MENU~~~~~~");
			System.out.println("1.ENQUEUE");
			System.out.println("2.DEQUEUE");
			System.out.println("3.PEEK");
			System.out.println("4.isEmpty");
			System.out.println("5.Display");
			System.out.println("6.Exit");
			System.out.print("Enter option: ");
			n = kb.nextInt();

			switch(n)
			{
				case 1:{
					      System.out.print("\nEnter value: ");
					      value = kb.nextInt();
					      if(!q.enqueue(value))
					        System.out.println("Prevented Overflow");
					      System.out.println(value+" ENQUEUED");
					      break;
				       }

				case 2:{
					      if(q.dequeue())
					      	System.out.println("\nDEQUEUE Success");
					      else
					      	System.out.println("\nDEQUEUE Failed");
					      break;
				       }

                case 3:{
                	      System.out.println("\nPEEK = "+q.peek());
					      break;
				       }

				case 4:{
					      if(q.isEmpty())
					      	System.out.println("\nTrue");
					      else
					      	System.out.println("\nFalse");
					      break;
				       }

				case 5:{
					      q.display();
					      break;
				       }

				case 6:  break;
				default: System.out.println("\nNOT A VALID OPTION");
			}

		}while(n!=6);
	}
}