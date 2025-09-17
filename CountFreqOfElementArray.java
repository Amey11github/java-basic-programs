import java.util.Arrays;

class CountFreqOfElementArray
{
	public static void main(String[] args) {
		int [] arr={1,6,8,3,1,4,6,8,0,2,4,1,6,4,5,8,9,0,5,2,5,1};

		countFreq(arr);

		System.out.println(Arrays.toString(arr));

	}

	public static void countFreq(int [] arr)
	{
		boolean [] visited=new boolean[arr.length];

		for(int i=0;i<arr.length;i++)
		{
			if(visited[i])
				continue;
			int cnt=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && !visited[j])
				{
					cnt++;
					visited[j]=true;
				}
			}
			System.out.println(arr[i]+" : "+cnt);
		}
	}
}