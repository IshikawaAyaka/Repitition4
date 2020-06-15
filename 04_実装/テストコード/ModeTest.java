package typingGame;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class ModeTest extends EasyMode{
	Mode e;
	@Test
	public void test1_1() {
		e = new EasyModeStab();
		// 実行
		e.setAnswer();
		boolean test_1_1 = e.judge("1234567");

		// 検証
		assertThat(test_1_1, is(true));
		// （必要であれば）後処理
		System.out.println("");
	}
	
	@Test
	public void test1_2() {
		e = new EasyMode();
		// 実行
		e.setAnswer();
		boolean test_1_2 = e.judge("1111111");

		// 検証
		assertThat(test_1_2, is(false));
		// （必要であれば）後処理
		System.out.println("");
	}
	
	

}
