package typingGame;

public class EasyMode extends Mode {

	// 候補の文字の配列を生成
	private String[] x = new String[10];
	
	// 出力するための文字列を生成
	private String[] z = new String[7];
	private String str;

	// 配列を生成する
	public EasyMode() {
		x[0] = "0";
		x[1] = "1";
		x[2] = "2";
		x[3] = "3";
		x[4] = "4";
		x[5] = "5";
		x[6] = "6";
		x[7] = "7";
		x[8] = "8";
		x[9] = "9";
	}

	// ランダムに選んだ文字を順番に配列に入れる
	public String setAnswer() {
		int y;
		for (int i = 0; i < 7; i++) {
			y = (int) (Math.random() * 9);
			z[i] = x[y];
		}
		str = String.join("",z);
		super.correctString = str;
		return str;
	}

	public void getAnswer() {
		for (int i = 0; i < 7; i++) {
			System.out.print(z[i]);
		}

	}

}