package sample08_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp3 {

	public static void main(String[] args) {
		// ArrayList객체의 주요 API
		
		// List객체 생성하기
		ArrayList<String> list1 = new ArrayList<>();		//제네릭 부모 자식 상속관계아님
		List<String> list2 = new ArrayList<>();				// 가능
		List<String> list3 = List.of("john", "eddy", "adam", "jane", "liz");	//수정할수없다 삭제 변경 불가 ArrayList가아니고 Immutablecollections
//		ArrayList<String> list4 = List.of("박정아", "문정원", "배유나");				// List.of 반환타입이 부모타입은 자식타입에 담을수 없음 List>ArrayList
																				// List<String>타입의 객체를 ArrayList<String>타입의 참조변수에 대입할 수 없다.
		
		
		// List객체에 객체 추가하기
		list1.add("김유신");
		list1.add("강감찬");
		list1.add("강감찬");
		list1.add("이순신");
		list1.add("강감찬");
		list1.add("류관순");
		list1.add("안중근");
		
		// List객체 객체 추가하기
//		list3.add("alexsandra");												// List.of()로 생성한 ArrayList객체는 수정할 수 없다.
		
		// List객체에 저장된 객체의 갯수를 조회하기
		int len = list1.size();
		System.out.println("List객체에 저장된 객체의 갯수 -> " + len);
		
		// List 객체가 비어있는지 조회하기
		boolean empty1 = list1.isEmpty();
		boolean empty2 = list1.isEmpty();
		System.out.println("첫번째 List객체가 비어있는가? -> " + empty1);				//삭제전		//false
		System.out.println("두번째 List객체가 비어있는가? -> " + empty2);				//아직담지않아서//false
		
 		// List객체의 모든 객체 삭제하기
		list1.clear();
		System.out.println("List객체에 저장된 객체의 갯수 " + list1.size());
		
	}
}
