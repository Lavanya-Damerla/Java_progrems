import java.util.Scanner;
class StudentMarks 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
                System.out.println("Enter the marks:");
                int m=sc.nextInt();
		String r=(m>=90)?"Excelent":(m>=75)?"Good":(m>35)?"Pass":"Fail";
		System.out.println("Student marks:"+m);
		System.out.println(r);
	}
}
