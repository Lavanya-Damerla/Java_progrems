class ArrayE 
{
	public static void main(String[] args) 
	{
		int[] arr={6,9,3,8,2,1,5};
		int firstElement=Integer.MIN_VALUE;
		int secondElement=Integer.MIN_VALUE;
		int thirdElement=Integer.MIN_VALUE;
		for(int i:arr)
		{
			if(i>firstElement)
			{
				thirdElement=secondElement;
				secondElement=firstElement;
				firstElement=i;
			}
				else if(i>secondElement)
				{
					thirdElement=secondElement;
					secondElement=i;
				}
		}
		System.out.println(secondElement);
					
		}
			
}
