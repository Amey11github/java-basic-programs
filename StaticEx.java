class StaticEx
{
	static String str;
	static int a;
	// str="hello world";//CTE
	static{
		str="hello";
	}

	public static void m1()
	{
		System.out.println("static m1()");
	}

	public void m2()
	{
		System.out.println("non-static m2()");
	}

	public static void main(String[] args) {
		System.out.println(StaticEx.str);
		System.out.println(StaticEx.a);
		StaticEx.m1();
		// m2();//method m2() cannot be referenced from a static context
		StaticEx s1=new StaticEx();
		s1.m2();
	}
}