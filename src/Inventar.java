import java.util.ArrayList;

public class Inventar {
	private ArrayList<Itemy> inventar = new ArrayList<>();
	private int misto = 0, velikost = 10;

	public ArrayList<Itemy> getInventar() {
		return inventar;
	}

	public void setInventar(ArrayList<Itemy> inventar) {
		this.inventar = inventar;
	}

	public int getMisto() {
		return misto;
	}

	public int getVelikost() {
		return velikost;
	}

	public void add(Itemy i) {
		misto++;
		inventar.add(i);
	}

	public void odebrat(int i) {
		misto--;
		inventar.remove(i);
	}

	@Override
	public String toString() {
		return "Inventar [inventar=" + inventar + "]";
	}

}