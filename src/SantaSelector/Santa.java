package SantaSelector;

import java.util.ArrayList;
import java.util.Random;

public class Santa {
	private String name;
	private String partner;
	private String previous;
	private String giftee;

	public static ArrayList<Santa> group = new ArrayList<Santa>();
	
	public Santa(String name, String partner, String previous) {
		this.name = name;
		this.partner = partner;
		this.previous = previous;
		this.giftee = "";

		group.add(this);
	}
	
	///////////////////////////
	/// Getters and Setters ///
	///////////////////////////
	
	public String getName() {
		return this.name;
	}
	
	public String getPartner() {
		return this.partner;
	}
	
	public String getPrevious() {
		return this.previous;
	}
	
	public String getGiftee() {
		return this.giftee;
	}
	
	public void setGiftee(String s) {
		this.giftee = s;
	}
	
	//////////////////////////////
	/// Santa helper functions ///
	//////////////////////////////
	
	public void printSanta(Santa s) {
		System.out.println(s.getName() + " gifts: " + s.getGiftee());
	}
	
	public void printGroup(ArrayList<Santa> g) {
		for (Santa s : g) {
			printSanta(s);
		}
	}
	
	/////////////////////
	/// Random Search ///
	/////////////////////
	
	public static ArrayList<Santa> randomSelector() {
		ArrayList<Santa> work = deepClone(group);
		ArrayList<Santa> output = new ArrayList<Santa>();
		
		for (Santa s : work) {
			if (hasPotentialGiftee(s, work)) {
				findRandom(s, work);
				output.add(s);
			} else {
				randomSelector();
			}
		}
		return output;
	}
	
	public static Santa findRandom(Santa s, ArrayList<Santa> a) {
		Random rand = new Random();
		
		while(s.getGiftee() == "") {
			String attempt = a.get(rand.nextInt(a.size())).getName();
			if (attempt != s.getPartner() && attempt != s.getPrevious()) {
				s.setGiftee(attempt);
			}
		}
		return s;
	}

	///////////////////////////////
	/// Search helper functions ///
	///////////////////////////////
	
	public static boolean hasPotentialGiftee(Santa s, ArrayList<Santa> a) {
		// TODO
		return false;
	}
	
	public static ArrayList<Santa> deepClone(ArrayList<Santa> input) {
		ArrayList<Santa> output = new ArrayList<Santa>();
		
		for (Santa s : input) {
			output.add(s);
		}
		return output;
	}
}