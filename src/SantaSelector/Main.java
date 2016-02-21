package SantaSelector;

import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		Santa Susan = new Santa("Susan", "'Bob", "Jon");
		Santa Bob = new Santa("Bob", "Susan", "Steve");
		Santa Steve = new Santa("Steve", "", "Pat");
		Santa Jon = new Santa("Jon", "", "Susan");
		
//		Santa.randomSelector();
//		ArrayList<Santa> test = new ArrayList<Santa>();
//		test.add(Susan);
//		ArrayList<Santa> copy = Santa.deepClone(test);
//		System.out.println((copy.get(0)).getName());
		
		ArrayList<Santa> test= Santa.randomSelector();
		
		System.out.println(test.get(0).getGiftee());
	}
}