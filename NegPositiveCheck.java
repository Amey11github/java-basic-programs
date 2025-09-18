class NegPositiveCheck
{
	public static void main(String[] args) {
		int no=-0;
		if(no>0)
		{
			System.out.print(no+" is positive");
		}
		else if(no<0){
			System.out.print(no+" is negative");
		}
		else{
			System.out.print(no+" is zero");
		}
	}
}