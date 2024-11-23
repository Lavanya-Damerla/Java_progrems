import java.util.Scanner;
class Example2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Salary");
		int salary=sc.nextInt();
		System.out.println("Enter the expenditure percentage");
		float p=sc.nextFloat();
		float f=0;
		int d=0;
		int r=0;
		if(p>0)
		{
			 f=p/100;
			 d=Math.round(salary*f);
			 r=salary-d;
		}
		System.out.println(f);
		System.out.println(d);
		System.out.println(r);
	}
}
