import java.util.Scanner;
class ControlNif 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		if(n<10)
		{
			if(n<5)
			{
				System.out.println("The value is:"+n);
		    }
		}
	}
}
