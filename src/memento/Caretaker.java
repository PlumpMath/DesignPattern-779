package memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

	public static void main(String[] args) {
		List<Memento> saveStates = new ArrayList<Memento>();
		Originator originator = new Originator();
		originator.set("State1");
		originator.set("State2");
		saveStates.add(originator.saveToMemento());
		originator.set("state3");
		saveStates.add(originator.saveToMemento());
		originator.set("State4");
		originator.restoreFromMemento(saveStates.get(1));
	}
}
