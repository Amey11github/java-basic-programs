class FibonacciSeries
{
	public static void main(String[] args) {
		int no=8;
		int a=0,b=1;

		System.out.print("fib series : "+a+" "+b+" ");

		for(int i=2;i<=no;i++)
		{
			System.out.print(a+" ");
			int next=a+b;
			a=b;
			b=next;

		}
	}
}