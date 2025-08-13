class DataTypeEx3
{
	public static void main(String[] args) {
		System.out.println("Min value :"+Integer.MIN_VALUE);
		System.out.println("Max value :"+Integer.MAX_VALUE);

		int i1=10;
		// int i2=26378678436746;// integer number too large
		int i3='a';
		System.out.println(i3);//97
		// int i4="abc";// String cannot be converted to int
		byte b=100;
		int i5=b;
		short s=13903;
		int i6=s;
		long l=278637826l;
		// int i7=l;//possible lossy conversion from long to int
		// int i8=83.93;// possible lossy conversion from double to int
        // int i9=true;// boolean cannot be converted to int
        


	}
}