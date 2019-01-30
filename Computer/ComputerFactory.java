public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hardisk, String cpu){
		if("PC".equalsIgnoreCase(type)) 
			return new PC(ram, hardisk, cpu);
		else if("Server".equalsIgnoreCase(type)) 
			return new Server(ram, hardisk, cpu);
		
		return null;
	}
	public static void main(String[] args) {
		Computer obj1 = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer obj2 = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("PC Configuration:-  "+obj1);
		System.out.println("Server Configuration:-  "+obj2);
	}
}