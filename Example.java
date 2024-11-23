class Example
{
//instance variable
int i;
//instance method
{
i=10;
System.out.println(i);
}
//static variable
static int j=20;
//static block
static
{
System.out.println(j);
}
public static void main(String[] args)
{
Example e=new Example();
int a=30;//instance variable
//instance block
{
System.out.println(a);
}
Example e1=new Example();
}
}
