package ioc;

public class BankTransferPaymentService implements PaymentService {
    double amount;
	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		this.amount = amount;
     System.out.println("Processing bank transfer payment of $"+amount);
	}

}
