import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rem,rev=0;
		int temp=n;
		while(n>0)
		{
			rem=n%10;
			//System.out.println(rem);
			rev=rev*10+rem;
			//System.out.println(rev);
			n=n/10;
			//System.out.println(n);
		}
		System.out.println(rev);
		if(temp==rev)
		System.out.println("It is a Palindrome");
		else
			System.out.println("It is not a palindrome");
	}
}