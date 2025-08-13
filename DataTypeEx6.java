class DataTypeEx6
{
	public static void main(String[] args) {
		System.out.println("Min value :"+Double.MIN_VALUE);
		System.out.println("Max value :"+Double.MAX_VALUE);

		double d1=966578765453567890987654567876543224567897654345678990987654567890.5678987654356789087656467890;
		// double d2=56789056789;// integer number too large
		// double d3=true;// boolean cannot be converted to double
		double d4=35467890f;
		double d5='a';
		System.out.println(d5);//97.0
		// double d6="abc";// String cannot be converted to double
		double d7=4567;
		double d8=4567l;
		System.out.println(d7);//4567.0
		System.out.println(d8);//4567.0
		


	}
}