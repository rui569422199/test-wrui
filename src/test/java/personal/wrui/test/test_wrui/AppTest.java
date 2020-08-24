package personal.wrui.test.test_wrui;

import java.util.regex.Pattern;

public class AppTest {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("^2\\d{3}-((1[0-2])|(0[1-9]))$");
		System.out.println(p.matcher("2010-01").matches());
	}
}
