package cookieSteps;

public class warming {
	
	public static ingredients getSortCookie(){
		 String osName = System.getProperty("os.name");
		 System.out.println("Your cookie choice is:");
		 if(osName.contains("Windows")){
			 return new readyToEat();
		 }else{
			 return new letsEat();
		 }
	}
	
}