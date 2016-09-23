package praktikum6;

public class KullKiri {

	public static void main(String[] args) {
		
		int kasutajaArvamus=Meetodid.kasutajaSisestus("Kull (0) või kiri(1)?",0, 1);
		int myndiVise= Meetodid.suvalineArv(0,1);
		System.out.println("Kasutaja sisestas"+ " " + kasutajaArvamus);
		System.out.println("Avuti myndivise"+ " "+ myndiVise);
		if(myndiVise== kasutajaArvamus){
			System.out.println("Arvasite õigesti");
		}else{
			System.out.println("Arvasite valesti");
		}
			
		
	}

}
