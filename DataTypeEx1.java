class DataTypeEx1
{
	public static void main(String[] args) {
	  byte b1=10;
	  byte b2=-20;
	  // byte b3=128;//CTE Possible lossy conversion
	  byte b4='a';
	  System.out.println(b4);//97
	  // byte b5="abc";// String cannot be converted to byte
      // byte b6=1.2;// possible lossy conversion from double to byte
      int a=10;
      // byte b=a;//possible lossy conversion from int to byte
      // byte b=true;// boolean cannot be converted to byte
      System.out.println("Min value :"+Byte.MIN_VALUE);
      System.out.println("Max value :"+Byte.MAX_VALUE);
	}
}