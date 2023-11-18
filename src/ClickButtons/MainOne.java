package ClickButtons;

public class MainOne {

	public static void main(String[] args) {
		Button b1 = new Button();

		b1.setOnClickList(new Onclick() {

			@Override
			public void oneclick() {
				System.out.println("User is Logged In");

			}
		});

		Button btout = new Button();
		
		btout.setOnClickList(new Onclick() {
			
			@Override
			public void oneclick() {
				
				
			}
		});

	}

}
