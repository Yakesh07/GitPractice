package Inheri;

public class Third extends First {
	
	public void number(){
		System.out.println("Number");
	}
	
	public static void main(String[] args) {
		
		Third obj= new Third();
		obj.name();
		obj.number();
	}

}
