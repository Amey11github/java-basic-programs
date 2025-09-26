class Ex
{
	static{
		System.out.println("static block starts");
        m1();
		System.out.println("static block ends");
	}
	public static void main(String[] args) {
		System.out.println(" main starts");
        m1();
        System.out.println("main ends");
	}

	public static void m1()
	{
		System.out.println("m1() static");
	}
}