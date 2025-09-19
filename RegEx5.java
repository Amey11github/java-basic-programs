import java.util.regex.*;

class RegEx5
{
	public static void main(String[] args) {
		String str="java from hello world java 89080 98776";

		Pattern pat=Pattern.compile("\\S+");
		Matcher mat=pat.matcher(str);

		while(mat.find())
		{
			System.out.println(mat.start()+" : "+mat.end()+" : "+mat.group());
		}
	}
}