package template_method;

public abstract class CrossCompiler {

	protected abstract void collectSource();
	protected abstract void compileToTarget();
	
	public final void crossCompil(){
		collectSource();
		compileToTarget();
	};
}
