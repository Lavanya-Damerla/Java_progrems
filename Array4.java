class Array4 
{
	public static void main(String[] args) 
	{
		int[] arr={1,0,0,1,1,1,0,1,0,0,0};
		int[] newArray=new int[arr.length];
		int j=0;
		for(int i:arr)
		{
			if(i==0)
			{
				newArray[j++]=i;
			}
		}
		while(j<arr.length)
		{
			newArray[j++]=1;
		}
		for(int k:newArray)
		{
			System.out.print(k+" ");
		}
	}
}