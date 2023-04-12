package sample07_generic;

public class GenericWildCardApp {

	public static void main(String[] args) {
		/*
		 * 제네릭 와일드카드
		 * 	<?>
		 * 	<? extends 타입>
		 * 	<? super 타입>	
		 * 	- 제네릭 와일드카드는 메소드의 매개변수, 메소드의 반환타입에 사용한다.
		 * 	- 클래스나 인터페이스의 타입파라미터로 사용할 수 없다.
		 * 			public class Box<?> {
		 * 
		 * 			}
		 * 			public class Box<? Extends 타입> {
		 * 
		 * 			}
		 * 
		 * 			public class Box<? super 타입> {
		 * 			}	
		 * 			전부 컴파일 오류다.
		 * 			
		 * 	<?>
		 * 		비한정적 와일드 카드
		 * 		모든타입이 가능하다
		 * 
		 * 	<? extends 타입>
		 * 		상한 경계 와일드 카드
		 * 		상위 클래스를 제한한다.(타입과 그 하위타입만 가능)
		 * 	
		 * 	<? super 타입>
		 * 		하한 경계 와일드 카드
		 * 		하위 클래스를 제한한다.(타입과 그 상위타입만 가능)
		 * 
		 */
		
//		// 배열
//		Object[] arr1 = new Integer[10];
		
		// 제네릭 클래스
//		GenericBox<Object> box1 = new GenericBox<Integer>();		// 컴파일오류. 상속관계가 아니다.(제네릭에서). 그래서 Integer를 Object에 담을수 없다.
		
		test1(new GenericBox<String>());
		test1(new GenericBox<Integer>());
		test1(new GenericBox<Long>());
		test1(new GenericBox<Phone>());
		test1(new GenericBox<SmartPhone>());
		test1(new GenericBox<FeaturePhone>());						// 타입이 무엇이든 상관없다.
		
//		test2(new GenericBox<String>());
//		test2(new GenericBox<Integer>());							
//		test2(new GenericBox<Long>());								
		test2(new GenericBox<Phone>());
		test2(new GenericBox<SmartPhone>());
		test2(new GenericBox<FeaturePhone>());	
		
//		test3(new GenericBox<String>());
		test3(new GenericBox<Integer>());							// Integer 부모 -> Number				
		test3(new GenericBox<Long>());								// Long 부모 -> Number
//		test3(new GenericBox<Phone>());
//		test3(new GenericBox<SmartPhone>());
//		test3(new GenericBox<FeaturePhone>());	
		
//		test4(new GenericBox<String>());
//		test4(new GenericBox<Integer>());										
//		test4(new GenericBox<Long>());								
		test4(new GenericBox<Phone>());
//		test4(new GenericBox<SmartPhone>());
		test4(new GenericBox<FeaturePhone>());						// FeaturePhone, 부모 Phone만 가능
		
		}	
	
	// GenericBox 객체의 타입파라미터가 무엇이든 상관없다.
	public static void test1(GenericBox<?> box) {	
		// <?> 타입 파라미터가 무엇이든 제한하지 않겠다 --> <?>
	}
	
	// GenericBox객체의 타입파라미터가 Phone이거나 Phone의 하위타입인 것만 전달 받을 수 있다.
	public static void test2(GenericBox<? extends Phone> box) {			// Phone 타입만 자식들만 허용 //상한 타입만 가능
		
	}
	
	// GenericBox객체의 타입파라미터가 Number거나 Number의 하위타입인것만 전달 받을 수 있다.
	public static void test3(GenericBox<? extends Number> box) {
	
	}
	
	// GenericBox객체의 타입파라미터가 FeaturePhone이거나 FeaturePhone의 상위타입인 것만 전달 받을 수 있다.
	public static void test4(GenericBox<? super FeaturePhone> box) {
		
	}	
	
	
}


