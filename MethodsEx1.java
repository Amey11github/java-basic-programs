class MethodsEx1
{
	public void m1()
	{
		System.out.println("m1() void");
		int val=m2();
		System.out.println("val : "+val);
	}

	public int m2()
	{
		System.out.println("m1() int");
		return 29;
	}

	public static char m3()
	{
		System.out.println("m3() char");
		MethodsEx1 m1=new MethodsEx1();
		m1.m1();
		return 'a';
	}

	public static void main(String[] args) {
		System.out.println("main starts");
		char ch1=MethodsEx1.m3();
		System.out.println("ch1 : "+ch1);
		System.out.println("main ends");
	}
}