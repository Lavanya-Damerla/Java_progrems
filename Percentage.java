import java.util.Scanner;
class Percentage
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter salary:");
int salary=sc.nextInt();
float tdp=(salary*10)/100;
System.out.println("10% of TDS from given salary is:"+tdp);
}
}


 