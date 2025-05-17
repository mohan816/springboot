package bean_scope;

public class SimpleUser implements User {
	
	private String userName;
	
	private PostList postList;

	@Override
	public void setUserName(String userName) {
		// TODO Auto-generated method stub
      this.userName = userName;
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return this.userName;
	}

	@Override
	public void setPostList(PostList postList) {
		// TODO Auto-generated method stub
          this.postList = postList;
	}

	@Override
	public PostList getPostList() {
		// TODO Auto-generated method stub
		return this.postList;
	}

}
