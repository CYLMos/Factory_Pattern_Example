package Factory_Pattern;

public class NormalDumpling extends Dumpling{
	
	private String type = "Normal";
	
	public NormalDumpling(){
		super.setName(this.type + " " + super.getName());
		super.setPrice(4.5);
	}
	
	public String getName(){
		return super.getName();
	}
	
	public double getPrice(){
		return super.getPrice();
	}

}
