import java.util.regex.*;

class RegEx7
{
	public static void main(String[] args) {
		String str="aabaabhhdbhdbhcddbcdbggyuaajkvnhfjbfvjbaaajkdgvfbgvfaaaaahjbgvbgvfyvfguvfygadhbgybcgn";

		Pattern pat=Pattern.compile("(.)\\1");
		Matcher mat=pat.matcher(str);

		while(mat.find())
		{
			System.out.println(mat.group());
		}
	}
}