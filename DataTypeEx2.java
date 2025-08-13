class DataTypeEx2
{
	public static void main(String[] args) {
		System.out.println("Min value :"+Short.MIN_VALUE);
		System.out.println("Max value :"+Short.MAX_VALUE);

		short s1=12345;
		short s2=-24848;
		// short s3=6876987;// possible lossy conversion from int to short
        short s4='a';
        System.out.println(s4);//97
        // short s5="abc";// String cannot be converted to short
        // short s6=true;// boolean cannot be converted to short
        int a=10;
        // short s7=a;//possible lossy conversion from int to short
        // short s8=1.97;//possible lossy conversion from double to short
        byte b=109;
        short s9=b;
	}
}