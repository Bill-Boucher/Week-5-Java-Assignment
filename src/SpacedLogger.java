
public class SpacedLogger implements Logger {
//6. The SpacedLogger should add spaces between 
	//each character of the String argument passed into its methods.
	@Override
	public void log (String log) {
		String space = "";
		for (int i = 0; i < log.length(); i++) {
			space = space + log.charAt(i) + " ";
			
		}
		System.out.println(space);
		
	}
	
	
//8.	The error method should do the same, but with “ERROR:” preceding the spaced out input 	
	@Override
	public void error (String error) {
		String space = "";
		for (int i = 0; i < error.length(); i++) {
			space = space + error.charAt(i) + " ";
			
		}
		System.out.println("ERROR: " + space);
		
	}

}
