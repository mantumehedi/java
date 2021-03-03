import java.util.*;

class A
{
	int l;
	int w;
	A()
	{
		l = 10;
		w = 5;
	}
	A(int a, int b)
	{
		l = a;
		w = b;
	}
	
	void area()
	{
		System.out.println("Area: "+ (l*w));
	}
}

class rec_area
{
	public static void main(String [] args)
	{
		A p = new A();
		p.area();
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and width: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		A q = new A(m,n);
		q.area();
		
	}
}