package praktikum7;

import java.util.Random;

import lib.TextIO;

public class Arvamine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int number = random.nextInt(100);
		int arvamus = 0;
		int arvamusteArv = 0;
		while (number != arvamus) {
			System.out.println("Sisesta arv vahemikus 1-100:");
			arvamus = TextIO.getInt();
			arvamusteArv++;
			if (arvamus < number) {
				System.out.println("Liiga väike arv, proovi uuesti");
			} else if (arvamus > number) {
				System.out.println("Liiga kõrge arv, proovi uuesti");
			} else {
				System.out.println(
						"Arvasid õigesti" + " " + number + " " + "proovisid" + " " + arvamusteArv + " " + "korda");
			}
		}

	}

}
