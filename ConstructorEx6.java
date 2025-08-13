class ConstructorEx6
{
	ConstructorEx6(int a)
	{
		System.out.println("a ConstructorEx6 : "+a);
	}
	ConstructorEx6(String str)
	{
		System.out.println("str : "+str);
	}
	ConstructorEx6(int a,String str)
	{
		this(str);
		System.out.println("str :"+str);
		System.out.println("a : "+a);
		System.out.println("-----------------------------");

	}
	public static void main(String[] args) {
		ConstructorEx6 cs6=new ConstructorEx6(123,"amey");

		ConstructorEx7 cs71=new ConstructorEx7(1902);
	}
}

class ConstructorEx7 extends ConstructorEx6
{
	ConstructorEx7(int a)
	{
		super(a);
		System.out.println("-------------------");
		System.out.println("a ConstructorEx7: "+a);
		
	}
	
}