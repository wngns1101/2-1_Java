package week_15;

public class Product<T, M> {
	private T kind;
	private M model;
	
	public T getKind() {
		return kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
}

class Tv{
	public void tvPrn() {
		System.out.println("TV 종류");
	}
}
class Car{
	public void carPrn() {
		System.out.println("Car 종퓨");
	}
}
