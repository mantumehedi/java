import java.util.*;

class shape
{
	int l,w;
	float k;
	void area(int l,int w)
	{
		int ar = l*w;
		System.out.println("The area of the rectangle is "+ ar);

	}
	
	void area(int l)
	{
		int ar = l*l;
		System.out.println("The area of the square is "+ ar);

	}

	void area(float k)
	{
		float pi = 3.1416f;
		float ar = pi*k*k;
		System.out.println("The area of the circle is "+ ar);

	}

}

class overload
{
	public static void main(String [] args)
	{
		int a,b;
		float c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and width of the rectangle and radius of circle");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextFloat();
		
		shape r = new shape();
		r.area(a,b);
		r.area(a);
		r.area(c);

	}

}