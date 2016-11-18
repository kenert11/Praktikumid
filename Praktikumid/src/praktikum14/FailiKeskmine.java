package praktikum14;

import java.util.ArrayList;

public class FailiKeskmine extends FailiLugeja {
	public static void main(String[] args) {
		ArrayList<String> failiread =  loeFail("numbrid.txt");
		System.out.println(failiread);
		ArrayList <Double> resultList = getDoubleArray(failiread);
		System.out.println(resultList);
		double kesk = keskmine(resultList);
		System.out.println(kesk);
	}
	private static ArrayList <Double> getDoubleArray(ArrayList<String> read){
		ArrayList<Double> result = new ArrayList<Double>();
		for(String stringValue : read){
			try{
				result.add(Double.parseDouble(stringValue));
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return result;
	}
	private static Double keskmine(ArrayList<Double> resultList){
		double sum = 0;
		for(double i : resultList){
			sum += i;
		}
		double sumtwo= sum/ resultList.size();
		return sumtwo;
	}
}
