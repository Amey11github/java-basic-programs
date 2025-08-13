class DataTypeEx7
{
	public static void main(String[] args) {
		System.out.println("Min value :"+Character.MIN_VALUE);
		System.out.println("Max value :"+Character.MAX_VALUE);
		char ch1='a';
		// char ch2="abc";// String cannot be converted to char
		char ch3=237;
		System.out.println(ch3);
		// char ch4=373.88;//possible lossy conversion from double to char
		// char ch5=true;//boolean cannot be converted to char
		// char ch6=7334f;//possible lossy conversion from float to char
		char ch7='?';
		System.out.println(ch7);
		byte b=73;
		// char ch8=b;//possible lossy conversion from byte to char
		char ch9=478;
		System.out.println(ch9);
	}
}