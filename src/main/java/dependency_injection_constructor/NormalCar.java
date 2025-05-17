package dependency_injection_constructor;

public class NormalCar implements Car {

private String ownerName;
private Tyre tyre;
	
	public NormalCar(Tyre tyre) {
		this.tyre = tyre;
	}
	
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
     System.out.println(getOwnerName()+" owns a normal car "+tyre.getTyreInfo());
	}

	@Override
	public void setOwnerName(String ownerName) {
		// TODO Auto-generated method stub
        this.ownerName = ownerName;
	} 

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return ownerName;
	}

}
