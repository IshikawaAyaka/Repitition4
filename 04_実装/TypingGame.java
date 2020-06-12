package typingGame;

public class TypingGame {
	
	//評価するための数値
	private final long boarderline1 = 3000;
	private final long boarderline2 = 5500;
	
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
		boolean start = ui.showReady();
		
		//答えを生成する
		if(start == true) {
			String answer = mode.setAnswer();
			ui.showString(answer);
		}
		
		//タイマーをスタートする
		timer.timeStart();
		
		boolean result = false;
		for(int i=0;result == false;i++) {
			//正解するまでタイプする
			String playerAnswer = ui.typing();
			
			//判定する
			result = mode.judge(playerAnswer);
			if(result == true)break;
			switch(i) {
			case 0:
				break;
			case 1:
				ui.showMistake("落ち着いて");
				break;
			case 2:
				ui.showMistake("頑張って？");
				break;
			case 3:
				ui.showMistake("まだいける！");
				break;
			default:
				ui.showMistake("もうダメダ...");
				break;
			}

		}
		
		//タイマーをストップする
		timer.timeStop();
		
		//計測をもとに経過時間を評価する
		String assessment =  assessment(timer.getTime());
		
		//評価結果を表示する
		 double time = timer.getTime();
		ui.showTime(time/1000);
		ui.showAssessment(assessment);
		
	}
	
	//計測をもとに経過時間を評価する
	public String assessment(long time) {
		String assessment;
		if(0 <= time && time < boarderline1) {
			assessment = "So fast!!";
		}else if(boarderline1 <= time && time < boarderline2) {
			assessment = "Great!";
		}else {
			assessment = "Osonai?????";
		}
		return assessment;
	}

}
