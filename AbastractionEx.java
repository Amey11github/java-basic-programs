abstract class AbstractEx
{
	public abstract void m1();

	public abstract void m2();

}

class AbastractionEx extends AbstractEx
{
	public static void main(String[] args) {
		AbastractionEx ae=new AbastractionEx();
		System.out.println("main starts");
		ae.m1();
		ae.m2();
		System.out.println("main ends");
	}

	public void m1()
	{
		System.out.println("m1() implemented by AbastractionEx");
	}
	
	public void m2()
	{
		System.out.println("m2() implemented by AbastractionEx");
	}
}