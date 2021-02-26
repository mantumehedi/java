class bitwise
{
public static void main(String args[])
{

        int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	
	int p = a&b;
	int q = a|b;

	System.out.println("a AND b:"+p);
	System.out.println("a OR b:"+q);

}
}