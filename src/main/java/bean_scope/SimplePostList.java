package bean_scope;

import java.util.ArrayList;

public class SimplePostList implements PostList {
	
	private ArrayList<Post> postList;
	
	public SimplePostList() {
		postList = new ArrayList<Post>();
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

}
