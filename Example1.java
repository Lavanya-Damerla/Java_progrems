class Example1
{
//instance variable
int a;
//instance block
{
int a=10;
System.out.println(a);
}
//static variable
static int b;
//static block
static
{
int b=20;
System.out.println(b);

}
public static void main(String[] args)
{
Example1 e=new Example1();
int c=30;
float f=c;
{
System.out.println(f);
}
int i=140;
char ch=(char)i;
System.out.println(ch);cls
}
}