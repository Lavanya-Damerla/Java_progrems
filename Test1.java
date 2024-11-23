class Test1
{
//instance variable
int i=10;
public static void main(String[] args)
{
Test1 t=new Test1();
Test1 t1=new Test1();
System.out.println(t.i);
System.out.println(t1.i);
t.i=100;
System.out.println(t.i);
System.out.println(t1.i);
}
}