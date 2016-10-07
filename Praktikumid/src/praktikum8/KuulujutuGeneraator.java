package praktikum8;
import java.util.Random;

import praktikum6.Meetodid;

public class KuulujutuGeneraator {
 public Random rand= new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] naistenimed={"naine1","naine2","naine3"};
		String[] mehenimed={"mees1", "mees2", "mees3"};
		String[] tegusõnad={"joovad", "söövad", "jalutavad"};
		//System.out.println(suvalineElement(naistenimed)+ " "+ " ja");
		//System.out.println(suvalineElement(mehenimed));
		//System.out.println(suvalineElement(tegusõnad));
		System.out.format("%s ja %s %s", suvalineElement(naistenimed),suvalineElement(mehenimed),suvalineElement(tegusõnad));
		
		
		
		
	}
	public static String suvalineElement(String[] s6nad){
		int suvalineIndeks= Meetodid.suvalineArv(0, s6nad.length-1);
		return s6nad[suvalineIndeks];
	}
	

}
