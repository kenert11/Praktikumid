package praktikum8;

import java.util.ArrayList;
import java.util.Collections;

import lib.TextIO;

public class NimedJ2rjestatud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> nimed= new ArrayList <String>();
		
			System.out.println("Palun sisesta nimesid(tühi sisestus lõpetab");
			while(true){
				String nimi = TextIO.getlnString();
				if(nimi.equals("")){
					break;
				}
				nimed.add(nimi);
			}
			Collections.sort(nimed);
			for(String nimi:nimed){
				System.out.println(nimed);
			}
		
	}

}
