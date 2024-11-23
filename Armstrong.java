import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rem,sum=0;
		int temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		if(temp==sum)
		System.out.println("It is a armstrong number");
		else
			System.out.println("It is not a armstrong number");
	}
}