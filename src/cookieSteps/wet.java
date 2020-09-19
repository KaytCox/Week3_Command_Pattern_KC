package cookieSteps;

public class wet implements bake {

	private ingredients fileSystem;
	
	public wet(ingredients fs){
		this.fileSystem=fs;
	}

	public void execute() {
		this.fileSystem.wetIngredients();
	}

}