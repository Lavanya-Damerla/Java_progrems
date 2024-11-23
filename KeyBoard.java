import java.io.*;
class  KeyBoard
{
	public static void main(String[] args)throws IOException
	{
		Console c=System.console();
		System.out.println("Enter the name:");
		String name=c.readLine();
		System.out.println("HI:"+name);
	}
}
