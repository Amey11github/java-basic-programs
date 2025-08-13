class StaticEx3
{
	public static void m1()
	{
		System.out.println("m1() static ");
		StaticEx3 st=new StaticEx3();
		st.m2();
	}

	public void m2()
	{
		System.out.println("non static m2()");
	}

	public static void m3()
	{
		System.out.println("static m3()");
		m1();
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		StaticEx3.m3();
		System.out.println("main ends");
	}
}