package learning_platform;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LearningPlatformApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("learning_platform.xml");
		//Create java course
		PaidCourse javaCourse = (PaidCourse) context.getBean("paidCourseJava");
		javaCourse.setCourseDetails("Java");
		javaCourse.getInstructor().setInstructorDetails("Mohan", 28);
		
		PaidCourse springCourse = (PaidCourse) context.getBean("paidCourseSpring");
		springCourse.setCourseDetails("Spring");
		springCourse.getInstructor().setInstructorDetails("Mahalakshmi", 27);
		
		while(true) {
			System.out.println("User starts the application");
			System.out.println("User choice selection");
			System.out.println("1) Register \n2) See Course Information \n3) exit");
			Scanner sc = new Scanner(System.in);
			int userChoice = sc.nextInt();
			switch(userChoice) {
			case 1:
				SimpleUser user = (SimpleUser) context.getBean("simpleUser");
				sc.nextLine();
				System.out.println("Please enter your name");
				String name = sc.nextLine();
				System.out.println("Please enter your age");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("Please enter your college");
				String college = sc.nextLine();
				System.out.println("Please enter your location");
				String location = sc.nextLine();
				user.setUserDetails(name, age, location, college);
				SimpleUserList userList = (SimpleUserList) context.getBean("simpleUserList");
				userList.addUser(user);
				System.out.println("Please select a course \n1)java \n2)Spring");
				int courseType = sc.nextInt();
				switch(courseType) {
				case 1: 
					javaCourse.setUserList(userList);
					break;
				default:
					springCourse.setUserList(userList);
				}
				System.out.println();
				break;
			case 2:
				boolean flag = false;
				if(javaCourse.getUserList() != null) {
					System.out.println(javaCourse.getCourseName());
					System.out.println("The Students in the course");
					for(int j = 0; j < javaCourse.getUserList().size(); j++) {
					   int courseSize = javaCourse.getUserList().get(j).getUserList().size();
					for(int i = 0; i < courseSize; i++) {
						System.out.println(javaCourse.getUserList().get(j).getUserList().get(i).getUserDetails());
						System.out.println();
					}
					}
					flag = true;
				}
				if(springCourse.getUserList() != null) {
					System.out.println(springCourse.getCourseName());
					System.out.println("The Students in the course");
					for(int j = 0; j < springCourse.getUserList().size(); j++) {
					   int courseSize = springCourse.getUserList().get(j).getUserList().size();
					for(int i = 0; i < courseSize; i++) {
						System.out.println(springCourse.getUserList().get(j).getUserList().get(i).getUserDetails());
						System.out.println();
					}
					}
					flag = true;
				}
				if(flag == false)
					System.out.println("No course information is available");
				    System.out.println();
				
				break;
			case 3:
				 break;
			}
			if(userChoice == 3)
				break;
		}
		
		context.close();
		

	}

}
