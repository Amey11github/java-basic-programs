interface inf1
{
	void m1();
}

interface inf2
{
	void m2();
}

class InterfaceEx implements inf1,inf2
{
	public static void main(String[] args) {
		InterfaceEx in=new InterfaceEx();
		in.m1();
		in.m2();
	}

	public void m1()
	{
		System.out.println("in m1()");
	}

	public void m2()
	{
		System.out.println("in m2()");
	}
}