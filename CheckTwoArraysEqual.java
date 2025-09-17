class CheckTwoArraysEqual
{
	public static void main(String[] args) {
		int arr1[]={10,20,304,40};
		int arr2 []={10,210,567,304,40};

		System.out.println(checkEqual(arr1,arr2));
	}

	public static boolean checkEqual(int [] arr1,int [] arr2)
	{
		if(arr1.length!=arr2.length)
			return false;

		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=arr2[i])
				return false;
		}

		return true;
	}
}