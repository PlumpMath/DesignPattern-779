package template_method;

public class AndroidCompiler extends CrossCompiler{

	@Override
	protected void collectSource() {
		System.out.println("android collectSource");
	}

	@Override
	protected void compileToTarget() {
		System.out.println("android compileToTarget");
	}

}
