class LogicalOperator 
{
	public static void main(String[] args) 
	{
		int a=10,b=23;
		boolean c=(a>b) &&(a==b);
		System.out.println(c);
		boolean d=(a>b) || (a==b);
		System.out.println(d);
		boolean e=!(a>b);
		System.out.println(e);
	}
}
