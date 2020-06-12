package typingGame;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class UITest {

	private UI ui;
	
	@Test
	public void test1() {
		ui = new UI();
		ui.showString("abcdefg");
	}

	@Test
	public void test2() {
		ui = new UI();
		ui.showTime(2.5);
	}

	@Test
	public void test3() {
		ui = new UI();
		ui.showAssessement("Great");
	}

	@Test
	public void test4() {
		ui = new UI();
		ui.showMistake("もう一度入力してください");
	}

	@Test
	public void test5() {
		ui = new UI();
		ui.showReady();
	}

	@Test
	public void test6() {
		ui = new UI();
		String actual = ui.typing();
		String expected = "abcdefg";
		assertThat(actual, is(expected));
	}

	@Test
	public void test7() {
		ui = new UI();
		int actual = ui.selectMode();
		int expected = 1;
		assertThat(actual, is(expected));
	}
}
