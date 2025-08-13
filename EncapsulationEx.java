class EncapsulationEx
{
	private String name;
	private int id;
	private double salary;

	private void setData(int id,String name,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}

	public void display()
	{
		System.out.println("ID : "+id);
		System.out.println("NAME : "+name);
		System.out.println("SALARY : "+salary);
		System.out.println("-------------------------------");
	}

	public static void main(String[] args) {
		EncapsulationEx ex=new EncapsulationEx();
		ex.setData(123,"vivek",56789.9);
		EncapsulationEx2.m1(ex);
        // System.out.println("------------------------------");
		// System.out.println("Name : "+ex.name);
		// System.out.println("id : "+ex.id);
		// System.out.println("salary : "+ex.salary);
	}
}

class EncapsulationEx2
{
	public static void m1(EncapsulationEx ex)
	{
	    ex.display();
	}
}