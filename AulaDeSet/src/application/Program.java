package application;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new LinkedHashSet<>();
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");

		// System.out.println(set.contains("Notebook"));
		// set.remove("Tablet");
		// "->" significa tal que
		// Remove todos que tem mais de 3 caracteres no nome
		// set.removeIf(x -> x.length() >= 3 );
		// Remove todas as palavras que tem a leta T como inicial
		set.removeIf(x -> x.charAt(0) == 'T');

		for (String p : set) {
			System.out.println(p);
		}

		///////////////////////// Continuação da aula\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		// union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		// intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		// difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}

}
