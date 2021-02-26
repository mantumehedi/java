class switchp
{
public static void main(String args[])
{

        int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int op=Integer.parseInt(args[2]);
	int result;
	
	switch(op){
	default:
    		
    		System.out.println("Please switch between 1 to 4");
		break;
  	case 1:
		result = a + b;
    		System.out.println(result);
    		break;
  	case 2:
    		result = a - b;
    		System.out.println(result);
    		break;
	case 3:
		result = a / b;
    		System.out.println(result);
    		break;
  	case 4:
    		result = a * b;
    		System.out.println(result);
    		break;
	
    		
  	
}

	

}
}