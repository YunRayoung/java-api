package sample02_system;

public class SystemApp {
	
	public static void main(String[] args) {
		
		String fileSepartor = System.getProperty("file.separator");
		System.out.println("폴더구분문자 -> " + fileSepartor);
		String lineSepartor = System.getProperty("line.separator");
		System.out.println("줄바꿈문자 -> " + lineSepartor);
		
		// 줄바꿈문자는 System.lineSeparator() 메소드를 실행해도 획득할 수 있다.
//		String LineSeparator = System.lineSeparator();
		
	}

}
