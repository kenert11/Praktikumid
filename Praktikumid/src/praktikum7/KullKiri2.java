package praktikum7;

import praktikum6.Meetodid;

public class KullKiri2 {
public static void main(String[] args) {
		int kasutajaRaha = 100;
		
		while (true) {
			
			int maxPanus=Math.min(25, kasutajaRaha);
			int panus= Meetodid.kasutajaSisestus("Palun sisesta panus(maksimaalselt" + maxPanus +")",1, 25);
			kasutajaRaha -= panus;
			int kasutajaArvamus = Meetodid.kasutajaSisestus("Kull (0) või kiri(1)?", 0, 1);
			int myndiVise = Meetodid.suvalineArv(0, 1);
			System.out.println("Kasutaja sisestas" + " " + kasutajaArvamus);
			System.out.println("Avuti myndivise" + " " + myndiVise);
			if (myndiVise == kasutajaArvamus) {
				kasutajaRaha += panus*2;
				System.out.println("Arvasite õigesti,saite panuse kahekordselt tagasi" + " " + "Teil on alles" + " "+ kasutajaRaha);
				
			} else if(myndiVise != kasutajaArvamus) {
				
				System.out.println("Arvasite valesti" + " " + "Teil on alles" + " " + kasutajaRaha );
				
			} else if(panus== 0){
				System.out.println("Teil sai raha otsa");
				break;
			}
		}
			
		
	}
}
