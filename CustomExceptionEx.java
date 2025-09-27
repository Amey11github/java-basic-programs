class MyCustomException extends RuntimeException
{
	
	MyCustomException(String str)
	{
		super(str);
	}
}

class CustomExceptionEx
{
	public static void main(String[] args) {

		int age=27;

		if(age<18)
			throw new MyCustomException("you are not adult !!");
		else
			System.out.println("hello, adult !!");
		
	}
}