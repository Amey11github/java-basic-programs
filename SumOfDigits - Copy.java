class SumOfDigits
{
	public static void main(String[] args) {
		int no=3344;
		int sum=0;

		while(no!=0)
		{
            sum+=(no%10);
            no=no/10;
		}

		System.out.println(sum);
	}
}