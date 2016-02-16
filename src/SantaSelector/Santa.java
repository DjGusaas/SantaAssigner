package SantaSelector;

import java.util.ArrayList;
import java.util.Random;

public class Santa {
	private String name;
	private String partner;
	private String previous;
	private String future;

	public static ArrayList<Santa> group = new ArrayList<Santa>();
	
	public Santa(String name, String partner, String previous) {
		this.name = name;
		this.partner = partner;
		this.previous = previous;
		this.future = "";

		group.add(this);
	}
	
	public static ArrayList<Santa> randomSelector() {
		ArrayList<Santa> temp = new ArrayList<Santa>();
		
		for (Santa s : group) {
			if (s.hasValidRecipient()) {
				findRandom(s);
				temp.add(s);
			} else {
				// TODO 
			}
		}
		return temp;
	}

	public boolean hasValidRecipient() {
		// TODO
		return false;
	}

	public static Santa findRandom(Santa s) {
		Random rand;
		// TODO
		return s;
	}	
}