package ai.Rohit.beans;

public class DebitCardPay implements IPay {
	public DebitCardPay() {
		System.out.println("Debit Card object is created by IOC");
	}
	public boolean payBill(Double amt) {
		System.out.println("Paying bill through Debit Card");
		return true;
		
	}

}
