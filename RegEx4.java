import java.util.regex.*;

class RegEx4
{
	public static void main(String[] args) {
		String str="dfhd fvjnh vjnvh vjnvh";

		Pattern pat=Pattern.compile("\s");
		Matcher mat=pat.matcher(str);

		int cnt=0;

		while(mat.find())
		{
            cnt++;
		}

		System.out.println(cnt);
	}
}