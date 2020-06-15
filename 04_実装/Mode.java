package typingGame;

abstract class Mode {
	//正しい文字列
	protected String correctString;
	
	// 候補の文字の配列を生成
	protected String[] x;
	
	// 出力するための文字列を生成
	protected String[] z;
	protected String str;
	
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
