class Swap2noWithoutUsing3rdVar
{
	public static void main(String[] args) {
		int a=90;
		int b=68;

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}