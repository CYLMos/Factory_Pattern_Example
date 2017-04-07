package Factory_Pattern;

public class SouthDumplingStore extends DumplingStore{

	@Override
	protected Dumpling createDumpling(String type) {
		
        Dumpling dumpling = null;
		
		if(type.equals("Normal Dumpling")){
			dumpling = new NormalDumpling();
			dumpling = new SouthTypeDecorator(dumpling);
		}
		else if(type.equals("Hot Dumpling")){
			dumpling = new HotDumpling();
			dumpling = new SouthTypeDecorator(dumpling);
		}
		
		return dumpling;
	}

}
