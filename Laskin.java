package postFixLaskin;

import java.util.Scanner;

public class Laskin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner gateKeeper = new Scanner(System.in);
		
		
		System.out.println("Add the sequence:");
		String sequence = gateKeeper.nextLine();
		int laskuri=0;
		Stack pino = new Stack();
		Stack temp = new Stack();
		laskuri = sequence.length()-1;
	while(laskuri >=0) {
		String x ="" +sequence.charAt(laskuri);
		pino.push(x);
		laskuri--;
	}
	System.out.println();
	pino.printItems();
	
		
		int i=0;
	
	while (i<2) {	
		String operator = "";
		String luku="";
		String luku2="";
		
		
		luku = pino.pop().getData();
		luku2 = pino.pop().getData();
		operator = pino.pop().getData();
		
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
		String operation = pino.pop().getData();
		int top = Integer.parseInt(luku3);
		int num_level1 = Integer.parseInt(luku4);
		Calc calc2 = new Calc(top,num_level1, operation);
		double tulos2 = calc2.execute();
		System.out.println(top + " " + operation+ " " + num_level1);
		System.out.println("The end result of the whole sequence: "+tulos2);

	}
}
	

