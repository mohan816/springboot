package bean_scope;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SocialMediaApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_scope.xml");
		//To get the input from the user in the console
		Scanner sc = new Scanner(System.in);
		User user = (User)context.getBean("simpleUser");
		System.out.println("Social Media Application starts");
		System.out.println("Enter user name");
		String username = sc.nextLine();
		user.setUserName(username);
		
     		while(true) {
     			System.out.println("1) Make new post \n2) Show all post \n3) exit");
     			int choice = sc.nextInt();
			    PostList postList = user.getPostList();
			switch(choice) {
			case 1:{
				System.out.println("Enter a new post");
				Post post = (Post)context.getBean("simplePost");
				//To move the cursor to the next line
				sc.nextLine();
				String message = sc.nextLine();
				post.setMessage(message);
				postList.setPost(post);
				System.out.println();
				break;
			}
			case 2:{
				System.out.println("Show all the posts");
				for(int i = 0; i < postList.size(); i++) {
					System.out.println(""+i+") "+user.getUserName()+" "+postList.getPost(i).getMessage());
			}
				System.out.println();
				break;
				
			}
			case 3:
				break;
			default:
				System.out.println("Error");
		}
			if(choice == 3)
				break;

	}

}
}
