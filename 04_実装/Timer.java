package typingGame;

public class Timer {

	private long time;
	private long startTime;
	private long stopTime;

	public Timer() {
	}

	public long getTime() {
		time=this.stopTime-this.startTime;
		return time;
	}

	public void timeStart() {
		startTime = System.nanoTime();
	}

	public void timeStop() {
		stopTime = System.nanoTime();
	}

	
	
	public long getStartTime() {
		return startTime;
	}
	
	public long getStopTime() {
		return stopTime;
	}
}