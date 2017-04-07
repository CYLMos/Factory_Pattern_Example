package Factory_Pattern;

public class SouthTypeDecorator extends Decorator{

	public SouthTypeDecorator(Dumpling dumpling) {
		super(dumpling);
	}
	
	public String getName(){
		return "South Type " + dumpling.getName();
	}
	
	public double getPrice(){
		return dumpling.getPrice();
	}

	@Override
	public void mix() {
		dumpling.mix();
	}

	@Override
	public void shape() {
		dumpling.shape();
	}

}
