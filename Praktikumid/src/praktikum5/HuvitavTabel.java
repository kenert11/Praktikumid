package praktikum5;

public class HuvitavTabel {
	public static void main(String[] args){
		int tabeliSuurus= 10;
		for( int i= 0; i < tabeliSuurus; i++){
			for( int j= 0; j < tabeliSuurus; j++){
				System.out.print((i+j) % 10 + " ");
				
				//System.out.print("(i:" + i + " j:" +j + ")");
		}
			System.out.println();
		}
	}
}
