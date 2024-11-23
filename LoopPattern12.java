class LoopPattern12 
{
	public static void main(String[] args) 
	{
		int num=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(num<=9)
					System.out.print(num++ +" ");
				else
					System.out.println("0");
			}
			System.out.println();
		}
	}
}
