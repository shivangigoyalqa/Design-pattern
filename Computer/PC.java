public class PC extends Computer {

	private String ram;
	private String hardisk;
	private String cpu;
	
	public PC(String ram, String hardisk, String cpu){
		this.ram=ram;
		this.hardisk=hardisk;
		this.cpu=cpu;
	}
	public String getRAM() {
		return this.ram;
	}

	public String getHardisk() {
		return this.hardisk;
	}

	public String getCPU() {
		return this.cpu;
	}

}