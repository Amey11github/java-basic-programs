import java.util.regex.*;

class RegEx1
{
	public static void main(String[] args) {

		String str="2345678gd";
		Pattern pattern=Pattern.compile("[0-9]");
		Matcher matcher=pattern.matcher(str);

		while(matcher.find())
		{
			System.out.println(matcher.group());
		}
	}
}