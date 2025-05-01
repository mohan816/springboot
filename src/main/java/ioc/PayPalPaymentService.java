package ioc;

public class PayPalPaymentService implements PaymentService {
    double amount;
	@Override
	public void processPayment(double amount) {
		this.amount = amount;
		System.out.println("Processing paypal payment amount of $"+amount);

	}

}
