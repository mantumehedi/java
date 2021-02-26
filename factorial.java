class factorial
{
public static void main(String[] args)
{
	int i;
	int fact=1;  
  	int num=Integer.parseInt(args[0]);    
  	for(i=1;i<=num;i++){    
      		fact=fact*i;    
  	}    
  	System.out.println("Factorial is "+fact);    
}  
}