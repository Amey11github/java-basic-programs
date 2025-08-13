class MethodEx3
{

	public static void m1()
	{
		System.out.println("m1() static void MethodEx3");
	}

	public void m2()
	{
		System.out.println("m2() non static void MethodEx3");
	}

	
	public static void main(String[] args) {
		m1();
		MethodEx4 m4=new MethodEx4();
		m4.m1();
	}
}

class MethodEx4
{
	public void m1()
	{
       System.out.println("m1() non static void MethodEx4");
       MethodEx3.m1();
       MethodEx3 m3=new MethodEx3();
       m3.m2();
	}
}