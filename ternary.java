class ternary
{
public static void main(String args[])
{

        int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int c=Integer.parseInt(args[2]);

	//int temp = (a > b) ? a : b;
	//int largest = (c > temp) ? c : temp;
	int max=(a>b && a>c)?a:(b>c)?b:c;

	System.out.println("largest Number is:"+max);

}
}