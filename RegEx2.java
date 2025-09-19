import java.util.regex.*;

class RegEx2
{
	public static void main(String[] args) {
		String pan="GDFPP6440D6y";

		Pattern pat=Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		Matcher mat=pat.matcher(pan);

		while(mat.find())
		{
			System.out.println(mat.start()+" : "+mat.end()+" : "+mat.group()+" : "+mat.groupCount());
		}

		if(mat.matches())
		{
			System.out.println("pattern matches !!");
		}
		else{
			System.out.println("pattern doesnt matched !!");
		}
	}
}