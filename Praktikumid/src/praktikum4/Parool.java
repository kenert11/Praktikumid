package praktikum4;

import lib.TextIO;

public class Parool {
	public static void main(String[] args){
		
		String parool = "kalamaja";
		
		
		while (true){
			System.out.println("Sisesta palun parool");
			String kasutajaSisestus = TextIO.getlnString();
			if (parool.equals(kasutajaSisestus)){
				System.out.println("Õige parool");
			}else {
				System.out.println("Sisesta uuesti");
				break;
			}
					
		}
		
	}
}
