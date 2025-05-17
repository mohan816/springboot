package learning_platform;

import java.util.ArrayList;

public class PaidCourse implements Course {
	
	private String courseName;
	private Instructor instructor;
	private ArrayList<UserList> userList;
	
	public PaidCourse() {
		this.userList = new ArrayList<>();
	}
	
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
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
        return this.instructor;
	}

	@Override
	public String getCourseName() {
		// TODO Auto-generated method stub
         return this.courseName;
	}
	

}
