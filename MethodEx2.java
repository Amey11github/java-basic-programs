class MethodEx2
{
	public int add(int a,int b)
	{
		System.out.println("add()");

		return a+b;
	}

	public double div(double a,double b)
	{
		System.out.println("div()");
		return a/b;
	}

	public static int finAns(int a,double d)
	{
		System.out.println("finAns()");
		return a+(int)d;
	}

	public static void main(String[] args) {
		System.out.println("main starts ");
		MethodEx2 m=new MethodEx2();
		int add1=m.add(11,12);
		System.out.println(add1);
		double div1=m.div(12.9,4.6);
		System.out.println(div1);
		System.out.println(finAns(add1,div1));
		System.out.println("main ends");
	}
}