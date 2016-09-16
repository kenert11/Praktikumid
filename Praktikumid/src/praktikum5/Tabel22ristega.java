package praktikum5;
import lib.TextIO;
public class Tabel22ristega {
	public static void main(String[] args){
		System.out.println("Sisesta tabeli suurus");
		int tabeliSuurus= TextIO.getInt();
		tryki22Ris(tabeliSuurus);
	for( int i= 0; i<tabeliSuurus; i++){
			for( int j= 0; j <tabeliSuurus; j++){
				if(i == j ){
					System.out.print("x ");
				}
				if(i +j == tabeliSuurus -1){
					System.out.print("x ");
				}
				else {
					System.out.print("0 ");
				}
				//System.out.print("(i:" + i + " j:" +j + ")");
		}
			System.out.println();
		}
	tryki22Ris(tabeliSuurus);
	}

	private static void tryki22Ris(int tabeliSuurus) {
		// TODO Auto-generated method stub
		for	(int i= 0; i< tabeliSuurus * 2 +3; i++){
			System.out.print("-");
		}
	}
	
	}

