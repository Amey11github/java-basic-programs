class BinSearchRecurssion
{
	public static void main(String[] args) {
		int arr[]={10,20,30,40,50,60,70};
		int key=50;

		int indx=binSearch(arr,key,0,arr.length-1,0);
		System.out.println(indx);

	}

	public static int binSearch(int arr[],int key,int start,int end,int mid)
	{
       if(start>end) return -1;

       mid=(start+end)/2;

       if(key<arr[mid]){
			end=mid-1;
		}
		else if(key>arr[mid])
		{
			start=mid+1;
		}
		else 
			return mid;

		return binSearch(arr,key,start,end,mid);
	}
}