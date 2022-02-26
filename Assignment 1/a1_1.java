import java.util.Scanner;

class a1_1
{
    public static int fact(int n)
    {
    	for(int fact = 1;n>0;--n)
    	    fact*= n;
    	return fact;         
    }
    public static void main(String args[])
    {
    	System.out.printf("-------Factorial-------\n");
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        int a = kb.nextInt();

        System.out.printf("\n%d! = %d\n",a,fact(a));
        return;
    }
}