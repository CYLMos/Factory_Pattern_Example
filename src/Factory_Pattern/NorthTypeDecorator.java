package Factory_Pattern;

public class NorthTypeDecorator extends Decorator{

	public NorthTypeDecorator(Dumpling dumpling) {
		super(dumpling);
	}
	
	public String getName(){
		return "North Type " + dumpling.getName();
	}
	
	public double getPrice(){
		return 0.5 + dumpling.getPrice();
	}

}
