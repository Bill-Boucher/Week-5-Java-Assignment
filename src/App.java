
public class App {

	public static void main(String[] args) {
	//10.	In this class instantiate an instance of each of your logger classes that implement the Logger interface.
	//11.	Test both methods on both instances, passing in Strings of your choice.

		
		
		Logger AsterickLogger = new AsterickLogger();
		
		
		AsterickLogger.log("Tomato");
		AsterickLogger.error("Apple");

		
		Logger SpacedLogger = new SpacedLogger();
		
		SpacedLogger.log("Motorcycle");
		SpacedLogger.error("Malfunction");
	}

}