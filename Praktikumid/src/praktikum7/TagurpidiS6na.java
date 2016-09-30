package praktikum7;

import lib.TextIO;

public class TagurpidiS6na {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s6na= TextIO.getlnString();
		System.out.println(tagurpidi(s6na));
	}
	public static String tagurpidi(String oigetpidi){
		String tagurpidi ="";
		for (int i=oigetpidi.length() - 1;i>= 0; i--){
			tagurpidi +=oigetpidi.charAt(i);
		}
		return tagurpidi;
	}
}
