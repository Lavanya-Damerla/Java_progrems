import java.util.Scanner;
class Running 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lanes");
		int n=sc.nextInt();
		System.out.println("Enter the distance of each lane in meters");
			int d=sc.nextInt();
		int p,q;
		int r=3*(n*d);
		int t=r/4;
		p=1*t;
		q=3*t;
		System.out.println("the distance covered by first person is:"+p);
		System.out.println("The distance covered by second person is:"+q);
	}
}
/*
p=1*t;
q=3*t;
*/