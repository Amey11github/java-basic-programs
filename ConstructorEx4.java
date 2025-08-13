class ConstructorEx4
{
	static String name;
	static int roll;
	static double perc;

	ConstructorEx4(int roll,String name,double perc)
	{
		super();
		System.out.println("Roll No : "+roll);
		System.out.println("Name : "+name);
		System.out.println("Percentage : "+perc);
	}
	public static void main(String[] args) {
		ConstructorEx4 cs4=new ConstructorEx4(123,"amey",89.76);
		System.out.println("-------------------------------------");
		System.out.println("NAME : "+name);
		System.out.println("ROLL NO : "+roll);
        System.out.println("PERCENTAGE : "+perc);		
	}
}