package OOP;

public interface Interface {

	public abstract void iDoor();

	public abstract String iEngine();

	public abstract String iColor();
	
	public abstract int iSeats();
	
	public abstract boolean iHybrid();
	
	
	/* (Parent)                 (Keyword)         (Child/Subclass)                    (Keyword)                 (GrandChild)
        Class  					 extends			  Class
        Abstract Class(+2)		 extends	          Class (-2=0 balance)
        Interface (+2)			implements			  Class (-2=0 balance)				
        Interface (+2)			 extends	         Interface (+2+2=+4)               implements				Class (-4=0)
        Interface (				implements			 Abstract class
        Abstract Class			 extends			 Interface class				   implements				class (-4=0)
        
        
        //interface got only *Abstract method
          Abstract class got *Regular method and Abstract method
          Class (regular) got only * Regular method   
        */ 
	
	
}
