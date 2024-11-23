import java.io.*;
class  IOProgram
{
	public static void main(String[] args)throws IOException
	{
		PrintWriter pw=new PrintWriter("ccc.txt");
		pw.write(100);
		pw.println(100);
		pw.println('a');
		pw.println(10.5d);
		pw.println(true);
		pw.println("Hi");
		pw.flush();
		pw.close();
		System.out.println("Check location");
	}
}
