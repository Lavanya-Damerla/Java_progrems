class Array8 
{
	public static void main(String[] args) 
	{
		int[] arr={4,3,20,8,65,8,23};
		if(arr[0]>arr[1])
		{
			System.out.print(arr[0]+" ");
		}
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
			{
				System.out.print(arr[i]+" ");
			}
		}
		if(arr[arr.length-1]>arr[arr.length-2])
		{
			System.out.print(arr[arr.length-1]+" ");
		}
	}
}
