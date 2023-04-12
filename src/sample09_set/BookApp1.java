package sample09_set;

import java.util.HashSet;

import sample08_list.Book;

public class BookApp1 {

	public static void main(String[] args) {
		//동일한 클래스가 존재할수 있으므로 확인
		HashSet<Book> books = new HashSet<>();
		
		// 동일한 책번호를 가진 책정보는 같은 객체로 보고 저장되지 않게 하자.
		// Book 클래스에서 hashCode()와 equals(Object o) 메소드를 재정의한다.
		books.add(new Book(100, "자바의 정석", "남궁성", 35000));
		books.add(new Book(100, "자바의 정석", "남궁성", 35000));
		books.add(new Book(100, "자바의 정석", "남궁성", 35000));
		books.add(new Book(100, "자바의 정석", "남궁성", 35000));
		books.add(new Book(101, "이것이 자바다", "신용권", 32000));
		books.add(new Book(102, "생각하는 프로그래밍", "김창준", 29000));
		
		for (Book book : books) {
			System.out.println(book.hashCode());
			System.out.println("번호 -> " + book.getNo());
			System.out.println("제목 -> " + book.getTitle());
			System.out.println("저자 -> " + book.getWriter());
			System.out.println("가격 -> " + book.getPrice());
			System.out.println();													// HashSet에서는 동일성비교 - (hashCode값이 다르면 다른객체라고 인식)
																					// String 은 문자열이 같으면 같은 객체라고 판단
																					// hashCode. equals 재정의
																					// 재정의 하기전 hash 다 다른 값을 객체에 부여
																					// String / Integer / ...	
		}
	}
}