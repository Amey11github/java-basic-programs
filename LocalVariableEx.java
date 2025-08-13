class LocalVariableEx
{
	static String str1="gloabal static var";
	String str2="global non static var";
	public static void main(String[] args) {
		String str="local var main()";
		System.out.println(str);
		System.out.println(LocalVariableEx.str1);
		LocalVariableEx l1=new LocalVariableEx();
		System.out.println(l1.str2);
		l1.m1();
	}
	public static void m1()
	{
		String str3="local var m1()";
		// System.out.println(str);//cannot find symbol
		System.out.println(LocalVariableEx.str1);
		LocalVariableEx l2=new LocalVariableEx();
		System.out.println(l2.str2);
	}
}