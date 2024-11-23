import java.util.Scanner;
class Triangle
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the base value:");
float b=sc.nextInt();
System.out.println("Enter the height value:");
float h=sc.nextInt();
float area=(b*h)/2;
System.out.println("Area of triangle is:"+area);
}
}

