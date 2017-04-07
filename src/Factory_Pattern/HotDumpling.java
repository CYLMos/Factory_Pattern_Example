package Factory_Pattern;

public class HotDumpling extends Dumpling{
	
	private String type = "Hot";
	
	public HotDumpling(){		
		super.setName(this.type + " " + super.getName());
		super.setPrice(5.0);
	}
	
	public String getName(){
		return super.getName();
	}
	
	public double getPrice(){
		return super.getPrice();
	}

	@Override
	public void mix() {
		System.out.println("Hot mixing.....");
		
	}

	@Override
	public void shape() {
		System.out.println("Hot shaping.....");
		
	}

}
