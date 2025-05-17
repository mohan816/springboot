package learning_platform_annotation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PaidCourse implements Course {
	
	private String courseName;
	private Instructor courseInstructor;
	
	@Autowired
	@Qualifier("javaInstructor")
	private Instructor javaInstructor;
	
	@Autowired
	@Qualifier("springInstructor")
	private Instructor springInstructor;
	private ArrayList<UserList> userList;
	
	public PaidCourse() {
		this.userList = new ArrayList<>();
	}
	
	public void setInstructor(String courseInstructor) {
		if(courseInstructor.equals("spring"))
			this.courseInstructor = this.springInstructor;
		else
			this.courseInstructor = this.javaInstructor;
	}
	
	public void setUserList(UserList userList) {
		this.userList.add(userList);
	}
	
	@Override
	public void setCourseDetails(String courseName) {
		// TODO Auto-generated method stub
       this.courseName = courseName;
	}

	@Override
	public ArrayList<UserList> getUserList() {
		// TODO Auto-generated method stub
        return this.userList;
	}

	@Override
	public Instructor getInstructor() {
		// TODO Auto-generated method stub
        return this.courseInstructor;
	}

	@Override
	public String getCourseName() {
		// TODO Auto-generated method stub
         return this.courseName;
	}
	

}
