import java.util.Scanner;
class Customer 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the customer");
		String s=sc.next();
		System.out.println("Enter the number of products");
		int p=sc.nextInt();
		int c;
		if(s.equals("Demostic"))
		{
			if(p<2)
			{
				c=100*p;
				System.out.println(c);
			}
			else{
				c=100*p+(p-2)*100;
				System.out.println(c);
			}
		}
		if(s.equals("International"))
		{
			if(p<2)
			{
				c=500*p;
				System.out.println(c);
			}
			else{
				c=500*p+(p-2)*200;
				System.out.println(c);
			}
		}
}
}