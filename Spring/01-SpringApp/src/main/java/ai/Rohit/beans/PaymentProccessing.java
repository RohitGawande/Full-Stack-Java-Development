package ai.Rohit.beans;

public class PaymentProccessing {
	private IPay pay;
	public void setPay(IPay pay) {
		System.out.println("Setter is Called");
		this.pay=pay;
	}
	public void doPayment(Double amt) {
		boolean paymentDone=pay.payBill(amt);
		if (paymentDone) {
			System.out.println("Payment Success");
		}
		else {
			System.out.println("Payment Failed");
		}
	}
}
