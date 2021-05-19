
public class Postava {

	private String jmeno, popis;
	private Inventar i;

	public Postava(String jmeno, String popis) {
		super();
		this.jmeno = jmeno;
		this.popis = popis;
	}

	public String getJmeno() {
		return jmeno;
	}

	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}

	public String getPopis() {
		return popis;
	}

	public void setPopis(String popis) {
		this.popis = popis;
	}

	public Inventar getI() {
		return i;
	}

	public void setI(Inventar i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "jmeno postavy: = " + jmeno + ", popis postavy = " + popis;
	}

}
