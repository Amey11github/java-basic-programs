class FindLargest
{
	public static void main(String[] args) {
		int [] arr={10,20,50,2,59,90,45};
		int max=largest(arr);

		System.out.println(max);
	}

	public static int largest(int [] arr)
	{
		int max=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}

		return max;

	}
}