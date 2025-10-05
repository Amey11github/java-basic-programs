package basicsjava;

public class FrequencyStringCharacters {
   public static void main(String[] args) {
	  String str="dhgbgbiyfugbuifbyfbgyfguribfgewfcgbgbcgfyrgfucfyurifncgyugfb";
	  
	  boolean []track=new boolean[str.length()];
	  
	  for(int i=0;i<str.length();i++)
	  {
		  int cnt=0;
		  for(int j=i;j<str.length();j++)
		  {
			  if(str.charAt(i)==str.charAt(j) && !track[j])
			  {
				  cnt++;
				  track[j]=true;
			  }
		  }
		  if(cnt>0)
		  {
			  System.out.println(str.charAt(i)+" : "+cnt);
		  }
	  }
}
}
