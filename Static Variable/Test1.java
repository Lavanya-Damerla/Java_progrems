class Test1
{
int i=10;
static int j=20;
boolean b;
public static void main(String[] args)
{
int k=30;
Test1 t=new Test1();
t.i=100;
System.out.println(t.i);
System.out.println(t.b);
System.out.println(j);
System.out.println(k);
t.m1();
t.m2();
}
public static void m1()
{
int i=40;
System.out.println(i);
}
public void m2()
{
int a=50;
int b=50;
int c=a+b;
System.out.println(c);
}
}
