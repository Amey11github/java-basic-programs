class MaxEleArray
{
	public static void main(String[] args) {
		int arr[]={30,20,10,40,90,60};

		int max=findMax(arr);
		System.out.println(max);
	}

	public static int findMax(int [] arr)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];

		}
		return max;
	}
}