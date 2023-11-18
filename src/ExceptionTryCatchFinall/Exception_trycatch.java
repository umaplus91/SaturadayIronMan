package ExceptionTryCatchFinall;

public class Exception_trycatch  {
  // Java Exceptions - use "try - catch - finally" 
	//Two types of exceptions : Built - in Exception 
	
	
	public static void main(String[] args) {
		try {
		int[] ageIronman = new int[] {22,32,4,13,55,3};		
		System.out.println("Student age = " + ageIronman[0]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Test Execution Continue....");
			
		}
		//Specific Build -in Exception - numbersFrmatException 
		try {
			int num = Integer.parseInt("Five");
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
		try {
			throw new MyException("Test");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("This is user-defined Exception Method !");
		}
		finally {
			System.out.println("Test Execution Complited!!");
		}
		
		//System.out.println("Test Execution Completed !");

	}

}
