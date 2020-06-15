package typingGame;

import org.junit.Test;

public class EasyModeTest {
	public static class TypingGame_乱数確認 {

		EasyMode easyMode = new EasyMode();

		@Test
		public void TypingGame_1_1() {

			easyMode.setAnswer();
			easyMode.getAnswer();

		}

	}
}
