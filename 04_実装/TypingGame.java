package typingGame;

public class TypingGame {
	
	//評価するための数値
	private final long boarderline1 = 2000;
	private final long boarderline2 = 4000;
	
	//Mode、UI、Timerの型をつくる
	private Mode mode;
	private UI ui;
	private Timer timer;
	
	//初期シーケンスから
	public TypingGame(){
		timer = new Timer();
		ui = new UI();
	}
	
	//ゲームの実行
	public void start() {
		
		//モードを選択する
		//1の場合：EasyMode、2の場合：HardMode
		while(true) {
			int modeNumber = ui.selectMode();
			if(modeNumber == 1) {
				EasyMode easyMode = new EasyMode();
				mode = easyMode;
				break;
			}else if(modeNumber == 2){
				HardMode hardMode = new HardMode();
				mode = hardMode;
				break;
			}
		}
		
		//ゲームの開始を促す
		ui.showReady();
		
		//答えを生成する
		mode.setAnswer();
		
		//タイマーをスタートする
		timer.timeStart();
		
		
		
		boolean result = false;
		while(result == false) {
			
			//正解するまでタイプする
			String playerAnswer = ui.typing();
			
			//判定する
			result = mode.judge(playerAnswer);
		}
		
		//タイマーをストップする
		timer.timeStop();
		
		//計測をもとに経過時間を評価する
		String assessment =  assessment();
		
		//評価結果を表示する
		ui.showAssessment(assessment);
		
	}
	
	//計測をもとに経過時間を評価する
	public String assessment() {
		String assessment;
		if(0 <= timer.getTime() && timer.getTime() < boarderline1) {
			assessment = "So fast!!";
		}else if(boarderline1 <= timer.getTime() && timer.getTime() < boarderline2) {
			assessment = "Great!";
		}else {
			assessment = "Osonai?????";
		}
		return assessment;
	}

}
