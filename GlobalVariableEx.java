class GlobalVariableEx
{
	String str;
	int a;
	double d;
	boolean b;
	byte by;
	short s;
	char c;

	public static void main(String[] args) {
	   GlobalVariableEx ge=new GlobalVariableEx();
	   System.out.println(ge.str);
	   System.out.println(ge.a);
	   System.out.println(ge.d);
	   System.out.println(ge.b);
	   System.out.println(ge.by);
	   System.out.println(ge.s);
	   System.out.println(ge.c);
	   int i=ge.c;
	   System.out.println(i); 	
	}
}