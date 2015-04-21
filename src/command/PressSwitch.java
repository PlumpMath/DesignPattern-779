package command;

public class PressSwitch {
	public static void main(String[] args) {
		Light light = new Light();
		Command switchUp = new FilpUpCommand(light);
		Command switchOff = new FlipDownCommand(light);
		Switch sswitch = new Switch();
		sswitch.storeAndExecute(switchUp);
		sswitch.storeAndExecute(switchOff);
	}
}
