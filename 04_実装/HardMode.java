package typingGame;


public class HardMode extends Mode{
	
	//候補の文字列
	private String[] x = new String[36];
	
	//出力するための文字列
	private String[] z = new String[7];
	private String str;
	
	//配列を生成する
	public HardMode(){
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
		x[10] = "a";
		x[11] = "b";
		x[12] = "c";
		x[13] = "d";
		x[14] = "e";
		x[15] = "f";
		x[16] = "g";
		x[17] = "h";
		x[18] = "i";
		x[19] = "j";
		x[20] = "k";
		x[21] = "l";
		x[22] = "m";
		x[23] = "n";
		x[24] = "o";
		x[25] = "p";
		x[26] = "q";
		x[27] = "r";
		x[28] = "s";
		x[29] = "t";
		x[30] = "u";
		x[31] = "v";
		x[32] = "w";
		x[33] = "x";
		x[34] = "y";
		x[35] = "z";
	}
	//ランダムで選んだ文字を順番に配列に入れる
	public String setAnswer(){
		int y;
		for(int i=0;i<7;i++) {
			 y = (int)((Math.random() * 35) );
			  z[i] = x[y];
			  }
		str = String.join("",z);
		super.correctString = str;
		return str;
	}
	
	public void getAnswer() {
		for(int i=0;i<7;i++) {
			System.out.print(z[i]);
		}
		
	}

}

