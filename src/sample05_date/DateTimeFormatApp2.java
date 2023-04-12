package sample05_date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormatApp2 {

	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");	//예외가 jvm까지 절대로 전달되지 않게해야함// 프로그램이 종료됨
		
		// 지정된 패턴형식의 문자열을 해석해서 Date객체를 생성하기
		Date date1= sdf1.parse("1994-02-15");
		System.out.println(date1);
		
		// 시스템의 현재 날짜와 시간정보를 표현하는 Date객레를 생성하기
		Date now = new Date();
		
		long nowUnixTime = now.getTime();
		long dateUnixTime = date1.getTime();
		
		long days = (nowUnixTime - dateUnixTime)/(60*60*24*1000);		// 하루 60초 60분 1000분의 1초단위
		System.out.println("경과일자 : " + days);
		
	}
}
