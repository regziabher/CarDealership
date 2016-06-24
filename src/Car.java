
public class Car {
	private String make;
	private String model;
	private int year;
	private double price;
	
	
	public Car (String m, String mod,int y, double p){
		make = m;
		model= mod;
		year= y;
		price= p;		
	}
	
	public String getMake(){
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setMake(String make) {
		this.make =make;
	}
	
	public void setModel (String model) {
		this.model= model;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public void setPrice (double price){
		this.price =price;
	}
}
