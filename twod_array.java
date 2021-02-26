import java.util.Scanner;

class twod_array
{
	public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the total row required:");
	int row = sc.nextInt();
	System.out.println("Enter the total column required:");
	int col = sc.nextInt();
	int a[][] = new int[row][col];

	for(int i = 0;i < row;i++)
	{
		for(int j = 0;j < col;j++)
	{
		System.out.println("Enter row "+ (i+1) +" column "+ (j+1));
		a[i][j] = sc.nextInt();
	}
	}

	for(int i = 0;i < row;i++)
	{
		for(int j = 0;j < col;j++)
	{
		System.out.println("The value of row "+ (i+1) +" column "+ (j+1));
		System.out.println(a[i][j]);
	}
	}

	
	
	 	

}

}