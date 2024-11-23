import java.util.Scanner;
class Addition
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter first value:");
int a=sc.nextInt();
System.out.println("Enter second value");
int b=sc.nextInt();
System.out.println("Sum of two values is:"+(a+b));
System.out.println("Subtraction of two values is:"+(a-b));
System.out.println("Multiplication of two values is:"+(a*b));
System.out.println("Division of two values is:"+(a/b));
System.out.println("Modules of two values is:"+(a%b));
}
}
