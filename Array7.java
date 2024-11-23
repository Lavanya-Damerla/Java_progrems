import java.util.Arrays;
class Array7 
{
	public static void main(String[] args) 
	{
		int[] arr={6,2,8,1,3,7,9,5};
		int element=10;
		int index=3;
		arr=Arrays.copyOf(arr,arr.length+1);
		for(int i=arr.length-1;i>=index;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[index]=element;
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}
