package bean_lifecycle;

public class SimpleUser implements User {
	
	private String userName;
	
	private PostList postList;
	
	public void init() {
		System.out.println("Init method from simple user executed first after the bean created");
	}

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
	
	public void dest() {
		System.out.println("Destroy method of simple user will be called before the bean is destroyed");
	}

}
