package typingGame;

public class EasyMode extends Mode {

	// 候補の文字の配列を生成
	String[] x = new String[10];

	// ランダムな数を生成
	int y;

	// 出力するための文字列を生成
	String[] z = new String[7];

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
	public String[] setAnswer() {
		for (int i = 0; i < 7; i++) {
			y = (int) (Math.random() * 6);
			z[i] = x[y];
		}
		return z;
	}

	public void getAnswer() {
		for (int i = 0; i < 7; i++) {
			System.out.print(z[i]);
		}

	}

}
