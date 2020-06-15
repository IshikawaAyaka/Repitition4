package typingGame;

public class HardModeStab extends HardMode{
	
	@Override
	public String setAnswer() {
		String a = "1234567";
		super.correctString = a;
		return a;
	}

}
