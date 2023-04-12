package sample08_list;

import java.util.Objects;

public class Book implements Comparable<Book> {			//클래스
	
	private int no;
	@Override
	public int hashCode() {
		return Objects.hash(no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return no == other.no;
	}

	private String title;
	private String writer;
	private int price;

	public Book(int no, String title, String writer, int price) {
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.price = price;
	}

	public int getNo() {
		return no;
	}

	public String getTitle() {
		return title;
	}

	public String getWriter() {
		return writer;
	}

	public int getPrice() {
		return price;
	}
	
	// 책번호를 기주으로 오름차순 정렬시킨다.
//	@Override
//		public int compareTo(Book other) {
//			// TODO Auto-generated method stub
//			return no - other.no;
//		}
	
	// 책제목을 기준으로 오름차순 정렬시킨다.
	@Override
		public int compareTo(Book o) {
			return title.compareTo(o.title);
		}
}
