import java.util.Scanner;

class array_test
{
	public static void main(String [] args)
{
	/*int a[] = new int[5];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");*/

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the total number required:");
	int no = sc.nextInt();
	int a[] = new int[no];
	
	for(int i = 0;i < a.length;i++)
	{
		a[i] = sc.nextInt();
	}
	
	for(int i = 0;i < a.length;i++)
	{
	System.out.println(a[i]);
	}

}
}