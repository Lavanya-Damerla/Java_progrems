import java.util.Scanner;
public class SimpleInterestCalculator
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter principal amount:");
double principal=sc.nextDouble();
System.out.println("Enter annual interest:");
double rate=sc.nextDouble();
System.out.println("Enter time in years:");
int time=sc.nextInt();
double simpleInterest=(principal*rate*time)/100;
System.out.println("Simple Interest:"+simpleInterest);
}
}