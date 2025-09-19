import java.util.regex.*;

class RegEx3
{
  public static void main(String[] args) {
  	String str="shdbgcuygrhnexmdqcuifbrhxnedjjmixicurciedxocuvhbcjxnch";
  		Pattern pat=Pattern.compile("[^AEIOUaeiou]");
  		Matcher mat=pat.matcher(str);

  		System.out.println(str.length());

  		int cnt=0;

  		while(mat.find())
  		{
  			cnt++;
  		}

  		System.out.println(cnt);

  	}	
}