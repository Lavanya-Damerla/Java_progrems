class ArrayDouble2 
{
	public static void main(String[] args) 
	{
		//caller method
		sumOfElements(new int[]{10,20,30,40,50});
	}
	public ststic void sumOfElements(int[] arr)
	{
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
}
