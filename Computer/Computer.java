public abstract class Computer {
	
	public abstract String getRAM();
	public abstract String getHardisk();
	public abstract String getCPU();
	

	public String toString(){
		return "RAM= "+this.getRAM()+", Hardisk="+this.getHardisk()+", CPU="+this.getCPU();
	}
}