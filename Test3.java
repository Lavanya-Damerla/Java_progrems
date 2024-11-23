class Test3
{
static int i=10;
public static void main(String[] args)
{
Test3 t=new Test3();
Test3 t1=new Test3();
System.out.println(t.i);
System.out.println(t1.i);
t.i=100;
System.out.println(t.i);
System.out.println(t1.i);
}
}