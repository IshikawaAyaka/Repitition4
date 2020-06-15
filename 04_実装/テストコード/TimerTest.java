package typingGame;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class TimerTest{
	@Test
	public void test3(){
		Timer timer=new Timer();
		timer.timeStart();
		System.out.println("…5秒間処理を停止…");
		try{
			Thread.sleep(1000);
			timer.timeStop();
			long a=timer.getTime();
			long b=timer.getStopTime()-timer.getStartTime();
			assertThat(a,is(b));
		}catch(InterruptedException e){
		}
	}
}
