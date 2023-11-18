package EmailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int emailboxCapacity = 500;
	private int defaultPasswordLenght = 9;
	private String alternateEmail;
	private String companySuffix = "company.com";

	// Constructor to receive the first name and last name

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + " " + this.lastName);

		// Call a method asking for the department - return the department

		this.department = setDepartment();
		System.out.println("Department: " + this.department);

		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLenght);
		System.out.println("Your password is: " + this.password);

		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "."
				+ companySuffix.toLowerCase();
		System.out.println("your email is: " + email);
	}

	// Ask for Department + scanner
	private String setDepartment() {
		System.out.println(
				"Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code: ");

		Scanner scanner = new Scanner(System.in);
		int depChoice = scanner.nextInt();
		if (depChoice == 1) {
			return "Sales";
		} else if (depChoice == 2) {
			return "Development";

		} else if (depChoice == 3) {
			return "Accounting";
		} else {
			return setDepartment();
		}
	}

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length()); // casting
			password[i] = passwordSet.charAt(rand);

		}
		return new String(password);

	}

	// Set the emailbox capacity

	public void setEmailCapacity(int capacity) {
		this.emailboxCapacity = capacity;
	}

	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;

	}

	public void changePassword(String password) {
		this.password = password;
	}

	public int getEmailCapacity() {
		return emailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}
}
