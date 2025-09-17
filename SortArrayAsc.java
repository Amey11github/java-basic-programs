import java.util.Arrays;

class SortArrayAsc
{
   public static void main(String[] args) {
   	int arr[] ={30,90,20,10,40,2,51};

   	sortArr(arr);

   	System.out.println(Arrays.toString(arr));
   }

   public static void sortArr(int [] arr)
   {
   	for(int i=0;i<arr.length;i++)
   	{
   		for(int j=i+1;j<arr.length;j++)
   		{
   			if(arr[i]>arr[j])
   			{
   				int temp=arr[i];
   				arr[i]=arr[j];
   				arr[j]=temp;
   			}
   		}
   	}
   }
	
}