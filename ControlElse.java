/*
import java.util.Scanner;
class ControlElse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value:");
		int a=sc.nextInt();
		System.out.println("Enter second value:");
		int b=sc.nextInt();
		if(a>b)
		System.out.println(a+" is greatest value");
		else
			System.out.println(b+" is greatest value");
	}
}

import java.util.Scanner;
class ControlElse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int a=sc.nextInt();
		if(a%2==0)
		System.out.println("The value is even:"+a);
		else
			System.out.println("The value is odd:"+a);
	}
}

import java.util.Scanner;
class ControlElse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int a=sc.nextInt();
		if(a==0)
		{
			System.out.println("its zero");
			System.exit(0);
		}
		if(a>0)
		System.out.println("The value is positive:"+a);
		else
			System.out.println("The value is negative:"+a);
	}
}
*/
import java.util.Scanner;
class ControlElse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0)
		System.out.println(year+" is a leap year");
		else
			System.out.println(year+" is not a leap year");
	}
}