package postFixLaskin;

public class Calc {

	Plus plus = new Plus();
	Minus minus = new Minus();
	Jako jako = new Jako();
	Tulo tulo = new Tulo();
	
	private String operator="";
	private int top=0;
	private int num_level1=0;
	
	public Calc(int a, int b, String operation) {
		this.operator = operation;

		 this.top = a;
		 this.num_level1 = b;
	}
	
	public double execute() {
		if(operator.contains("+")) {
			double summa=0;
			summa= plus.calculation(num_level1, top);
			return summa;

		} else if(operator.contains("-")) {
			double erotus =0;
			erotus=minus.calculation(num_level1,top);
			return erotus;
			
		} else if(operator.contains("/")) {
			double osamaara = 0;
			osamaara = jako.calculation(num_level1,top);
			return osamaara;
			
		} else if(operator.contains("*")) {
			double kertoma = 0;
			kertoma = tulo.calculation(num_level1,top);
			return kertoma;
			
		}
		return 0;
	}
	
}
