package AbstractDemo;

public class MainOne {

	public static void main(String[] args) {
		Place hockey = new Arena("Ak Bars" , "Kazan", 10000.00 , "Iceground");
		hockey.getInfo();
		
		Stadium Atm = new Stadium("Civitas MetroPolitano", "Madrid", 60000.00); //Encapsulation happening here
		Atm.getInfo();
		
		Place tenis = new Court("RedBull Arena", "Sidney",20000.00, "SandyGround");
		tenis.getInfo();
		
	}
}
