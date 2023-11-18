package BankAccount;

public class MainOne {

	public static void main(String[] args) {
		
		Account umaplus = new Account("11229" ,0.00, "Umar KH", "umaplus@gmailcom", 347113344);
		umaplus.DepositMoney(1500.00);
		umaplus.WithDraw(1000);
		umaplus.WithDraw(1000);
		umaplus.DepositMoney(4500.00);
		

	}

}
