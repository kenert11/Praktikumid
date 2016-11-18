package praktikum14;

import java.util.ArrayList;
import java.util.Collections;

public class T2hestikuline extends FailiLugeja {

	public static void main(String[] args) {
	    ArrayList<String> failiread =  loeFail("kala.txt");
	    System.out.println(failiread);
	    Collections.sort(failiread);
	    System.out.println(failiread);
	}

}
