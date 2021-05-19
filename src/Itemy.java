
public class Itemy {

	private String pojmenovani, popis;

	public Itemy(String pojmenovani, String popis) {
		this.pojmenovani = pojmenovani;
		this.popis = popis;
	}

	public String getPojmenovani() {
		return pojmenovani;
	}

	public void setPojmenovani(String pojmenovani) {
		this.pojmenovani = pojmenovani;
	}

	public String getPopis() {
		return popis;
	}

	public void setpopis(String popis) {
		this.popis = popis;
	}

	public String toString() {
		return "název: " + pojmenovani + " popis: " + popis;
	}

}
