package typingGame;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UI {

	//コンストラクタ
	public UI() {
	}

	//正解の文字列を表示
	public void showString(String correctString) {
		System.out.println("--------");
		System.out.println(correctString);
		System.out.println("--------");
	}

	//所要時間を表示
	public void showTime(double time) {
		System.out.println("TIME：" + time + "秒");
	}

	//評価を表示
	public void showAssessment(String assessment) {
		System.out.println("評価：" + assessment);
	}

	//間違いを表示
	public void showMistake(String message) {
		System.out.println(message);
	}

	//開始準備
	public void showReady() {
        System.out.println("Ready? (ENTERキーを押して開始)");
        try{
            System.in.read();
        }catch(Exception e){
            e.printStackTrace();
        }
	}

	//タイピング
	public String typing() {
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();
			return input;
		}catch(Exception e) {
			return null;
		}

	}

	//モードの選択
	public int selectMode() {
		System.out.println("モードを選択してください");
		System.out.println("-----------------");
		System.out.println("* 入力例 : 1:EASY, 2:HARD");
		int ret;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();
				ret = Integer.parseInt(input);
			return ret;

		}catch(Exception e) {
			ret = -1;
			return ret;
		}
	}

}
