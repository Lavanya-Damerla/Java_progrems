import java.util.Scanner;
class Frog
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter depth of well:");
		int w=sc.nextInt();
		System.out.print("distance of frog jumpinig");
		int j=sc.nextInt();
		System.out.print("Distance reduce for ever jump:");
		int c=sc.nextInt();
		int d=(j-c)*w;
		System.out.print("Number of days covered by frog to jump the well:"+d);
		/*for(int i=1;i<w;i++)
		{
			c++;
		}
		System.out.println(c);
		
		*/
	}
}
