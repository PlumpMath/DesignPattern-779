package state;

public class StateLowerCase implements Statelike{

	@Override
	public void writeName(StateContext context, String name) {
		context.setState(new StateMultipleUpperCase());
		System.out.println(name.toLowerCase());
	}

}
