class LinearSearchArray
{
	public static void main(String[] args) {
		int [] arr={10,50,20,30,60,90,80,70};
		int serEle=10;

		int indx=linearSearch(arr,serEle);
		System.out.println(indx);
	}

	public static int linearSearch(int [] arr,int serEle)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==serEle)
				return i;
		}
		return -1;
	}
}