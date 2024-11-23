import java.util.Scanner;
class Cube
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value:");
int a=sc.nextInt();
int cube=(int)Math.pow(a,3);
System.out.println("Cube of the value is:"+cube);
}
}

