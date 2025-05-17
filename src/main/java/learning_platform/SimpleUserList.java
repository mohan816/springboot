package learning_platform;

import java.util.ArrayList;

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
