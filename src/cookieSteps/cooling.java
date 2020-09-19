package cookieSteps;

public class cooling {

	public static void main(String[] args) {

		ingredients fs = warming.getSortCookie();
		
		dry dry = new dry(fs);
		rolling file = new rolling(dry);
		file.execute();
		
		wet wet = new wet(fs);
		file = new rolling(wet);
		file.execute();
		
		mixingBowl mixingBowl = new mixingBowl(fs);
		file = new rolling(mixingBowl);
		file.execute();
	}

}