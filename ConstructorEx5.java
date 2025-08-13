class ConstructorEx5
{
	ConstructorEx5()
	{
		super();
	}
	ConstructorEx5(int a)
	{
		this();
		System.out.println("ConstructorEx5(int a)");
		System.out.println("int a : "+a);
		System.out.println("-----------------------------");

	}
	ConstructorEx5(int a,String str)
	{
		this(a);
		System.out.println("ConstructorEx5(int a,String str)");
		System.out.println("int a : "+a);
		System.out.println("String str : "+str);
		System.out.println("-----------------------------");

	}
	ConstructorEx5(int a,String str,double d)
	{
		this(a,str);
		System.out.println("ConstructorEx5(int a,String str,double d)");
		System.out.println("int a : "+a);
		System.out.println("String str : "+str);
		System.out.println("double d : "+d);
		System.out.println("-----------------------------");

	}

	public static void main(String[] args) {
		ConstructorEx5 cs5=new ConstructorEx5(123,"amey",36.89);

		
	}
}