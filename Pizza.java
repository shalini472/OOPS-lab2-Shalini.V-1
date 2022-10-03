package restaurant001;

import java.util.*;

public class Pizza extends Restaurant{

		String size;
		public String getSizes() {
			return size;
		}

		public void setSizes(String sizes) {
			this.size = size;
		}

		public String getTypes() {
			return type;
		}

		public void setTypes(String type) {
			this.type = type;
		}
		 public double getCost(){
			 boolean toppings=topping!=null?true:false;
			 String flavour=this.flavour;
			 String size=this.size;
			 String type=this.type;
			 if(flavour=="veg" && size=="small" && (type=="thin"||type=="thick")) {
				 return 20.00;
			 }
			 else if(flavour=="non-veg" && size=="small" && (type=="thin"||type=="thick")) {
				 return 25.00;
			 }
			 else if(flavour=="vegan" && size=="small" && (type=="thin"||type=="thick")) {
				 return 15.00;
			 }
			 else if(flavour=="veg" && size=="small" && (type=="thin"||type=="thick")) {
				 return 20.00;
			 }
			 else if(flavour=="veg" && size=="medium" && (type=="thin"||type=="thick")) {
				 return 40.00;
			 }
			 else if(flavour=="non-veg" && size=="medium" && (type=="thin"||type=="thick")) {
				 return 50.00;
			 }
			 else if(flavour=="vegan" && size=="medium" && (type=="thin"||type=="thick")) {
				 return 30.00;
			 }
			 else if(flavour=="veg" && size=="large" && (type=="thin"||type=="thick")) {
				 return 60.00;
			 }
			 else if(flavour=="non-veg" && size=="large" && (type=="thin"||type=="thick")) {
				 return 70.00;
			 }
			 else if(flavour=="vegan" && size=="large" && (type=="thin"||type=="thick")) {
				 return 35.00;
			 }
			 else if(flavour=="veg" && size=="small" && (type=="thin"||type=="thick") && toppings==true) {
				 return 21.00;
			 }
			 else {
				 return 0.00;
			 }
			 
		 }

		public Pizza(String size, String type,String flavour, String topping) {
			super();
			this.size = size;
			this.type = type;
			this.flavour = flavour;
			this.topping = topping;
		}

		String type;
		String flavour;
		String topping;
		public Pizza(String size, String type, String flavour) {
			super();
			this.size = size;
			this.type = type;
			this.flavour = flavour;
		}

	// TODO Auto-generated constructor stub
	public Pizza() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       

	}

}
