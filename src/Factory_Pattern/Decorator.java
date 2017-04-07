package Factory_Pattern;

public abstract class Decorator extends Dumpling{
	
	protected Dumpling dumpling;

	public Decorator(Dumpling dumpling) {		
		this.dumpling = dumpling;
	}

}
