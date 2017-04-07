package Factory_Pattern;

public class Main {

	public static void main(String[] args) {
		
		DumplingStore northStore = new NorthDumplingStore();
		
		Dumpling northNormalDumpling = northStore.orderDumpling("Normal Dumpling");
		System.out.printf("name is : %s \n" + "price is : %.2f.\n", northNormalDumpling.getName(), northNormalDumpling.getPrice());
		System.out.println("done!\n");
		Dumpling northHotDumpling = northStore.orderDumpling("Hot Dumpling");
		System.out.printf("name is : %s \n" + "price is : %.2f.\n", northHotDumpling.getName(), northHotDumpling.getPrice());
		System.out.println("done!\n");
		
				
		System.out.println("-----------------------------------");
		
		
		DumplingStore southStore = new SouthDumplingStore();
		
		Dumpling southNormalDumpling = southStore.orderDumpling("Normal Dumpling");
		System.out.printf("name is : %s \n" + "price is : %.2f.\n", southNormalDumpling.getName(), southNormalDumpling.getPrice());
		System.out.println("done!\n");
		Dumpling southHotDumpling = southStore.orderDumpling("Hot Dumpling");
		System.out.printf("name is : %s \n" + "price is : %.2f.\n", southHotDumpling.getName(), southHotDumpling.getPrice());
		System.out.println("done!\n");

	}

}
