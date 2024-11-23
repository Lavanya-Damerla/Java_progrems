import java.util.Scanner;
class WithaNor 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		palindrome(n);
	}
	public static void palindrome(int n)
	{
		int temp=n;
		int rev=0,rem;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
			if(temp==rev)
				System.out.println("It is a Palindrome");
				else
				System.out.println("It is not a palindrome");
	}
}