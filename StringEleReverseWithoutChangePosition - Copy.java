class StringEleReverseWithoutChangePosition
{
	public static void main(String[] args) {
		String str = "I love india qspider and studying from shrikant sir";
		String [] wArr=str.split(" ");
		String op="";

		for(int i=0;i<wArr.length;i++)
		{
			op+=reverse(wArr[i]);
			op+=" ";
		}

		System.out.println(op);
	}

	public static String reverse(String str)
	{
		String s1="";
        for(int i=str.length()-1;i>=0;i--)
        {
        	s1+=str.charAt(i);
        }
        return s1;
	}
}