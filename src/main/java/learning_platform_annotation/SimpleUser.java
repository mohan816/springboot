package learning_platform_annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SimpleUser implements User {
	
	private String name;
	private int age;
	private String location;
	private String collegeName;

	@Override
	public String getUserDetails() {
		// TODO Auto-generated method stub
		return name +" "+age+" "+location+" "+collegeName;
	}

	@Override
	public void setUserDetails(String name, int age, String location, String collegeName) {
		// TODO Auto-generated method stub
        this.name = name;
        this.age = age;
        this.location = location;
        this.collegeName = collegeName;
	}

}
