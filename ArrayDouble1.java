import java.util.Scanner;
class ArrayDouble1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entr the number of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter the number of columns:");
		int cols=sc.nextInt();
		int sum=0;
		int sum1=0;
		int sum2=0;
		int[][] arr=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.println("Enter the elements ");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr[i][j]+arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(i==j)
				{
				sum+=arr[i][j];
				}
			}
		}
		System.out.println("Sum:"+sum);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr[i][j]*arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(i<j)
				{
					sum1+=arr[i][j];
				}
			}
		}
			System.out.println("Upper triangle:"+sum1);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(i>j)
				{
				sum2+=arr[i][j];
				}
			}
		}
		System.out.println("Lower triangle:"+sum2);
	}
}
