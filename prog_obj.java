class A
{
	public void show()
	{
		System.out.println("Hello All");
	}
}
class prog_obj
{
	public static void main(String [] args)
	{
		A obj_A = new A();
		obj_A.show();
		System.out.println(obj_A);
	}
}