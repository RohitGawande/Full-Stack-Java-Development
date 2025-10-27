package in.rohit.comp;



public class BlueDart3 implements Courier {

	static {
		System.out.println("BlueDart.class file is loading...");
	}

	public BlueDart3() {
		System.out.println("BlueDart:: Zero param constructor...");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return "BlueDart Courier will delived with the order id ::"+oid+" for the ordered products";
	}

}
