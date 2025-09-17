class FindMissingEleFromArray
{
	public static void main(String[] args) {
		int arr[]={1,3,4,5,6,7,8,9,15,17,20,25,29,30};

		findMissingEle(arr);
	}

	public static void findMissingEle(int [] arr)
	{
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>max)
					max=arr[i];
			}
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<min)
					min=arr[i];
			}
		}

		

		System.out.println("max : "+max);

		System.out.println("min : "+min);
        
		for(int i=min;i<=max;i++)
		{
			boolean found=false;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==i)
				{
					found=true;
					break;
				}
			}
			if(!found)
			{
				System.out.print(i+" ");
			}
		}

	}
}