package usingcommonannotation;

class Customer {

	public void calculateAmount(int amount) {
		System.out.println("the total amount");

	}
}

public class DiamondCustomer extends Customer {
	public void calculateAmount(int amount) {
		System.out.println("the total amount in DiamondCustomer");

	}

	public static void main(String args[]) {
		DiamondCustomer c = new DiamondCustomer();
		c.calculateAmount(23);

	}

}
