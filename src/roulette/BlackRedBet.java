package roulette;

import util.ConsoleReader;

public class BlackRedBet extends Bet {
	
	private final static String DESCRIPTION = "Red or Black";
	
	public BlackRedBet(int odds) {
		super(DESCRIPTION, odds);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean betIsMade (String betChoice, Wheel myWheel){
		return myWheel.getColor().equals(betChoice);
	}

	@Override
	public String placeBet (){
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}

}
