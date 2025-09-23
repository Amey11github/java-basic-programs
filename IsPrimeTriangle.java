class IsPrimeTriangle
{
	public static void main(String[] args) {
		int num=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				while (!isPrime(num)) {
                    num++; 
                }
                System.out.print(num + " ");
                num++;
			}
			System.out.println();
		}
	}

	public static boolean isPrime(int no)
	{
		int cnt=0;
       for(int i=2;i<=no;i++)
       {
	       	if(no%i==0)
	       	{
	       		cnt++;
	       	}
       }
       if(cnt==1)
       	return true;

       return false;
	}
}