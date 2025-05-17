package bean_lifecycle;

import java.util.ArrayList;

public class SimplePostList implements PostList {
	
	private ArrayList<Post> postList;
	
	public SimplePostList() {
		postList = new ArrayList<Post>();
	}
	
	public void init() {
		System.out.println("Simple post list init method will be executed at first");
	}

	@Override
	public ArrayList<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return this.postList;
	}

	@Override
	public Post getPost(int i) {
		// TODO Auto-generated method stub
		return this.postList.get(i);
	}

	@Override
	public void setPost(Post post) {
		// TODO Auto-generated method stub
       this.postList.add(post);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.postList.size();
	}
	
	public void dest() {
		System.out.println("Destroy method of simple post list will be called before the bean is destroyed");
	}

}
