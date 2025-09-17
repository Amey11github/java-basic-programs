class MinEleArray
{
	public static void main(String[] args) {
		int [] arr={10,40,12,45,5,20,9,60,89,100};

		int min=findMin(arr);
		System.out.print(min);
	}

	public static int findMin(int [] arr)
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		return min;
	}
}