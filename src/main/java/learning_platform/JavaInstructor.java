package learning_platform;

public class JavaInstructor implements Instructor {
	
	private String name;
	private int age;
	
	public void init() {
		System.out.println("First method to be called in Java Instructor");
	}
	
	@Override
	public void setInstructorDetails(String name, int age) {
		// TODO Auto-generated method stub
		this.name = name;
		this.age = age;
	}
	@Override
	public void takeClass() {
		// TODO Auto-generated method stub
		System.out.println(this.name+" is taking Java class");
	}
	
	public void dest() {
		System.out.println("Last method to be called in Java Instructor");
	}
	

}
