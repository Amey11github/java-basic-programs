abstract class abs1
{
	public abstract void m1();
	public abstract void m2();
}

class AbstractionEx
{
	public static void main(String[] args) {
		System.out.println("main starts ");
		AbstractionEx ae=new AbstractionEx();
		ae.m1();
		ae.m2();
		System.out.println("main ends ");

	}

	public void m1()
	{
		System.out.println("in m1() ");
	}

	public void m2(){
		System.out.println("in m2() ");
	}
}