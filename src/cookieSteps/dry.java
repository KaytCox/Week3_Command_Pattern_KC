package cookieSteps;

public class dry implements bake {

	private ingredients fileSystem;
	
	public dry(ingredients fs){
		this.fileSystem=fs;
	}
	@Override
	public void execute() {
		this.fileSystem.dryIngredients();
	}

}