class PassString
{
	public static void change(StringBuffer paramStr)
	{
		paramStr.replace(0,11,"Hello Java");//change the string
		System.out.println("Inside function: paramStr = "+paramStr);

	}

public static void main(String [] args)
{
	StringBuffer argStr = new StringBuffer("Hello World");
	System.out.println("Before function call: argStr ="+argStr);
	change(argStr);
	System.out.println("After function call: argStr = "+argStr);

}

}