package Factory_Pattern;

public abstract class Dumpling {
	
	private String name = "Dumpling";
	
	private double price = 0.0;
	
    abstract public void mix();
    
    abstract public void shape();
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public String getName(){
		return this.name;
	}
	
	public double getPrice(){
		return this.price;
	}
}
