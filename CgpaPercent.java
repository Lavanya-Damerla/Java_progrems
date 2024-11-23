import java.util.Scanner;
class CgpaPercent
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter CGPA :");
float cgpa=sc.nextFloat();
float percentage=cgpa*9.3f;
System.out.println("CGPA to percentage is:"+percentage);
}
}