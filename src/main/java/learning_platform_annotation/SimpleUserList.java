package learning_platform_annotation;

import java.util.ArrayList;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SimpleUserList implements UserList {
	
	private ArrayList<User> userList;
	
	public SimpleUserList() {
		userList = new ArrayList<User>();
	}

	@Override
	public ArrayList<User> getUserList() {
		// TODO Auto-generated method stub
		return userList;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
       this.userList.add(user);
	}

}
