package bean_lifecycle;

public class SimplePost implements Post {

	private String message;
	
	public void init() {
		System.out.println("Simple post init method will be executed first");
	}
	@Override
	public void setMessage(String message) {
		this.message = message;

	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
	
	public void dest() {
		System.out.println("Destroy method of simple post will be called before the bean is destroyed");
	}

}
