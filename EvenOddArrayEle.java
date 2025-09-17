import java.util.Arrays;

class EvenOddArrayEle{
	public static void main(String[] args) {
		int [] arr={1,2,3,4,5,6,8,7,9};

		segEleEven(arr);

		System.out.println(Arrays.toString(arr));
	}

	public static void segEleEven(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]%2!=0)
					{
						for(int k=j;k>i;k--)
						{
							int temp=arr[k-1];
							arr[k-1]=arr[k];
							arr[k]=temp;
						}
						break;
					}
				}
			}
		}
	} 
}