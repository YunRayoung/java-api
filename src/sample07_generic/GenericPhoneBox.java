package sample07_generic;

public class GenericPhoneBox <T extends Phone> {			// 폰종류만 들어가려고 하는 의도 스마트폰 피쳐폰
	private T item;
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	
	

}
