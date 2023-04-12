package sample07_generic;

public class GenericBoxApp {

	public static void main(String[] args) {
		
		GenericBox<String> box1 = new GenericBox<>();			// 우항에도 <String> 적어야하는데 생략가능 자바 7부터 -> 타입추론 
		/*
		 * 소스코드
		 * class Generic<T> {
		 * 		T item;
		 * 		T getItem() { return item; }
		 * 		void setItem(T item) { this.item = item; }
		 * }
		 * 
		 * 실제 생성한 객체의 코드
		 * class Generic<String> {
		 * 		String item;
		 * 		String getItem() { this.item = item; }
		 * }
		 */
		box1.setItem("홍길동");	
//		box1.setItem(100);										// 의도한 값 외에 넣을수 없다.(String) 제네릭에서는 코딩과정에서 타입검사 맞지 않아서 입력불가
																// 코딩과정에서 타입검사가 가능해진다. 지정한 타입에 맞지않는 객체는 절대로 저장할 수 없다.
																// 즉, 엄격한 타입안정성이 확보된다.
		
		String value = box1.getItem();							// 클래스형변환 연산자를 사용할 필요가 없다.
		System.out.println(value);
		}
}
