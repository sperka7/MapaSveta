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
		npccka.add(new NPC("Lud�k", "dobr�k"));
		npccka.add(new NPC("Eva", "jebti�ka"));
		npccka.add(new NPC("Gustav", "star� �kola"));
		npccka.add(new NPC("Franti�ek", "hudebn�k"));
		npccka.add(new NPC("Ur�ula", "uplak�nek"));
		npccka.add(new NPC("Valent�na", "lenochod"));
		npccka.add(new NPC("Oliver", "pr�zkumn�k"));
		npccka.add(new NPC("Lenka", "objevitelka"));
		npccka.add(new NPC("Michal", "jazykov�dec"));

		itemy.add(new Itemy("luk", "d�ev�n�"));
		itemy.add(new Itemy("M4", "siln� opot�ebovan�"));
		itemy.add(new Itemy("sekera", "vostr�"));
		itemy.add(new Itemy("flashlight", "oslepuj�c�"));
		itemy.add(new Itemy("mobil", "spl�chl�"));
		itemy.add(new Itemy("tu�ka", "p�chaj�c�"));
		itemy.add(new Itemy("�lupka", "klouzaj�c�"));
		itemy.add(new Itemy("su�enka", "lahodov�"));
		itemy.add(new Itemy("rou�ka", "zvlhl�"));
		itemy.add(new Itemy("najf", "butterfly"));
	}

	public NPC ziskatnpc(int i) {
		return npccka.get(i);
	}

	public Itemy ziskatItemy(int i) {
		return itemy.get(i);
	}
}
