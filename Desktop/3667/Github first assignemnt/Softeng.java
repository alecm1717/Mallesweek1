package softeng;

import java.util.Scanner;
abstract class Instrument{
	
	public abstract String FamousPlayer();
}
   

//sub class 1
 class Guitar extends Instrument{
	
	
@Override
public String FamousPlayer() {
	return "Eric Clapton";
}
}

//sub class 2
 class Drums extends Instrument{
	@Override
	public String FamousPlayer() {
		return "John Bonham";
	}
}



public class Softeng {

	public static void main(String[] args) {

		Instrument myInstrument;
		System.out.println("Do you like Guitar or Drums better?");
		
		Scanner keyboard = new Scanner(System.in);
		String Option = keyboard.nextLine();
		
		if (Option.equals("Guitar")) {
			myInstrument = new Guitar();
	        System.out.println(myInstrument.FamousPlayer());	
		    
		}
		if(Option.equals("Drums")) {
			  myInstrument = new Drums();
	        System.out.println(myInstrument.FamousPlayer());
	        
		}
		
	}

}
