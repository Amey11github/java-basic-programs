import java.util.Arrays;

class ClockwiseRotation
{
	public static void main(String[] args) {
		int [] arr={10,20,30,40,50,60};

		clockRotate(arr,2);

		System.out.println(Arrays.toString(arr));

	}
	public static void clockRotate(int arr[] , int rot)
	{
			for(int i=0;i<rot;i++)
			{
				int temp=arr[0];
				for(int j=1;j<arr.length;j++)
				{
					arr[j-1]=arr[j];
				}
				arr[arr.length-1]=temp;
			}
	}
}