package praktikum5;

public class Tsyklid {
	public static void main(String[] args){
		if (true){
			System.out.println("tingimus on õige");
		}
		int arv = 0;
		while (arv <3){
			System.out.println("tingimus on tõene(while), arv: " + arv);
			arv = arv + 1;
			//continue; läheb tsükli algusesse
			break; //katkestab tsükli töö
		}
		for (int i =0; i < 10; i= i++/* i= i +1*/){
			System.out.println(i);
		}
			
		
	}
}
