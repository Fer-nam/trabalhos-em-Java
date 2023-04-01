package arranjo;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		list.add("Fernando");
		list.add("Maria");
		list.add("Jose");
		
		for(String x: list) {
			System.out.println((x));
		}
	}

}
