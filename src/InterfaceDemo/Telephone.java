package InterfaceDemo;

public interface Telephone {
	
	/*PowerON
	 * Dial a number
	 * Answer calls
	 * Call another phone
	 * isRinging
	 */
	
	 public void powerOn();
	 public void Dial(String phoneNumber);
	 public void answer();
	 public boolean callPhone(String phoneNumber);
	 public boolean isRinging();
	 

}
