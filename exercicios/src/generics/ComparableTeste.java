package generics;

import java.util.TreeSet;

public class ComparableTeste {

	public static void main(String[] args) {
		
		TreeSet<Integer> numbs = new TreeSet<>();
		
		numbs.add(10);
		numbs.add(1);
		numbs.add(3);
		numbs.add(6);
		numbs.add(8);
		numbs.add(9);
		numbs.add(123);
		numbs.add(-13);
		
		for(Integer n : numbs) {
			System.out.println(n);
		}
		
	}
}
