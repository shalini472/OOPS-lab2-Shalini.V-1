package restaurant001;

public class Pasta extends Restaurant {

	String flavour;
	String type;
	public Pasta() {
		// TODO Auto-generated constructor stub
	}
	public double getPastaCost() {
		String flavour=this.flavour;
		String type=this.type;
		if(flavour=="whitesauce" && (type=="penne" && type=="ditalini")) {
			return 10.00;
		}
		else if(flavour=="redsauce" && (type=="penne" && type=="ditalini")) {
			return 20.00;
		}
		else {
		return 0;
		}
		
		
	}
	public Pasta(String flavour, String type) {
		super();
		this.flavour = flavour;
		this.type = type;
	}

}
