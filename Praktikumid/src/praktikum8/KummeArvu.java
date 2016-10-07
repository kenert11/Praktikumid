package praktikum8;

import java.util.Collections;

import lib.TextIO;

public class KummeArvu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arvud= new int[10];
		
		
		for(int i=0;i< arvud.length;i++){
			System.out.println("Sisesta väärtus indeksile"+ i);
			arvud[i]= TextIO.getInt();
			
		}
		for(int i=arvud.length; i>=0;i--){
			System.out.println(arvud[arvud.length -i - 1]);
		}
		for(int i=0; i>arvud.length;i++){
			System.out.println(arvud[arvud.length -i - 1]);
		}
		
		
	}

}
