import java.util.*;

class MapEx
{
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"amey");
		map.put(2,"piyush");
		map.put(3,"vivek");
		map.put(4,"hemant");
		map.put(5,"rajesh");

		System.out.println(map.keySet()+" : "+map.values());

		for(Map.Entry<Integer,String> ent : map.entrySet())
		{
			System.out.println(ent);
		}

	}
}