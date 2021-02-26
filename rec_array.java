import java.util.Scanner;

class rec_array
{
public static void main(String [] args)
{
	int a[][] = new int[3][3];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value into the array");

	for(int i = 0;i < a.length;i++)
	{
		for(int j = 0;j < a[i].length;j++)
		{
			a[i][j] = sc.nextInt();

		}
	
	}

	for(int i = 0;i < a.length;i++)
	{
		for(int j = 0;j < a[i].length;j++)
		{
			System.out.print(a[i][j]+"\t");

		}
		System.out.println(" ");
		
	}

}

}