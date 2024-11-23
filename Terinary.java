import java.util.Scanner;
class Terinary1 
{
		public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		int i=sc.nextInt();
		System.out.println("enter b value");
		int j=sc.nextInt();
		int c=(a<b)?a:b;
		System.out.println(c);
		System.out.println("enter x value");
		int x=sc.nextInt();
		System.out.println("enter y value");
		int y=sc.nextInt();
		System.out.println("enter z value");
		int z=sc.nextInt();
		int m=((a>b)?(a>c):(b>c))?a:b:c;
		System.out.println(m);
	}
}
