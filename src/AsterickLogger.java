
public class AsterickLogger implements Logger {

	
	//4.The log method on the AsteriskLogger should print out the String 
	//it receives between 3 asterisks on either side of the String 
	@Override
	public void log(String log) {
		log = "***" + log + "***";
		
		System.out.println(log);
		
	}
	//5.	The error method on the AsteriskLogger should print the String it receives inside a 
	//box of asterisks, with the String preceded by the word “ERROR:”
	@Override
	public void error(String error) {
		System.out.println( "******************** " + "\n*** ERROR: " + error + " ***" + "\n********************");
		
	}

}
