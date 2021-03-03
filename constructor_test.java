class A
{
	int x;
	A()
	{
		x = 10;
	}
	void show()
	{
		System.out.println("Hello "+ x);
	}
}

class constructor_test
{
	public static void main(String [] args)
	{
		A a = new A();
		a.show();
		A b = new A();
		b.show();
	}
}