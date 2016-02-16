package SantaSelector;

public class Main {
	public static void main(String args[]) {
		Santa Susan = new Santa("Susan", "'Bob", "Jon");
		Santa Bob = new Santa("Bob", "Susan", "Steve");
		Santa Steve = new Santa("Steve", "", "");
		Santa Jon = new Santa("Jon", "", "Susan");
		
		Santa.randomSelector();
	}
}