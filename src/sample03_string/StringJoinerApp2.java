package sample03_string;

import java.util.StringJoiner;

public class StringJoinerApp2 {

	public static void main(String[] args) {
		String[] names = {"김유신", "강감찬", "이순신"};
		
		StringJoiner joiner = new StringJoiner(",");
//		String text = "";
		for (String x : names) {
			joiner.add(x);
//			text += x;
//			text += ",";
		}
		String text = joiner.toString();
//		text = text.substring(0, text.length() -1);
		System.out.println(text);
	}
}
