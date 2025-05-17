package learning_platform_annotation;

import java.util.ArrayList;

public interface Course {
	
	public void setCourseDetails(String courseName);
	public ArrayList<UserList> getUserList();
	public Instructor getInstructor();
	public String getCourseName();
	

}
