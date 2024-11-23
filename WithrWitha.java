import java.util.Scanner;
class WithrWitha 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the palindrome:");
		int n=sc.nextInt();
		int k=palindrome(n);
		if(k==1)
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not palindrome");
	}
		public static int palindrome(int n)
	{
			int temp=n;
			int rem,rev=0;
			while(n>0)
		{
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
		}
		if(temp==rev)
			return 1;
		else
			return 0;
	}
}
