package sample04_wrapper;

public class WrapperApp22 {

	public static void main(String[] args) {
		// 오토언박싱
		
		@SuppressWarnings("deprcation")
		Integer x = new Integer(100);
		Integer y = new Integer(200);
		
		int a = x;	// x는 Integer객체를 참조하는 참조변수다. 
					// x의 주소값이 a에 저장되는것이 아니라, x가 참조하는 Wrapper객체의 
					// x.intValue() 메소드 실행결과가 a에 대입된다.
		int b = y;
		
		System.out.println(x + y);	// 300	// 실제실행되는 코드 -> s.o.p(x.intValue() + y.intValue());
		System.out.println(a + b);	// 300	
		
	}
}
