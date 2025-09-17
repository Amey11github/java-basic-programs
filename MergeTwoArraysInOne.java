import java.util.Arrays;

class MergeTwoArraysInOne
{
	public static void main(String[] args) {
		int arr1[]={10,20,304,40};
		int arr2 []={90,67,45,39};

		int opArr[]=new int[arr1.length+arr2.length];

		for(int i=0;i<arr1.length;i++)
		{
			opArr[i]=arr1[i];
		}
		for(int j=0;j<arr2.length;j++)
			{
				opArr[arr1.length+j]=arr2[j];
			}

		System.out.println(Arrays.toString(opArr));
	}
}