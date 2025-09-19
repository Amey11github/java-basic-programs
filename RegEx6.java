import java.util.regex.*;

class RegEx6
{
	public static void main(String[] args) {
		String str="11-10-2003";

		Pattern pat=Pattern.compile("[0-9]{2}-[0-9]{2}-[0-9]{4}");
		Matcher mat=pat.matcher(str);

		while(mat.find())
		{
			System.out.println(mat.group());
		}


	}
}