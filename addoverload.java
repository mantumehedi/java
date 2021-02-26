import java.util.*;

class addition
{
	int w,x,y,z;
	
	void add(int w,int x,int y,int z)
	{
		int ar = w+x+y+z;
		System.out.println("The sum is "+ ar);

	}
	
	void add(int w,int x,int y)
	{
		int ar = w+x+y;
		System.out.println("The sum is "+ ar);

	}

	void add(int w,int x)
	{
		int ar = w+x;
		System.out.println("The sum is "+ ar);

	}

}

class addoverload
{
	public static void main(String [] args)
	{
		int a,b,c,d;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers to add");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		addition r = new addition();
		r.add(a,b,c,d);
		r.add(a,b,c);
		r.add(a,b);

	}

}
