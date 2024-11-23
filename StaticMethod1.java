class StaticMethod1
{
//static variable
static int i;
//static method
static
{
i=100;
}
public static void main(String[] args)
{
System.out.println(i);
}
}