package praktikum4;

import lib.TextIO;

public class CumLaude {

	public static void main(String[] args) {
		System.out.println("Palun sisesta lõputöö hinne");
		int l6putoo = TextIO.getInt();
		if (l6putoo < 0 || l6putoo > 5) {
			System.out.println("Proovi andmed uuesti sisestada");
			return;
		}
		System.out.println("Palun sisesta keskmine hinne");
		double keskmine = TextIO.getDouble();
		if (keskmine < 0 || keskmine > 5) {
			System.out.println("Proovi andmed uuesti sisestada");
			return;
		}
		if (l6putoo == 5 && keskmine > 4.5) {
			System.out.println("Saad cum Laude!");
		} else {
			System.out.println("Ei saa Cum Laudet");
		}

	}
}
