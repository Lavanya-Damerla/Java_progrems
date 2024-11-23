import java.util.Scanner;
class Student{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks:");
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
int m4=sc.nextInt();
int m5=sc.nextInt();
int m6=sc.nextInt();
int total=m1+m2+m3+m4+m5+m6;
System.out.println("total marks is:"+total);
int average=total/6;
System.out.println("average"+average);
}
}
