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
			System.out.println("Nach�z� se: " + mapa.poloha());
			if((mapa.getMapa().get(mapa.getAktualniPoloha()).getItemyy().size())==0) {
				System.out.println("��dn� item nen� v m�stnosti");
			}else {
			System.out.println("Chce� n�co p�idat do invent��e? (1 - " + mapa.getMapa().get(mapa.getAktualniPoloha()).getItemyy().size() + ")");
			System.out.println("Jestli ne, tak zm��kni v�t�� ��slo, ne� je po�et item� v m�stnosti");
			
			while(prvniPravda==false) {
				int pridat=telo(sc);
				if(pridat<1) {
					System.out.println(ZkusToZnovu());
					continue;
				}else if(pridat>0 && pridat<mapa.getMapa().get(mapa.getAktualniPoloha()).getItemyy().size()+1){
					i.add(mapa.getMapa().get(mapa.getAktualniPoloha()).getItemyy().get(pridat-1));
					System.out.println("V�pis item� v invent��i:");
					System.out.println(i);
					System.out.println("V invent��i m� je�t� m�sto pro " + (i.getVelikost() - i.getMisto()) + " item�");
					System.out.println("Chce� n�co odebrat ze sv�ho invent��e? (1 - " + i.getInventar().size() + ")");
					System.out.println("Jestli ne, tak zm��kni v�t�� ��slo, ne� je po�et item� v invent��i");
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
							System.out.println("V�pis item� v invent��i:");
							System.out.println(i);
							System.out.println("V invent��i m� je�t� m�sto pro " + (i.getVelikost() - i.getMisto()) + " item�");
							
					}
				}
				prvniPravda=true;
			}
			}
				System.out.println("Do jak� lokace se chce� p�esunout? (0 - Sever, 1 - V�chod, 2 - Jih, 3 - Z�pad)");
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
