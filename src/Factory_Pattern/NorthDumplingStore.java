package Factory_Pattern;

public class NorthDumplingStore extends DumplingStore{

	@Override
	protected Dumpling createDumpling(String type) {
		
		Dumpling dumpling = null;
		
		if(type.equals("Normal Dumpling")){
			dumpling = new NormalDumpling();
			//dumpling = new NorthTypeDecorator(dumpling);
		}
		else if(type.equals("Hot Dumpling")){
			dumpling = new HotDumpling();
			//dumpling = new NorthTypeDecorator(dumpling);
		}
		
		return dumpling;
	}

}
