import java.util.Scanner;
class Switch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int s=sc.nextInt();
		switch(s>0?1:s<0?-1:0)
		{
			case 0:
				System.out.println("Zero");
			break;
			case 1:
				System.out.println("Positive");
			break;
			case -1:
				System.out.println("Negative");
			break;
			default:
				System.out.println("Error");
		}
	}
}