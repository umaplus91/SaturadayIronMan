package PizzaApp;

public class MainOne {

	public static void main(String[] args) {
		
		Pizza regular = new Pizza(false);
		
		regular.addDelivery();
		
		regular.getReceipt();
		
		
		DeluxPizza delux = new DeluxPizza(true);
		delux.addDelivery();
		delux.getReceipt();
	}

}
