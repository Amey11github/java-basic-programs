class SecondLargestInArray
{
	public static void main(String[] args) {
		int [] arr={10,50,20,30,40,60,90,120,12};

		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max2 && arr[i])
			{
				max2=arr[i];
			}

			if(arr[i]>max2)
			{
				max1=max2;
				max2=arr[i];
			}
		}

		System.out.println("max1 : "+max1);
		System.out.println("max2 : "+max2);
	}
}