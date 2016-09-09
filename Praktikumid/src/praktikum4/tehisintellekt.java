package praktikum4;

import lib.TextIO;

public class tehisintellekt {
	public static void main(String[] args) {
		System.out.println("Palun sisesta kaks vanust");
		int vanus1 = TextIO.getInt();
		if (vanus1 < 0) {
			System.out.println("Proovi andmed uuesti sisestada");
			return;
		}
		int vanus2 = TextIO.getInt();
		if (vanus2 < 0) {
			System.out.println("Proovi andmed uuesti sisestada");
			return;
		}
		int vanuseVahe = Math.abs(vanus1 - vanus2);
		if (vanuseVahe > 5) {

			System.out.println("Üpriski palju");
		} else if (vanuseVahe > 10) {
			System.out.println("See on ikka väga suur vahe");
		} else {
			System.out.println("Sobib");
		}
	}
}
