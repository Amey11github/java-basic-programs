class DataTypeEx5
{
	public static void main(String[] args) {
		System.out.println("Min value :"+Float.MIN_VALUE);
		System.out.println("Max value :"+Float.MAX_VALUE);

		// float f1=123.56;//possible lossy conversion from double to float\
		float f2=344.577f;
		float f3='a';
		System.out.println(f3);//97.0
		// float f4="abc";//String cannot be converted to float
		// float f5=true;//boolean cannot be converted to float
		double d=123.556;
		// float f6=d;//possible lossy conversion from double to float
		int a=10;
		float f7=a;
		System.out.println(f7);//10.0
		long l=23484l;
		float f8=l;
		System.out.println(f8);//23484.0

		

	}
}