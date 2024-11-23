class Array6 
{
	public static void main(String[] args) 
	{
		int[] arr={4,3,2,5,8,9,2,6};
		int[] newArr=new int[arr.length-1];
		int element=2;
		int count=0,j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element && count==0)
			{
				count++;
				continue;
			}
			newArr[j++]=arr[i];
		}
		for(int i:newArr)
		{
			System.out.print(i+" ");
		}
	}
}
