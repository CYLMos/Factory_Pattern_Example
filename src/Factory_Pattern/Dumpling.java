package Factory_Pattern;

public abstract class Dumpling {
	
	private String name = "Dumpling";
	
	private double price = 0.0;
	
	/*public void prepare(){
		System.out.printf("My dumpling is %s, and price is %.2f \n", this.name, this.price);
	}*/
	
    public void mix(){
    	System.out.println("Mixing....");
    }
	
	public void shape(){
		System.out.println("Shaping....");
	}
	
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
