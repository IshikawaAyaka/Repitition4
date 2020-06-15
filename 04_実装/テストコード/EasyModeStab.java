package typingGame;

public class EasyModeStab extends EasyMode{
	
	@Override
	public String setAnswer() {
		String a = "1234567";
		super.correctString = a;
		return a;
	}

}
