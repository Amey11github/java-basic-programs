import java.util.*;

class FindLargestUsingCollection
{
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(60);
		list.add(20);
		list.add(90);
		list.add(30);
		list.add(80);
		list.add(40);
		list.add(50);

		System.out.println(Collections.max(list)); 

	}
}