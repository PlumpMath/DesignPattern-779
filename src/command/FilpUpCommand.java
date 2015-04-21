package command;

public class FilpUpCommand implements Command{

	private Light light;
	public FilpUpCommand(Light light){
		this.light = light;
	}
	@Override
	public void execute() {
		this.light.turnOn();
	}

}
