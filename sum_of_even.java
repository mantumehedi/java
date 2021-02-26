import java.util.Scanner;

class sum_of_even
{
	public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the total number required:");
	int no = sc.nextInt();
	int a[] = new int[no];

	int soe = 0;
	
	System.out.println("Enter "+ no +" numbers");
	//for(int i = 0;i < a.length;i++)
	for(int i : a) //enhanced for loop
	{
		a[i] = sc.nextInt();

		if(a[i] % 2 == 0)
		{
			soe = soe + a[i]; 
		}

	}
	System.out.println("Sum of Even numbers:");
	System.out.println(soe);

}

}