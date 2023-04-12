package sample07_generic;

public class GenericBox<T> {		// 타입 파라미터 : T
	
	private T item;
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
}
