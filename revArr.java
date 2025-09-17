class revArr
{
	public static void main(String[] args) {
		int [] arr={10,20,30,40,50};

		revArr(arr);
	}

	public static void revArr(int [] arr)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
