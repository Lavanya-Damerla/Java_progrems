class Array3 
{
	public static void main(String[] args) 
	{
		int[] arr={5,6,3,6,2,6,1,9,4,8,7};
		//unique numbers
		/*for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==1)
			System.out.print(arr[i]+" ");
		}
	}
}

//repeated numbers
for(int i=0;i<arr.length;i++)
		{
	for(int j=i+1;j<arr.length;j++)
			{
		if(arr[i]==arr[j])
				{
			System.out.print(arr[i]+" ");
				}
			}
		}
	}
}
*/
//most repeated number
int maxCount=0;
int element=0;
for(int i=0;i<arr.length;i++)
		{
	int count=0;
	for(int j=0;j<arr.length;j++)
			{
		if(arr[i]==arr[j])
				{
			count++;
				}
			}
		if(maxCount<count)
		{
			maxCount=count;
			element=arr[i];
		}
		}
		System.out.print(element+" repeating "+maxCount+" times");
	}
}