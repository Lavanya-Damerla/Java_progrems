import java.util.Scanner;
class Terinary2 
{
		public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student results");
		int a=sc.nextInt();
		String s=(a>35)?"pass":"Fail";
		String b=(a>=80)?"good":"excellent";
		System.out.println(s);
	}
}
