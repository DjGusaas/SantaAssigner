package Santa;

public class Santa {
	private String name;
	private String partner;
	private String previous;
	private String future;

	public static int numberOfSantas = 0;
	
	public Santa(String startName, String startPartner, String startPrevious) {
		name = startName;
		partner = startPartner;
		previous = startPrevious;
		future = "";

		numberOfSantas++;	
	}

	public String getName() {
		return name;
	}

	public String getPartner() {
		return partner;
	}

	public String getPrevious() {
		return previous;
	}

	public String getFuture() {
		return future;
	}

	public void setFuture(String newFuture) {
		this.future = newFuture;
	}
}