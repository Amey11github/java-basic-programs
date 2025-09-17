import java.util.Arrays;

class AntiClockWiseRotation
{
	public static void main(String[] args) {
		int [] arr={10,20,30,40,50,60};

		antiClockRotate(arr,2);

		System.out.println(Arrays.toString(arr));
	}

	public static void antiClockRotate(int [] arr, int rot)
	{
		for(int i=0;i<rot;i++)
		{
			int temp=arr[arr.length-1];
			{
				for(int j=arr.length-1;j>0;j--)
				{
					arr[j]=arr[j-1];
				}
				arr[0]=temp;
			}
		}
	}
}