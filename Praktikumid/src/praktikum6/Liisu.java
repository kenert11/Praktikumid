package praktikum6;

import lib.TextIO;

public class Liisu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Siseta inimester arv:");
		int inimesteArv=TextIO.getlnInt();
		System.out.println("Võitja on inimene nr:"+ " "+ Meetodid.suvalineArv(1, inimesteArv));
	}

	private static void kasutajaArv() {
		// TODO Auto-generated method stub
		int arv= TextIO.getInt();
	}

}
