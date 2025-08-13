class StaticEx2
{
	static int a=10;
	public static void m1()
	{
		System.out.println("static m1()");
	}

	public void m2()
	{
		System.out.println("non-static m2()");
		m3();
	}

	public static void m3()
	{
		System.out.println("static m3()");
		m1();
	}
	public static void main(String[] args) {
		StaticEx2 se2=new StaticEx2();
		se2.m2();
	}
}