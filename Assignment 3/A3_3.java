import java.util.Scanner;

class Stack<T>
{
	static final int MAX = 5;

	//attributes
	private Object[] stk;
	private int top;

    //constructor
	Stack()
	{
		stk = new Object[MAX];
		top = -1;
	}

	//methods
	boolean push(T v)
	{
		if(top!=-1 && (top+1)%MAX==0)
		{
			Object[] a = new Object[stk.length*2];

			for(int i=0;i<top+1;++i)
				a[i] = stk[i];
			stk = a;
			stk[++top] = v;
			return false;
		}

		stk[++top] = v;
		return true;
	}
	boolean pop()
	{
		if(top==-1)
			return false;
		--top;
		return true;
	}
	@SuppressWarnings("unchecked")
	T peek()
	{
		if(top==-1)
		{
			System.out.println("\nEMPTY STACK");
			return null;
		}
		return (T)stk[top];
	}
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		return false;
	}
	void display()
	{
		if(top==-1)
		{
			System.out.println("\nEMPTY STACK");
			return;
		}
		System.out.println("\nSTACK:-");
		for(int i=top;i>-1;--i)
			System.out.println(stk[i]);
	}
}

public class A3_3
{
	public static void main(String args[])
	{
		int n,value; Scanner kb = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>();

		System.out.println("\n-------Stack Class-------");

		do
		{
			System.out.println("\n~~~~~~MENU~~~~~~");
			System.out.println("1.PUSH");
			System.out.println("2.POP");
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
					      if(!s.push(value))
					        System.out.println("Prevented Overflow");
					      System.out.println("PUSHED "+value);
					      break;
				       }

				case 2:{
					      if(s.pop())
					      	System.out.println("\nPOP Success");
					      else
					      	System.out.println("\nPOP Failed");
					      break;
				       }

				case 3:{
					      System.out.println("\nPEEK = "+s.peek());
					      break;
				       }

				case 4:{
					      if(s.isEmpty())
					      	System.out.println("\nTrue");
					      else
					      	System.out.println("\nFalse");
					      break;
				       }

				case 5:{
					      s.display();
					      break;
				       }

				case 6:  break;
				default: System.out.println("\nNOT A VALID OPTION");
			}
		}while(n!=6);
	}
}