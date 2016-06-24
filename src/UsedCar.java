
public class UsedCar extends Car {

	private int miles;
	
	
	public UsedCar(String m, String mod, int y, double p, int mi) 
	{
		super(m,mod,y,p);
		miles = mi;
	}
	
	public int getMiles() {
		return miles;
	}
	public void setMiles(int miles) {
		this.miles= miles;
	}
	
}
