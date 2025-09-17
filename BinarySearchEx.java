class BinarySearchEx
{
	public static void main(String[] args) {
		int [] arr={10,20,30,40,50,60};
		int serEle=40;

		int indx=binSearch(arr,serEle);
		System.out.println("indx : "+indx);
	}

	public static int binSearch(int [] arr,int serEle)
	{
	     int left=0;
	     int right=arr.length-1;

		while(left<=right)
		{
	     int mid=(left+right)/2;	
			if(serEle<arr[mid])
			{
				right=mid-1;
			}
			else if(serEle > arr[mid])
			{
                left=mid+1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
}