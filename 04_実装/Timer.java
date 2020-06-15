package typingGame;

public class Timer {
	
	//経過時間
	private long time;
	//開始時間
	private long startTime;
	//終了時間
	private long stopTime;
	
	//コンストラクタ
	public Timer() {
	}
	
	//経過時間を返す
	public long getTime() {
		time=this.stopTime-this.startTime;
		return time/1000000;
	}
	
	//開始時間を格納する
	public void timeStart() {
		startTime = System.nanoTime();
	}
	
	//終了時間を格納する
	public void timeStop() {
		stopTime = System.nanoTime();
	}

}