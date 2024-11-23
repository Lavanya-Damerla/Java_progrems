import java.util.Scanner;
class StudentAssignment 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student marks:");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		int m6=sc.nextInt();
		int total=m1+m2+m3+m4+m5+m6;
		System.out.println("Total marks of student:"+total);
		int avg=total/6;
		System.out.println("Average marks of student:"+avg);
		if(avg>=70)
			System.out.println("Grade:A");
		else if(avg>=50)
			System.out.println("Grade:B");
		else if(avg>=35)
			System.out.println("Grade:C");
		else
			System.out.println("Fail");
	}
}
