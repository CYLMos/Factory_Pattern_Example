package Factory_Pattern;

public abstract class DumplingStore {
	
	public Dumpling orderDumpling(String type){
		Dumpling dumpling = createDumpling(type);
		
		System.out.printf("My dumpling is %s, and price is %.2f \n", dumpling.getName(), dumpling.getPrice());
		
		dumpling.mix();
		dumpling.shape();
		
		return dumpling;
	}
	
	abstract protected Dumpling createDumpling(String type);

}
