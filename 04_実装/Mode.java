package typingGame;

abstract class Mode {
	private String correctString;
	private UI uI;

	public Mode() {
	}

	// 判定する
	public boolean judge() {
		boolean result = false;
		if (correctString == uI.typing()) {
			result = true;
		}
		return result;
	}

	// 表示する文字列を決める(抽象メソッド)
	abstract String[] setAnswer();

}
