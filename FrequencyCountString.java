package basicsjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCountString {
    public static void main(String[] args) {
		String str="sdfjkbgrchruifcfgbyugbwybfyefcvrgfvrfucbybfgfef";
		List<Character> list=new ArrayList<>();
		for(char ch : str.toCharArray())
		{
			list.add(ch);
		}
		
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(Character ch1 : list)
		{
			map.put(ch1,Collections.frequency(list, ch1));
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}
}
