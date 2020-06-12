package typingGame;

public class Timer {

	private long time;
	private long startTime;
	private long stopTime;

	public Timer() {
	}

	public long getTime() {
		time=this.stopTime-this.startTime;
		return time/1000000;
	}

	public void timeStart() {
		startTime = System.nanoTime();
	}

	public void timeStop() {
		stopTime = System.nanoTime();
	}

	
	
	public long getStartTime() {
		return startTime/1000000;
	}
	
	public long getStopTime() {
		return stopTime/1000000;
	}
}