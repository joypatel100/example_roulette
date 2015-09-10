package roulette;

import util.ConsoleReader;

public class NumberBet extends Bet {

	private static final String DESCRIPTION = "Three in a Row";
	
	public NumberBet(int odds) {
		super(DESCRIPTION, odds);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String placeBet (){
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}
	
	@Override
	public boolean betIsMade (String betChoice, Wheel myWheel){
		int start = Integer.parseInt(betChoice);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	}

}
