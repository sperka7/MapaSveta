import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.SwingUtilities;

import com.sun.jdi.event.EventQueue;

public class Main {

	public static void main(String[] args)   {
		Mapa mapa = new Mapa("mapa.csv");
		Inventar i = new Inventar();
		int input=0, odebrani=0;
		boolean pravda=true;
		Scanner sc = new Scanner(System.in);
		while(pravda==true) {
			boolean prvniPravda=false, druhaPravda=false;
			System.out.println("Nacházíš se: " + mapa.poloha());
			if((mapa.getMapa().get(mapa.getAktualniPoloha()).getItemyy().size())==0) {
				System.out.println("Žádný item není v místnosti");
			}else {
			System.out.println("Chceš nìco pøidat do inventáøe? (1 - " + mapa.getMapa().get(mapa.getAktualniPoloha()).getItemyy().size() + ")");
			System.out.println("Jestli ne, tak zmáèkni vìtší èíslo, než je poèet itemù v místnosti");
			
			while(prvniPravda==false) {
				int pridat=telo(sc);
				if(pridat<1) {
					System.out.println(ZkusToZnovu());
					continue;
				}else if(pridat>0 && pridat<mapa.getMapa().get(mapa.getAktualniPoloha()).getItemyy().size()+1){
					i.add(mapa.getMapa().get(mapa.getAktualniPoloha()).getItemyy().get(pridat-1));
					System.out.println("Výpis itemù v inventáøi:");
					System.out.println(i);
					System.out.println("V inventáøi máš ještì místo pro " + (i.getVelikost() - i.getMisto()) + " itemù");
					System.out.println("Chceš nìco odebrat ze svého inventáøe? (1 - " + i.getInventar().size() + ")");
					System.out.println("Jestli ne, tak zmáèkni vìtší èíslo, než je poèet itemù v inventáøi");
					druhaPravda=false;
					while(druhaPravda==false) {
						int odebrat = telo(sc);
						if(odebrat<1) {
							System.out.println(ZkusToZnovu());
							continue;
						}else if(odebrat>i.getInventar().size()) {
							druhaPravda=true;
						}else
							i.odebrat(odebrat-1);
							druhaPravda=true;
							System.out.println("Výpis itemù v inventáøi:");
							System.out.println(i);
							System.out.println("V inventáøi máš ještì místo pro " + (i.getVelikost() - i.getMisto()) + " itemù");
							
					}
				}
				prvniPravda=true;
			}
			}
				System.out.println("Do jaké lokace se chceš pøesunout? (0 - Sever, 1 - Východ, 2 - Jih, 3 - Západ)");
				try {
				input=Integer.parseInt(sc.nextLine());
				mapa.jdiNa(input);
			} catch (Exception e) {
				// TODO Auto-generated catch block
					System.out.println(ZkusToZnovu());
			}
		}
		sc.close();
	}
	public static String ZkusToZnovu() {
		return "Trochu vedle\nZkus to znovu";
	}
	public static int telo(Scanner sc) {
		int pridat=0;
		boolean prvniPravda=false;
		while(prvniPravda==false) {
		try {
			pridat=Integer.parseInt(sc.nextLine());
			prvniPravda=true;
			
		} catch(Exception e) {
			System.out.println(ZkusToZnovu());
		}
	}
		return pridat;
		
		
		
		/*SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					MojeOkno okno = new MojeOkno();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
		
	}

}
