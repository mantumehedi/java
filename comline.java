class comline
{
public static void main(String[] args)
{
	//System.out.println(args[0]+" "+args[1]);

	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int c=Integer.parseInt(args[2]);

	//System.out.println("The sum is "+(a+b));

	//a = (a+b) - (b=a);
	
	if(a>b && a>c)
        {
            System.out.println("highest number is "+ a);
        }
        else if(b>a && b>c)
        {
            System.out.println("highest number is "+ b);
        }
	else
	{
	    System.out.println("highest number is "+ c);			
	}
	
	//System.out.println("after the swap "+ a + " and " + b);
		
}
}