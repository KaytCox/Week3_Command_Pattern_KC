package cookieSteps;

public class mixingBowl implements bake {

	private ingredients fileSystem;
	
	public mixingBowl(ingredients fs){
		this.fileSystem=fs;
	}
	
	public void execute() {
		this.fileSystem.mixingBowlIngredients();
	}

}