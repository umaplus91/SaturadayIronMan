package BankAccount;

public class Account {

	private String Number;
	private double Balance;
	private String Name;
	private String email;
	private int PhoneNumber;
	
	public Account(String Number,double Balance, String Name, String email, int PhoneNumber) {
		this.Number=Number;
		this.Balance=Balance;
		this.Name=Name;
		this.email=email;
		this.PhoneNumber=PhoneNumber;
	}
	
	public void DepositMoney(double MoneyDeposited) {
		this.Balance+=MoneyDeposited;
		System.out.println("Deposit is successful, new balance is $" + this.Balance);
	}
	
	public void WithDraw(double WithdrawalMoney) {
		if(this.Balance - WithdrawalMoney < 0) {
			System.out.println("WithDraw Unseccessfull only $" + this.Balance + " is left");
		}else {
			this.Balance-=WithdrawalMoney;
			System.out.println("WithDraw successful, Current Balance is $" + this.Balance);
		}
	}
	
	
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
}
