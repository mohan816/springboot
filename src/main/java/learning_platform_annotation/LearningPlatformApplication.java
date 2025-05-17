package learning_platform_annotation;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LearningPlatformApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("learning_platform_annotation");
		ApplicationContext context = SpringApplication.run(LearningPlatformApplication.class, args);
		
		//DI -> At run time it will pick the type of instructor and execute it
		PaidCourse paidCourse = context.getBean(PaidCourse.class);
		paidCourse.setInstructor("java");
		paidCourse.getInstructor().setInstructorDetails("Mohan", 27);
		paidCourse.getInstructor().takeClass();
		
		
//		//Create java course
//		PaidCourse javaCourse = context.getBean(PaidCourse.class);
//		javaCourse.setCourseDetails("Java");
//		System.out.println(javaCourse.getCourseName());
//		
//		//Create spring course
//		PaidCourse springCourse = context.getBean(PaidCourse.class);
//		springCourse.setCourseDetails("Spring");
//		System.out.println(springCourse.getCourseName());
		
//		while(true) {
//			System.out.println("User starts the application");
//			System.out.println("User choice selection");
//			System.out.println("1) Register \n2) See Course Information \n3) exit");
//			Scanner sc = new Scanner(System.in);
//			int userChoice = sc.nextInt();
//			switch(userChoice) {
//			case 1:
//				SimpleUser user = (SimpleUser) context.getBean("simpleUser");
//				sc.nextLine();
//				System.out.println("Please enter your name");
//				String name = sc.nextLine();
//				System.out.println("Please enter your age");
//				int age = sc.nextInt();
//				sc.nextLine();
//				System.out.println("Please enter your college");
//				String college = sc.nextLine();
//				System.out.println("Please enter your location");
//				String location = sc.nextLine();
//				user.setUserDetails(name, age, location, college);
//				SimpleUserList userList = (SimpleUserList) context.getBean("simpleUserList");
//				userList.addUser(user);
//				System.out.println("Please select a course \n1)java \n2)Spring");
//				int courseType = sc.nextInt();
//				switch(courseType) {
//				case 1: 
//					javaCourse.setUserList(userList);
//					break;
//				default:
//					springCourse.setUserList(userList);
//				}
//				System.out.println();
//				break;
//			case 2:
//				boolean flag = false;
//				if(javaCourse.getUserList() != null) {
//					System.out.println(javaCourse.getCourseName());
//					System.out.println("The Students in the course");
//					for(int j = 0; j < javaCourse.getUserList().size(); j++) {
//					   int courseSize = javaCourse.getUserList().get(j).getUserList().size();
//					for(int i = 0; i < courseSize; i++) {
//						System.out.println(javaCourse.getUserList().get(j).getUserList().get(i).getUserDetails());
//						System.out.println();
//					}
//					}
//					flag = true;
//				}
//				if(springCourse.getUserList() != null) {
//					System.out.println(springCourse.getCourseName());
//					System.out.println("The Students in the course");
//					for(int j = 0; j < springCourse.getUserList().size(); j++) {
//					   int courseSize = springCourse.getUserList().get(j).getUserList().size();
//					for(int i = 0; i < courseSize; i++) {
//						System.out.println(springCourse.getUserList().get(j).getUserList().get(i).getUserDetails());
//						System.out.println();
//					}
//					}
//					flag = true;
//				}
//				if(flag == false)
//					System.out.println("No course information is available");
//				    System.out.println();
//				
//				break;
//			case 3:
//				 break;
//			}
//			if(userChoice == 3)
//				break;
//		}
//		
		//context.close(); -> The reason to comment is, previously we manually called the context now Server is taking care of it. So not required to
		                      //close it.
		

	}

}
