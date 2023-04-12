package sample03_string;

public class StringApp3 {

	public static void main(String[] args) {
		// 불린, 정수, 실수, 객체, 문자, 문자배열을 전달받아서 String으로 변환해서 반환한다.
		// true -> "true"
		// 'A' -> "A"
		// {'안', '녕', '하', '세', '요'} -> "안녕하세요"
		// 3.14 -> "3.14"
		// 10000 -> "10000"
		// 10000000000000L -> "10000000000000"
		
		// static String valueOf(boolean value)
		// static String valueOf(char value)
		// static String valueOf(char[] arr, int offset, int length)
		// static String valueOf(double value)
		// static String valueOf(int value)
		// static String valueOf(long value)
		// static String valueOf(Object obj)
		
		// 임의의 정수에 대하여 정수의 각 자리값을 더한 결과를 출력하기
		// 정수 : 110293 
		// 출력값 : 16 = 1 + 1 + 2 + 9 + 3
		
		int number = 110293;
		String text = String.valueOf(number); 	// 110293 -> "110293"
		String[] values = text.split("");		// "110293" -> {"1", "1", "0", "2", "9", "3"}	// 한자리씩 배열에 담아줌:split //6개짜리 배열 생성됨 // 문자열로 바꾸는 이유는 split사용해서 하나로 배열로 쪼개 계산
												// 가공하기 쉬운값을 가지고 난후 
		int total = 0;
		for (String value : values) {
			int num = Integer.parseInt(value); 	// "1" -> 1	// Integer.parseInt 문자열을 숫자로 바꿈 
			total += num;
		}
		
		System.out.println("자릿수의 합 -> " + total);
	}
}
