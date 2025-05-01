package ioc;

public class CreditCardPaymentService implements PaymentService{
    double amount;
	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		this.amount = amount;
		System.out.println("Processing credit card payment of $"+amount);
	}


}
