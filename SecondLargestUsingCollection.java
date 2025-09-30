import java.util.*;

class SecondLargestUsingCollection
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

		int max1=Collections.max(list);

		list.remove(Integer.valueOf(max1));

		int max2=Collections.max(list);


		System.out.println("max1 : "+max1+", max2 : "+max2); 
	}
}