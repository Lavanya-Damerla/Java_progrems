import java.util.Arrays;
class Array5 
{
	public static void main(String[] args) 
	{
		int[] arr1={1,9,2,7,3};
		int[] arr2={4,6,5,0,8};
		int size1=arr1.length;
		int size2=arr2.length;
		
		arr1=Arrays.copyOf(arr1,size1+size2);
		int j=0;
		for(int i=size1;i<arr1.length;i++)
		{
		arr1[i]=arr2[j++];
		}
		Arrays.sort(arr1);
		for(int i:arr1)
		{
		System.out.print(i+" ");
	}
	}
}
