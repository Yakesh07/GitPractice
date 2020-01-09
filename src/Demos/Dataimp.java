package Demos;

public class Dataimp implements CustDet,Bank{

	@Override
	public void saving() {
		System.out.println("Saving");
	}

	@Override
	public void branch() {
		System.out.println("Branch");
	}

	@Override
	public void name() {
		System.out.println("Name");
	}

	@Override
	public void num() {
		System.out.println("Number");
	}
	

}
