import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Lokalita implements Serializable {
	private String nazev;
	private int id;
	private int[] strany = new int[4];
	private ArrayList<NPC> npcka = new ArrayList<>();
	private ArrayList<Itemy> itemyy = new ArrayList<>();
	private Random random = new Random();

	public Lokalita(int id, String nazev, int prvni, int druhy, int treti, int ctvrty) {
		super();
		this.nazev = nazev;
		this.id = id;
		strany[0] = prvni;
		strany[1] = druhy;
		strany[2] = treti;
		strany[3] = ctvrty;
	}

	public Lokalita() {
	}

	public Lokalita(int id, String nazev) {
		super();
		this.nazev = nazev;
		this.id = id;
	}

	public static Lokalita fromCsv(String csvcko) {
		String[] poleStringu = csvcko.split(",");
		return new Lokalita(Integer.valueOf(poleStringu[0]), poleStringu[1], Integer.valueOf(poleStringu[2]),
				Integer.valueOf(poleStringu[3]), Integer.valueOf(poleStringu[4]), Integer.valueOf(poleStringu[5]));
	}

	public ArrayList<Itemy> getItemyy() {
		return itemyy;
	}

	public String getNazev() {
		return nazev;
	}

	public void setNazev(String nazev) {
		this.nazev = nazev;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int[] getStrany() {
		return strany;
	}

	public void setStrany(int[] strany) {
		this.strany = strany;
	}

	public String toString() {
		return id + " " + nazev;
	}

	public int getSmer(int smer) {
		return strany[smer];
	}

	public void pridej(NPC npc) {
		npcka.add(npc);
	}

	public void odstranit(int index) {
		npcka.remove(index);
	}

	public void pridej(Itemy itemy) {
		itemyy.add(itemy);
	}

	public void odstranitItemy(int index) {
		itemyy.remove(index);
	}

	public String npcVypis() {
		String vypis = "Seznam NPC s tebou v místnosti:\n";
		for (NPC np : npcka)
			vypis += np.getJmeno() + " - " + np.getPopis() + "\n";
		return vypis;
	}

	public String itemyVypis() {
		String vypsat = "Itemy v místnosti:\n";
		for (Itemy it : itemyy)
			vypsat += it.getPojmenovani() + " - " + it.getPopis() + "\n";
		return vypsat;
	}
}
