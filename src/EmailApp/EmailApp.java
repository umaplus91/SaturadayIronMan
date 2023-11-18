package EmailApp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Jimmy", "Rock");
		em1.setEmailCapacity(100);
		System.out.println("Email capacity: " + em1.getEmailCapacity() + "MB");
		em1.setAlternateEmail("js@email.com");
		System.out.println("Yor alternate email: " + em1.getAlternateEmail());

		Email em2 = new Email("UMA", "PLUS");
		em2.setAlternateEmail("u@gmail.com");
		System.out.println("Yor alternate email: " + em2.getAlternateEmail());
		em2.setEmailCapacity(400);
		System.out.println("Email capacity: " + em2.getEmailCapacity() + "MB");

	}

}
