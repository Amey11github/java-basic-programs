class FactorialEx
{
	public static void main(String[] args) {
		int no=5;

		System.out.println(factorial(no));
	}

	public static int factorial(int no)
	{
		int fact=1;
		for(int i=1;i<=no;i++)
		{
               fact*=i;
		}

		return fact;
	}
}