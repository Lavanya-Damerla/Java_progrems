import java.util.Scanner;
class Sample1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int a=10;
int b=a/2;
int i;
if(n>0)
{
for(i=1;i<=n/2;i++)
{
System.out.print(b+","+a);
if(i<n/2)
System.out.print(",");
}
}
}
}