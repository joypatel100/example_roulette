package roulette;

import util.ConsoleReader;

public class EvenOddBet extends Bet {

	private static final String DESCRIPTION = "Odd or Even";
	
	public EvenOddBet(int odds) {
		super(DESCRIPTION, odds);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String placeBet (){
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}
	
	@Override
	public boolean betIsMade (String betChoice, Wheel myWheel){
		return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}

}
