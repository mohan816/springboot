package dependency_injection_setter;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApplication {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("di_setter.xml");
		System.out.println("Hi, please enter your name");
		Scanner sc = new Scanner(System.in);
		String ownerName = sc.nextLine();
		System.out.println("please select sports car");
		Car car = null;
		System.out.println("please select tyre type \n 1) normal tyre \n 2) sports tyre");
		int tyreType = sc.nextInt();
			switch(tyreType) {
			case 1:
				car = (Car)context.getBean("sportsCarNormalTyre");
				break;
			case 2:
				car = (Car)context.getBean("sportsCarSportsTyre");
				break;
			default:
				System.out.println("No tyre type is selected");
			}

		car.setOwnerName(ownerName);
		car.getInfo();
		context.close();
		sc.close();	
		
//  Closing the Scanner in Java is important for resource management. When a Scanner is created, 	
//	it often establishes a connection to an underlying input source, such as the keyboard (System.in), a file, 
//	or a network stream. If the Scanner is not closed, this connection might remain open, leading to resource leaks.
	}

}
