package praktikum7;

import praktikum6.Meetodid;

public class T2ringum2ng {
	public static void main(String[] args) {
		int kasutajaRaha = 100;

		while (true) {

			int maxPanus = Math.min(25, kasutajaRaha);
			int panus = Meetodid.kasutajaSisestus("Palun sisesta panus(maksimaalselt" + maxPanus + ")", 1, 25);
			kasutajaRaha -= panus;

			int kasutajaT2ring = Meetodid.kasutajaSisestus("Millisele täringu numbrile panustad?(1-6)", 1, 6);
			int t2ringuVise = Meetodid.suvalineArv(1, 6);

			if (kasutajaT2ring == t2ringuVise) {
				kasutajaRaha += panus * 2;
				System.out.println("Arvasite õigesti,saite panuse kahekordselt tagasi" + " " + "Teil on alles" + " "
						+ kasutajaRaha);

			} else if (kasutajaT2ring != t2ringuVise) {

				System.out.println("Arvasite valesti" + " " + "Teil on alles" + " " + kasutajaRaha);

			} else if (panus == 0) {
				System.out.println("Teil sai raha otsa");
				break;
			}
		}
	}
}
