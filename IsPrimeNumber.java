class IsPrimeNumber
{
	public static void main(String[] args) {
		int no=12;
		int cnt=0;

		for(int i=2;i<=no;i++)
		{
			if(no%i==0)
			{
				cnt++;
			}
		}
		System.out.println(cnt);
		if(cnt==1)
		{
			System.out.print(no+" is Prime No");
		}
		else{
			System.out.print(no+" is not Prime No");
		}
	}
	
}