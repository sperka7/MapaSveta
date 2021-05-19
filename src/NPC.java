
public class NPC {
private String jmeno, popis;


public NPC(String jmeno, String popis) {
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

@Override
public String toString() {
	return "jmeno: " + jmeno + " popis: " + popis;
}
}
