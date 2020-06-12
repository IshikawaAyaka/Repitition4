package typingGame;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TypingGameTest {
	TypingGame t;
	
	@Test
	public void test1_1() {
		t = new TypingGame();
		Timer timer = new Timer();
		timer.timeStart();
		try{
			Thread.sleep(0);
			timer.timeStop();
			timer.getTime();
		}catch(InterruptedException e){
		}	
		
		// 実行
		
		String test_1_1 = t.assessment(timer.getTime());

		// 検証
		assertThat(test_1_1, is("So fast!!"));
		// （必要であれば）後処理
		System.out.println("");
	}
	
	@Test
	public void test1_2() {
		Timer timer = new Timer();
		timer.timeStart();
		try{
			Thread.sleep(1999);
			timer.timeStop();
			timer.getTime();
		}catch(InterruptedException e){
		}
		t = new TypingGame();
		// 実行
		
		String test_1_2 = t.assessment(timer.getTime());

		// 検証
		assertThat(test_1_2, is("So fast!!"));
		// （必要であれば）後処理
		System.out.println("");
	}
	
	@Test
	public void test2_1() {
		t = new TypingGame();
		Timer timer = new Timer();
		timer.timeStart();
		try{
			Thread.sleep(2000);
			timer.timeStop();
			timer.getTime();
		}catch(InterruptedException e){
		}
		// 実行
		
		String test_2_1 = t.assessment(timer.getTime());

		// 検証
		assertThat(test_2_1, is("Great!"));
		// （必要であれば）後処理
		System.out.println("");
	}
	
	@Test
	public void test2_2() {
		t = new TypingGame();
		Timer timer = new Timer();
		timer.timeStart();
		try{
			Thread.sleep(3999);
			timer.timeStop();
			timer.getTime();
		}catch(InterruptedException e){
		}
		// 実行
		
		String test_2_2 = t.assessment(timer.getTime());

		// 検証
		assertThat(test_2_2, is("Great!"));
		// （必要であれば）後処理
		System.out.println("");
	}
	
	@Test
	public void test3_1() {
		t = new TypingGame();
		Timer timer = new Timer();
		timer.timeStart();
		try{
			Thread.sleep(4000);
			timer.timeStop();
		}catch(InterruptedException e){
		}
		// 実行
		
		String test_3_1 = t.assessment(timer.getTime());

		// 検証
		assertThat(test_3_1, is("Osonai?????"));
		// （必要であれば）後処理
		System.out.println("");
	}

}
