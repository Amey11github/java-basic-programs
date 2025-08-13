class DataTypeEx9
{
	public static void main(String[] args) {
		// String str1='a';//char cannot be converted to String
		String str2="abc hello";
		// String str3=1233;//int cannot be converted to String
		String str4=34567890+"";
		// String str5=true;//boolean cannot be  converted to String
		// String str6=567890f;//float cannot be converted to String
		String str7="abc";
		String str8="hello";
        String str9=str8+str7+567;
        System.out.println(str9);
	}
}