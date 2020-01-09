package Demos;

public interface CustDet  {
	
		public void name();
		public default void num() {
			System.out.println("Number");
		}
		
}
