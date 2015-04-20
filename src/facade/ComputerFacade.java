package facade;

public class ComputerFacade {
	private CPU processor;
	private Memory ram;
	private HardDrive hd;
	public ComputerFacade(){
		this.processor = new CPU();
		this.ram = new Memory();
		this.hd = new HardDrive();
	}
	public void start(){
		processor.freeze();
		ram.load(1, null);
		processor.jump(2);
		processor.execute();
	}
}
