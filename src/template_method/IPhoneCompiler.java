package template_method;

public class IPhoneCompiler extends CrossCompiler{

	@Override
	protected void collectSource() {
		System.out.println("IPhone >> collectSource");
	}

	@Override
	protected void compileToTarget() {
		System.out.println("IPhone >> compileToTarget");
	}

}
