class Student
{
	private int id;
	private String name;

	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	public int getId()
	{
		return this.id;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name=name;
	}

	public void setId(int id)
	{
		this.id=id;
	}

}

class EncapsulationEx
{
	public static void main(String[] args) {

		System.out.println("main starts");
		Student s1=new Student(121,"hemant");
		System.out.println(s1.getName());
		s1.setName("amey");
		System.out.println("after setName() : "+s1.getName());
		
	}
}