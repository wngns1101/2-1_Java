package week_15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		int idx = 0;
		
		list.add("Java");
		list.add("Database");
		list.add("°´Ã¼ÁöÇâÇÁ·Î±×·¡¹Ö");
		
		int size = list.size();
		System.out.println("ÃÑ °´Ã¼ ¼ö : " + size);
		System.out.println();
		
		String item = list.get(2);
		System.out.println("2: " + item);
		System.out.println();
		
		for(String s : list)
			System.out.println(idx++ + " : " + s);
		
		list.remove(1);
		list.remove(1);
		System.out.println();
		
		idx = 0;
		for(String s : list)
			System.out.println(idx++ + " : " + s);
	}
}
