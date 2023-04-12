package sample05_date;

import java.util.Date;

public class DateApp1 {

	public static void main(String[] args) {
		
		/*
		 * 날짜와 시간의 표현
		 *  - java.util.Date 
		 *  	날짜와 시간정보를 표현하는 클래스다.
		 *  - java.sql.Date
		 *  	날짜를 표현하는 클래스다.		//데이터베이스
		 *  - java.sql.Time 
		 *  	시간을 표현하는 클래스다.		//데이터베이스
		 *  - java.sql.TimeStamp 		//데이터베이스
		 *  	Time클래스보다 더 정밀한 시간을 표현하는 클래스다.
		 *  - java.time.LocalDate
		 *  	날짜정보를 표현하는 클래스다.
		 *  - java.time.LocalTime
		 *  	시간정보를 표현하는 클래스다.
		 *  - java.time.LocalDateTime
		 *  	날짜와 시간정보를 표현하는 클래스다.
		 *  
		 *  * java.util.Date는 시스템의 현재 날짜와 시간정보를 제공한다.
		 *  
		 *  * java.sql는 데이터베이스의 날짜와 시간정보를 표현하기 위한 클래스를 제공한다.	
		 *  // 데이터베이스다루는 방식 시간정보 날짜 표현하기위함
		 *  
		 *  * java.time 패키지의 날짜와 시간정보 클래스는 java8부터 추가되었다.
		 *  * java.time 패키지에는 날짜와 관련된 다양한 연산을 지원하는 기능이 추가되었다.
		 */
		
		// 시스템의 현재 날짜와 시간정보를 가진 Date객체 생성하기
		Date now = new Date();
		System.out.println(now);
		
		
		// 유닉스타임을 전달받아서 해당 날자와 시간정보를 표현하는 Date객체를 생성하기
//		Date someDate = new Date(0);	// new Date(0) 다른메소드를 호출했는데 Long값으로 출력해줄때 
//		System.out.println(someDate);
		
		
		
		
		
	}
}
