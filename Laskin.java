package postFixLaskin;

import java.util.Scanner;

public class Laskin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner gateKeeper = new Scanner(System.in);
		
		
		System.out.println("Add the sequence:");
		String sequence = gateKeeper.nextLine();
		int laskuri=0;
		Queue jono = new Queue();
		Queue temp = new Queue();
	while(laskuri<sequence.length()) {
		String x ="" +sequence.charAt(laskuri);
		jono.push(x);
		laskuri++;
	}
	System.out.println();
//	jono.printItems();
	
		
		int i=0;
	
	while (i<2) {	
		String operator = "";
		String luku="";
		String luku2="";
		
		
		luku = jono.pop().getData();
		luku2 = jono.pop().getData();
		operator = jono.pop().getData();
		
		//opeations
		int top = Integer.parseInt(luku);
		int num_level1 = Integer.parseInt(luku2);
		
		Calc calc = new Calc(top,num_level1, operator);
		double tulos = calc.execute();
		System.out.println(top + " " + operator+ " " + num_level1);
		System.out.println("result of calculation: "+tulos);
		int tulos_int= (int) Math.round(tulos);
		String result ="";
		result = ""+ tulos_int;
		temp.push(result);
		System.out.println();
		i++;
		}
	
		
		String luku3 = temp.pop().getData();
		String luku4 = temp.pop().getData();
		String operation = jono.pop().getData();
		int top = Integer.parseInt(luku3);
		int num_level1 = Integer.parseInt(luku4);
		Calc calc2 = new Calc(top,num_level1, operation);
		double tulos2 = calc2.execute();
		System.out.println(top + " " + operation+ " " + num_level1);
		System.out.println("The end result of the whole sequence: "+tulos2);

	}
}
	

