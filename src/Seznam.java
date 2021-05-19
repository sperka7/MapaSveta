import java.util.ArrayList;

public class Seznam {
	private ArrayList<NPC> npccka = new ArrayList<>();
	private ArrayList<Itemy> itemy = new ArrayList<>();

	public void pridejnpc(NPC npc) {
		npccka.add(npc);
	}

	public void odstranitnpc(int index) {
		npccka.remove(index);
	}

	public void pridejitemy(Itemy itm) {
		itemy.add(itm);
	}

	public void odstranititemy(int index) {
		itemy.remove(index);
	}

	public ArrayList<NPC> getNpccka() {
		return npccka;
	}

	public void setNpccka(ArrayList<NPC> npccka) {
		this.npccka = npccka;
	}

	public ArrayList<Itemy> getItemy() {
		return itemy;
	}

	public void setItemy(ArrayList<Itemy> itemy) {
		this.itemy = itemy;
	}

	public Seznam() {
		npccka.add(new NPC("Honza", "chamtivec"));
		npccka.add(new NPC("Ludìk", "dobrák"));
		npccka.add(new NPC("Eva", "jebtiška"));
		npccka.add(new NPC("Gustav", "stará škola"));
		npccka.add(new NPC("František", "hudebník"));
		npccka.add(new NPC("Uršula", "uplakánek"));
		npccka.add(new NPC("Valentýna", "lenochod"));
		npccka.add(new NPC("Oliver", "prùzkumník"));
		npccka.add(new NPC("Lenka", "objevitelka"));
		npccka.add(new NPC("Michal", "jazykovìdec"));

		itemy.add(new Itemy("luk", "døevìný"));
		itemy.add(new Itemy("M4", "silnì opotøebovaná"));
		itemy.add(new Itemy("sekera", "vostrá"));
		itemy.add(new Itemy("flashlight", "oslepující"));
		itemy.add(new Itemy("mobil", "spláchlý"));
		itemy.add(new Itemy("tužka", "píchající"));
		itemy.add(new Itemy("šlupka", "klouzající"));
		itemy.add(new Itemy("sušenka", "lahodová"));
		itemy.add(new Itemy("rouška", "zvlhlá"));
		itemy.add(new Itemy("najf", "butterfly"));
	}

	public NPC ziskatnpc(int i) {
		return npccka.get(i);
	}

	public Itemy ziskatItemy(int i) {
		return itemy.get(i);
	}
}
