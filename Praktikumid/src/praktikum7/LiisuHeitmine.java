package praktikum7;

import lib.TextIO;
import praktikum6.Meetodid;

public class LiisuHeitmine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Palun sisesta inimeste arv");
		int inimesteArv= TextIO.getInt();
		
		String nimed[]= new String[inimesteArv];
		for (int i = 0; i < nimed.length; i++) {
			System.out.println("Sisesta nimi indeksiga" + i);
			nimed[i]= TextIO.getlnString();
		}
		int suvalineIndex = Meetodid.suvalineArv(0,inimesteArv - 1);
		System.out.println("Suvaline nimi on(indeksiga" + suvalineIndex + "): " + nimed[suvalineIndex]);
	}

}
