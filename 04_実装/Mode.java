package typingGame;

abstract class Mode {
	protected String correctString;
	
	//コンストラクタ
	public Mode() {
	}

	// 判定する
	public boolean judge(String playeranswer) {
		boolean result = false;
		
		
		if (correctString.equals(playeranswer)) {
			result = true;
		}
		return result;
	}

	// 表示する文字列を決める(抽象メソッド)
	abstract String setAnswer();

}
