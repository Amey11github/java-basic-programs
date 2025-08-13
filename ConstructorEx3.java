class ConstructorEx3
{
	String name;
	int roll;
	double perc;

	ConstructorEx3(int roll,String name,double perc)
	{
		super();
		this.name=name;
		this.roll=roll;
		this.perc=perc;

	}
	public static void main(String[] args) {
		ConstructorEx3 cs3=new ConstructorEx3(123,"amey",89.89);
		System.out.println("Name : "+cs3.name);
		System.out.println("Roll No :"+cs3.roll);
		System.out.println("Percentage :"+cs3.perc);
	
	}
}