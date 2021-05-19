import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Mapa implements Serializable {
	private int zacatek = 10;
	private int aktualniPoloha = zacatek;
	private HashMap<Integer, Lokalita> mapa = new HashMap<>();
	private Random random = new Random();
	private ArrayList<Integer> duplikatyNPC = new ArrayList<>();
	private ArrayList<Integer> duplikatyItemy = new ArrayList<>();

	public ArrayList<Integer> getDuplikatyItemy() {
		return duplikatyItemy;
	}

	public int getZacatek() {
		return zacatek;
	}

	public void setZacatek(int zacatek) {
		this.zacatek = zacatek;
	}

	public int getAktualniPoloha() {
		return aktualniPoloha;
	}

	public Mapa(String soubor) {
		try {
			nacti(soubor);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Mapa nacti(String soubor) throws IOException {
		Seznam seznam = new Seznam();
		BufferedReader br = new BufferedReader(new FileReader(soubor));
		String radek = null;
		int nvm = 0;
		int prvniNahoda = 0;
		int konecna = random.nextInt(10);
		try {
			while ((radek = br.readLine()) != null) {
				mapa.put(nvm, Lokalita.fromCsv(radek));
				for (int i = 0; i < konecna; i++) {
					boolean pravda = false;
					while (pravda == false) {
						prvniNahoda = random.nextInt(10);
						prvniNahoda = random.nextInt(10);
						if (!duplikatyItemy.contains(prvniNahoda) || !duplikatyNPC.contains(prvniNahoda))
							pravda = true;
					}
					mapa.get(nvm).pridej(seznam.ziskatItemy(prvniNahoda));
					mapa.get(nvm).pridej(seznam.ziskatnpc(prvniNahoda));
					duplikatyNPC.add(prvniNahoda);
					duplikatyItemy.add(prvniNahoda);
				}
				konecna = random.nextInt(10);
				duplikatyNPC.clear();
				duplikatyItemy.clear();
				nvm++;

			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return this;
	}

	public String poloha() {
		return mapa.get(aktualniPoloha).getNazev() + "\n" + mapa.get(aktualniPoloha).npcVypis() + "\n"
				+ mapa.get(aktualniPoloha).itemyVypis();
	}

	public void jdiNa(int n) throws Exception {
		if (n > 3) {
			throw new Exception("nelze, zkus to znovu");

		}
		if ((mapa.get(aktualniPoloha).getSmer(n) == -1)) {
			throw new Exception("nelze, zkus to znovu");
		}

		aktualniPoloha = mapa.get(aktualniPoloha).getSmer(n);

	}

	public HashMap<Integer, Lokalita> getMapa() {
		return mapa;
	}

	public void setMapa(HashMap<Integer, Lokalita> mapa) {
		this.mapa = mapa;
	}

}