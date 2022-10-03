package restaurant001;

import java.util.*;

public class Restaurant {

	public Restaurant() {
		Pizza pizzas;
		Pasta pastas;
		// TODO Auto-generated constructor stub
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int toppings=1;
		//1(a,b)
       Pizza p1=new Pizza("small","thin","veg");
       Pizza p2=new Pizza("medium","thin","veg");
       Pizza p3=new Pizza("large","thin","veg");
       Pizza p4=new Pizza("small","thin","non-veg");
       Pizza p5=new Pizza("medium","thin","non-veg");
       Pizza p6=new Pizza("large","thin","non-veg");
       Pizza p7=new Pizza("small","thin","non-veg","toppings");
       Pasta p12=new Pasta("whitesauce","penne");
       Pasta p13=new Pasta("redsauce","diltani");
       //1(a,b)
       System.out.println(p1.getCost());
       System.out.println(p2.getCost());
       System.out.println(p3.getCost());
       System.out.println(p4.getCost());
       System.out.println(p5.getCost());
       System.out.println(p6.getCost());
       System.out.println(p7.getCost()+toppings);
       System.out.println(p12.getPastaCost());
       System.out.println(p13.getPastaCost());
       //1c//
       Queue<Pizza> pizzas = new LinkedList<>();
       pizzas.add(p1);
       pizzas.add(p2);
       pizzas.add(p3);
       pizzas.add(p4);
       pizzas.add(p5);
       pizzas.add(p6);
       pizzas.add(p7);
       Queue<Pasta> pastas = new LinkedList<>();
       pastas.add(p12);
       pastas.add(p13);
       //1c.

       
       
	}

}
