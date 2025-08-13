class DataTypeEx4
{
	public static void main(String[] args) {
		System.out.println("Min value :"+Long.MIN_VALUE);
		System.out.println("Max value :"+Long.MAX_VALUE);

		// long l1=57363765376787356778567;// integer number too large
		long l2=-133821478474898347l;
		// long l3=781267846746744674;// integer number too large
		long l4='a';
		// long l5="abc";// String cannot be converted to long
		// long l6=true;// boolean cannot be converted to long
		// long l7=1.77878;// possible lossy conversion from double to long
		int i=390849040;
		long l8=i;
		double d=293.394;
		// long l9=d;//possible lossy conversion from double to long
	}
}