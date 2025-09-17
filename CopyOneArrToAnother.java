import java.util.Arrays;

class CopyOneArrToAnother
{
	public static void main(String[] args) {
		int arr[]={1,4,545,566,3322,245,89,4};

		int newArr[]=new int[arr.length];

		for(int i=0;i<arr.length;i++)
		{
			newArr[i]=arr[i];
		}

		System.out.println("arr : "+Arrays.toString(arr));

		System.out.println("newArr : "+Arrays.toString(newArr));
	}
}