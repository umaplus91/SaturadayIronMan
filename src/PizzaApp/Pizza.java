package PizzaApp;

public class Pizza {
	private int price;
	private boolean veg;
	private int ExtraCheese = 10;
	private int ExtraTop = 15;
	private int delivery = 30;
	private int regularPizza;
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingAdded = false;
	private boolean isDeliveryAdded = false;

	public Pizza(boolean veg) {
		this.veg = veg;
		if (this.veg) {
			this.price = 100;
		} else {
			this.price = 150;
		}
		regularPizza = this.price;
	}

	public void addExtraCheese() {
		isExtraCheeseAdded = true;
		//System.out.println("Extra cheese added");
		this.price += ExtraCheese;

	}

	public void addExtraTop() {
		isExtraToppingAdded = true;
//		System.out.println("Extra topping added");
		this.price += ExtraTop;

	}

	public void addDelivery() {
		isDeliveryAdded = true;
//		System.out.println("Delivery added");
		this.price += delivery;

	}

	public void getReceipt() {
		String receipt = "";
		System.out.println("Pizza: $" + regularPizza);
		if(isExtraCheeseAdded) {
			receipt+="Extra cheese added: "+ExtraCheese+ "\n";
			
		}
		if(isExtraToppingAdded) {
			receipt+="Extra topping added: "+ExtraTop+ "\n";

	}
		if(isDeliveryAdded) {
			receipt+="Delivery added: "+delivery+ "\n";
			
		}
		receipt+="Total: $"+this.price + "\n";
		System.out.println(receipt);
}
		
}
