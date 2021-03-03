class A
{
	int x;
	String s;
	A()
	{
		x = 10;
		s = "BSc(CS)";
		startup();
	}
	A(int a, String q)
	{
		x = a;
		s = q;
	}
	void startup()
	{
		System.out.println("Hello, I am a startup");
	}
	void show()
	{
		System.out.println("Hello "+ x +"\t"+ s);
	}
}

class constructor_test
{
	public static void main(String [] args)
	{
		A a = new A();
		a.show();
		A b = new A(786, "Parameterized constructor");
		b.show();
		A c = new A();
		c.show();
		A d = new A(1, "Java");
		d.show();
	}
}
