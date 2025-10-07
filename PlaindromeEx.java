class PlaindromeEx
{
	public static void main(String[] args) {
		String str="amarama";

		if(isPalindrome(str))
			System.out.println("String is palindrome");
		else{
			System.out.println("String is not palindrome");
		}
	}

	public static boolean isPalindrome(String str)
	{
		int start=0;
		int end=str.length()-1;

		for(int i=0;i<str.length();i++)
		{
			if(!(str.charAt(start++)==str.charAt(end--)))
			return false;
		}


		return true;
	}
}