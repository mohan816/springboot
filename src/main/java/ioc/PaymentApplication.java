package ioc;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PaymentApplication {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter payment amount");
		double amount = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter payment method (CreditCard, PayPal, or BankTransfer):");
		String paymentMethod = sc.nextLine();
		PaymentService paymentService;
		switch(paymentMethod) {
		    case "CreditCard":
			paymentService = (PaymentService) context.getBean("creditCard");
			paymentService.processPayment(amount);
			break;
		    case "PayPal":
		    	paymentService = (PaymentService) context.getBean("payPal");
				paymentService.processPayment(amount);
				break;
		    case "BankTransfer":
		    	paymentService = (PaymentService) context.getBean("bankTransfer");
				paymentService.processPayment(amount);
				break;
			default:
				break;
		}
		}
	}

