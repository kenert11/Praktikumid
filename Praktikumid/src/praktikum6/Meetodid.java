package praktikum6;

import lib.TextIO;

public class Meetodid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hinne= kasutajaSisestus(1, 5);
		System.out.println("Sisestatud hinne:" + hinne);
	}
	public static int kasutajaSisestus(String kysimus, int min, int max){
		while(true){
			System.out.println("Kas kull[0] või kiri[1]" + " "+min+ "kuni" + max);
			int sisestus=TextIO.getInt();
			
			if(sisestus>= min && sisestus <=max){
			
			return sisestus;
			
			}else{
				System.out.println("Ei sobi see arv!");
				
			}
			}
		
		
	}
	public static int kasutajaSisestus(int min, int max){
		while(true){
		//System.out.println("Siseta arv vahemikus" + " "+min+ "kuni" + max);
		int sisestus=TextIO.getInt();
		
		if(sisestus>= min && sisestus <=max){
		
		return sisestus;
		
		}else{
			System.out.println("Ei sobi see arv!");
			
		}
		}
	}

	public static int kuup(int i) {
		// TODO Auto-generated method stub
		
		return (int) Math.pow(i, 3);
	}
	public static int suvalineArv(int min, int max) {
		// TODO Auto-generated method stub
		int vahemik = max -min+ 1;
		return min + (int)(Math.random()* vahemik);
		
	}

}
